package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.AbstractSet;

public class Locators2 {

    public static class Locators {
        public static void main(String[] arg) {
            //variable penampung
            String name = "Bowo";
            String password = "rahulshettyacademy";
            //Open Browser
            WebDriver driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            password =  getPassword(driver); // ini memanggil method yang dibawah
            driver.get("https://rahulshettyacademy.com/locatorspractice/");
            //Login dengan valid user
            driver.findElement(By.id("inputUsername")).sendKeys(name);
            driver.findElement(By.name("inputPassword")).sendKeys(password);
            driver.findElement(By.className("signInBtn")).click();
            try {
                Thread.sleep(5000); // Jeda selama 5 detik
            } catch (InterruptedException e) {
                e.printStackTrace(); // Menampilkan error jika terjadi
            };
            System.out.println(driver.findElement(By.tagName("p")).getText());
            Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in." );
            WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10)); // Set maximum wait time to 10 seconds
            Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello "+ name+",");
            driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
            driver.close();
        }
        public static String getPassword(WebDriver driver)
        {
            driver.get("https://rahulshettyacademy.com/locatorspractice/");
            driver.findElement(By.linkText("Forgot your password?")).click();
            try {
                Thread.sleep(5000); // Jeda selama 5 detik
            } catch (InterruptedException e) {
                e.printStackTrace(); // Menampilkan error jika terjadi
            };
            driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
            // Mari convert text menjadi variable sehingga bisa menjadi dinamis
            String passwordText = driver.findElement(By.cssSelector("form p")).getText();
            // kita akan pecah text berikut menjadi indexing -> Please use temporary password 'rahulshettyacademy' to Login.
            passwordText.split("'");
            // disini index [0] pertama adalah Please use temporary password
            // index kedua [1] adalah rahulshettyacademy
            // index ketiga [2] adalah to Login.
            String [] passwordArray = passwordText.split("'");
            String password = passwordArray[1].split("'")[0];
            return password;
        };
    }
};
