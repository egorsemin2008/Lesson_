package com.geekbarains.lesson3;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class DiaryTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://diary.ru");
        driver.findElement(By.xpath("//*[@class=\"i-lock\"]")).click();
        driver.findElement(By.id("loginform-username")).sendKeys("123456789");
        driver.findElement(By.id("loginform-password")).sendKeys("123456789");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title=\"reCAPTCHA\"]")));
        driver.findElement(By.xpath("//div[@class = 'recaptcha-checkbox-border']")).click();
        driver.switchTo().parentFrame();

        driver.findElement(By.id("login_btn")).click();

        Thread.sleep(5000);
        driver.quit();





    }
}
