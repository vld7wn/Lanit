import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WebDriverAvitoTest {
    private WebDriverAvito step;
    private WebDriver driver;

    private final String category = "Оргтехника и расходники";
    private final String search = "принтер";
    private final String city = "Владивосток";
    private final String sort = "Дороже";
    private final int num = 5;


    @DataProvider
    public static Object[][] provider() {
        return new Object[][]{
                {"Оргтехника и расходники", "принтер", "Владивосток", "Дороже", 3},
                {"Настольные компьютеры", "игровой пк", "Москва", "Дешевле", 5},
                {"Настольные компьютеры", "игровой пк", "Москва", "Дороже", 10}
        };
    }

    @BeforeMethod
    public void setUp() {
        step = new WebDriverAvito();
        driver = step.getDriver();
    }

    @Test
    public void category() {
        step.getURL();
        step.Category(category);
    }

    @Test
    public void search() {
        step.getURL();
        step.Category(category);
        step.Search(search);
    }

    @Test
    public void searchCity() {
        step.getURL();
        step.Category(category);
        step.Search(search);
        step.City(city);
    }

    @Test
    public void filter() {
        step.getURL();
        step.Category(category);
        step.Search(search);
        step.City(city);
        step.filter(sort);
    }

    @Test(dataProvider = "provider")
    public void nC3(String category, String search, String city, String sort, int num) {
        step.getURL();
        step.Category(category);
        step.Search(search);
        step.City(city);
        step.filter(sort);
        step.nameCost3(num);
    }

}
