package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class DropdownJava {
    public static void main(String [] Args ) throws InterruptedException {
        // Saat ini kita akan mencoba Dinamis dropdownlist
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/"); // URL yang di tuju
        // Kota Asal
        WebElement fromField = driver.findElement(By.xpath("//div[text()='From']"));
        fromField.click();
        WebElement fromCity = driver.findElement(By.xpath("//div[text()='Agartala']"));
        fromCity.click();
        // Kota TUJUAN
        Thread.sleep(5000);
        WebElement toCity = driver.findElement(By.xpath("//div[text()='Pune']"));
        toCity.click();
        //SELECT TANGGAL

    }
}
