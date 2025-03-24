package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] arg) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("gogon");
        driver.findElement(By.name("inputPassword")).sendKeys("OKEdsf");
        driver.findElement(By.className("signInBtn")).click();
        // jika ingin select by expath -> //tagname[@attribute='value']
        // Ex = //input[@placeholder='Username']
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Jono");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jono@gmail.com");
        // driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
        //Cara Select XPath yang rapi
        WebElement InputPhoneNumber =  driver.findElement(By.xpath("input[placeholder='Phone Number']"));
        InputPhoneNumber.sendKeys("0856344");
        driver.findElement(By.className("Reset")).click();

    }
}
