import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCalculater {
    //sum
    @DataProvider
    public Object[][] positive() {
        return new Object[][]{
                {5, 6, 11, '+'}, {40, 50, 90, '+'},
                {66, 84, 150, '+'}
        };
    }

    @DataProvider
    public Object[][] negative() {
        return new Object[][]{
                {6, 18, '+'}, {47, 5, 90, '+'},
                {8, 11, '+'},
                {Float.MAX_VALUE, 40, '+'},
                {Float.MIN_VALUE, 40, '-'}
        };
    }

    @Test(dataProvider = "positive")
    public void testPositive(float first, float second, float equals, char action) {
        Assert.assertEquals(equals, new Calculater().calculate(first, second, action));
    }

    @Test(dataProvider = "negative", expectedExceptions = {ClassCastException.class,
            NullPointerException.class, AssertionError.class})
    public void testNegative(Object first, Object second, Object action) {
        Assert.assertFalse((Boolean) new Calculater().calculate(first, second, action));
    }
}
