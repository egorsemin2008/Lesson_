package com.geekbarains.lesson3;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumBrowserExamples {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("user-agent=Googlecot/2.1 (+http://www.google.com/bot.html)");
        chromeOptions.addArguments("--headless");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        driver.quit();


    }
}
