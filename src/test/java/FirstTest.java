import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FirstTest {


@Test
    public void firstTest() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://igamingnext.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement search = driver.findElement(By.xpath("/html/body/header/div[1]/div/div[2]/button[1]"));
        search.click();
        WebElement input = driver.findElement(By.xpath("//*[@id=\"search_input\"]"));
       input.sendKeys("fast");

    System.out.println("Test pass");




    }
}
