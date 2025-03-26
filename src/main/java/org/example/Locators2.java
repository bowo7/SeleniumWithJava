package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators2 {
    public static void main(String[] arg) {

        String userName = "rahul";
        String password = "rahulshettyacademy";

        //Login dan Logout
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(userName);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        };
        System.out.println(driver.findElement(By.tagName("p")).getText());
//        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
//        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2"))
//                .getText(),"Hello " +userName+",");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.className("logout-btn")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        };
        driver.close();

    }
}
