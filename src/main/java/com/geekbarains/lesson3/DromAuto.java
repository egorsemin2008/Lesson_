package com.geekbarains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.sql.Driver;
import java.time.Duration;


public class DromAuto {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://bernina.store/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@href='/catalog/shitye-kvilting-vyshivanie/']")).click();
        driver.findElement(By.xpath("//*[@class='range-input__min']")).sendKeys("150000");
        driver.findElement(By.xpath("//*[@class='goods-filter__checkbox']")).click();
        driver.findElement(By.xpath("//input[@id='arrFilterCatalog_48_19156569']")).click();
        driver.findElement(By.xpath("//div[@class='goods-filter__checkbox']//input[@id='arrFilterCatalog_221_3853834926']")).click();
        driver.findElement(By.xpath("//div[@class='goods-filter__checkbox']//input[@id='arrFilterCatalog_172_2215960007']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='set_filter']")).click();
        driver.findElement(By.xpath("//a[@class='goods__content-link']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='bx_117848907_41057_compare_link']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='btn btn-default btn-buy btn-sm undefined']")).click();
        Thread.sleep(5000);
        driver.quit();























    }
}
