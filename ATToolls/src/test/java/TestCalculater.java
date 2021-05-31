import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCalculater {
    //sum
    @DataProvider
    public Object[][] positive() {
        return new Object[][]{
                {5, 6, 11, "+"}, {40, 50, 90, "+"},
                {66, 84, 150, "+"}
        };
    }

    @DataProvider
    public Object[][] negative() {
        return new Object[][]{
                {55, 2, "+"},
                {4, "58fa", "/"},
                {2, "qq", "*"},
                {"*", "*", "*"},
                {4, 2, "ff85"},
                {Double.MAX_VALUE, 40, '+'},
                {Double.MIN_VALUE, 40, '-'}
        };
    }

    @Test   //positive
    public void randomTestSmallNum() {
        String[] operators = new String[]{"+", "-", "*", "/"};
        for (int i = 0; i < 20; i++) {
            float a = randFloat(0, 50);
            float b = randFloat(1, 50);
            String op = operators[(int) randFloat(0, 3)];
            Assert.assertEquals(solution(a, b, op), new Calculater().calculate(a, b, op));
            System.out.println(a + " " + op + " " + b + " = " + solution(a, b, op));
        }
    }

    @Test   //positive
    public void randomTestBigNum() {
        String[] operators = new String[]{"+", "-", "*", "/"};
        for (int i = 0; i < 20; i++) {
            float a = randFloat(0, 9999);
            float b = randFloat(1, 9999);
            String op = operators[(int) randFloat(0, 3)];
            Assert.assertEquals(solution(a, b, op), new Calculater().calculate(a, b, op));
            System.out.println(a + " " + op + " " + b + " = " + solution(a, b, op));
        }
    }

    @Test(dataProvider = "positive")
    public void testPositive(float a, float b, float equals, String operator) {
        System.out.println(a + " " + operator + " " + b);
        Assert.assertEquals(equals, new Calculater().calculate(a, b, operator));
    }

    @Test(dataProvider = "negative", expectedExceptions = {ClassCastException.class,
            NullPointerException.class, AssertionError.class})
    public void testNegative(Object a, Object b, Object operator) {
        System.out.println(a + " " + operator + " " + b);
        Assert.assertFalse((Boolean) new Calculater().calculate( operator, a, b));
    }


    private static float randFloat(float min, float max) {
        return (float) (min + Math.random() * ((max - min) + 1));
    }

    private static float solution(float a, float b, String operator) {
        if (operator.equals("+"))
            return a + b;
        if (operator.equals("-"))
            return a - b;
        if (operator.equals("*"))
            return a * b;
        return a / b;
    }
}
