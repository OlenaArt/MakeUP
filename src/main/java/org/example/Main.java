package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

        public void firstTest() {
            WebDriver driver = new ChromeDriver();

            driver.get("https://makeup.com.ua/ua/");
            WebElement MakeUp = driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div[2]/ul[1]/li[4]/a"));
            MakeUp.click();


        }

}