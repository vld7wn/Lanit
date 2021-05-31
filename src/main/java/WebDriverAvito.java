import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class WebDriverAvito {
    private final WebDriverWait webDriverWait;
    private final ChromeDriver driver;

    public WebDriverAvito() {
        System.setProperty("B:\\SeleniumAndAllure\\chromedriver.exe", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        this.driver = new ChromeDriver();
        this.webDriverWait = new WebDriverWait(driver, 5);
    }

    @Step
    public void getURL() {
        driver.get("https://avito.ru/");
        //driver.manage().window().maximize();
    }

    @Step
    public void Category(String category) {
        new Select(driver.findElement(By.xpath("//select[@name=\"category_id\"]"))).selectByVisibleText(category);
    }

    @Step
    public void Search(CharSequence search) {
        driver.findElement(By.xpath("//label[@class='input-layout-input-layout-eKhsI input-layout-size-s-UjNk6 " +
                "input-layout-text-align-left-IDAPR width-width-12-2VZLz suggest-input-1dvep js-react-suggest']"))
                .sendKeys(search);
    }

    @Step
    public void City(CharSequence city) {
        driver.findElement(By.xpath("//div[@class=\"main-text-2PaZG\"]")).click();
        driver.findElement(By.xpath("//div[@data-marker=\"popup-location/region\"]//input")).sendKeys(city);
        webDriverWait.until(presenceOfElementLocated(By.xpath("//ul[@class=\"suggest-suggests-bMAdj\"]//li[@data-marker=\"suggest(0)\"]" +
                "//*[contains(text(),'" + city + "')]"))).click();
        driver.findElement(By.xpath("//button[@data-marker=\"popup-location/save-button\"]")).click();
        WebElement checkbox = driver.findElement(
                By.xpath("//label[@data-marker=\"delivery-filter\"]"));
        if (checkbox.isEnabled()) {
            checkbox.click();
            driver.findElement(By.xpath("//button[@data-marker=\"search-filters/submit-button\"]")).click();
        }
    }

    @Step
    public void filter(String filter) {
        new Select(driver.findElement(By.xpath("//div[@class=\"" +
                "sort-select-3QxXG select-select-box-3LBfK select-size-s-2gvAy\"]//select")))
                .selectByVisibleText(filter);
    }

    @Step
    public void nameCost3(int num) {
        List<WebElement> webElements = driver.findElements(
                By.xpath("//div[@data-marker=\"catalog-serp\"]/div[@data-marker=\"item\"]"));
        for (int i = 0; i < num; i++) {
            System.out.println(webElements.get(i).findElement(By.xpath(".//h3[@itemprop=\"name\"]"))
                    .getText());
            System.out.println(webElements.get(i).findElement(By.xpath(".//meta[@itemprop=\"price\"]"))
                    .getAttribute("content") + " рублей");
        }
    }

    @Step
    public void quit() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
