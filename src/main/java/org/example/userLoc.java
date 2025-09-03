package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators2 {
    public static void main(String[] arg) throws InterruptedException {
        Locators locators = new Locators();
//        locators.

        Users user1 = new Users("tes", "asd");
        Users user2 = new Users("tes", "asd");

        driver(user1.getUsername(), user1.getPassword());
        driver(user2.getUsername(), user2.getPassword());

        //Login dan Logout
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        String password = getPassword(driver);
//        driver.get("https://rahulshettyacademy.com/locatorspractice/");
//        driver.findElement(By.id("inputUsername")).sendKeys(userName);
//        driver.findElement(By.name("inputPassword")).sendKeys(password);
//        driver.findElement(By.className("signInBtn")).click();
//        Thread.sleep(5000);
//        System.out.println(driver.findElement(By.tagName("p")).getText());
//        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
//        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2"))
//                .getText(),"Hello " +userName+",");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.findElement(By.className("logout-btn")).click();
//        Thread.sleep(5000);
//        driver.close();

    }

    public static void driver(String userName, String password) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(userName);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.className("logout-btn")).click();
        Thread.sleep(5000);
        driver.close();
    }

    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();
        String[] passwordArray = passwordText.split("'");
//        String[] passwordArray2 = passwordArray[1].split("'");
//        passwordArray2[0]
        String password = passwordArray[1].split("'")[0];
        return password;
    }

}
