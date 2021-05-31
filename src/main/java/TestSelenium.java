import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class TestSelenium {
    public static void main(String[] args) {

        String category = "Оргтехника и расходники";
        CharSequence search = "принтер";
        CharSequence city = "Владивосток";
        String filter = "Дороже";
        int num = 5;

        System.setProperty("B:\\SeleniumAndAllure\\chromedriver.exe", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait webDriverWait = new WebDriverWait(driver, 2);
        driver.get("https://www.avito.ru/");
        driver.manage().window().maximize();

        new Select(driver.findElement(By.xpath("//select[@name=\"category_id\"]")))
                .selectByVisibleText(category);

        driver.findElement(By.xpath("//label[@class='input-layout-input-layout-eKhsI input-layout-size-s-UjNk6 input-layout-text-align-left-IDAPR width-width-12-2VZLz suggest-input-1dvep js-react-suggest']"))
                .sendKeys(search);


        driver.findElement(By.xpath("//div[@class=\"main-text-2PaZG\"]")).click();
        driver.findElement(By.xpath("//div[@data-marker=\"popup-location/region\"]//input"))
                .sendKeys(city);
        webDriverWait.until(presenceOfElementLocated(
                By.xpath("//ul[@class=\"suggest-suggests-bMAdj\"]//li[@data-marker=\"suggest(0)\"]" +
                        "//*[contains(text(),'" + city + "')]"))).click();
        driver.findElement(By.xpath("//button[@data-marker=\"popup-location/save-button\"]"))
                .click();
        WebElement checkbox = driver.findElement(
                By.xpath("//label[@data-marker=\"delivery-filter\"]"));
        if (checkbox.isEnabled()) {
            checkbox.click();
            driver.findElement(By.xpath("//button[@data-marker=\"search-filters/submit-button\"]")).click();
        }


        new Select(driver.findElement(By.xpath("//div[@class=\"" +
                "sort-select-3QxXG select-select-box-3LBfK select-size-s-2gvAy\"]//select")))
                .selectByVisibleText(filter);


        List<WebElement> webElements = driver.findElements(
                By.xpath("//div[@data-marker=\"catalog-serp\"]/div[@data-marker=\"item\"]"));
        for (int i = 0; i < num; i++) {
            System.out.println(webElements.get(i).findElement(By.xpath(".//h3[@itemprop=\"name\"]"))
                    .getText());
            System.out.println(webElements.get(i).findElement(By.xpath(".//meta[@itemprop=\"price\"]"))
                    .getAttribute("content") + " RUB");
        }


        driver.quit();

    }
}
