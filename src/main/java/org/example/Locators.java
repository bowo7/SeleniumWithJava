package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] arg) {

        //Open Browser
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        //Login dengan salah email
        driver.findElement(By.id("inputUsername")).sendKeys("gogon");
        driver.findElement(By.name("inputPassword")).sendKeys("OKEdsf");
        driver.findElement(By.className("signInBtn")).click();
        // jika ingin select by expath -> //tagname[@attribute='value']
        // Ex = //input[@placeholder='Username']
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        try {
            Thread.sleep(5000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace(); // Menampilkan error jika terjadi
        };
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Jono");
        WebElement Email =  driver.findElement(By.cssSelector("input[placeholder='Email']"));
        Email.sendKeys("jono@gmail.com");
        // driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
        //Cara Select XPath yang rapi
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("081231233");
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        // Login ulang
        driver.findElement(By.className("go-to-login-btn")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("signInBtn")).click();
        String message = driver.findElement(By.xpath("//p[contains(text(),'You are successfully logged in.')]")).getText();
        System.out.println(message);
    }
}
