package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class UpdateDropdown {
    public static void main(String[] Args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // URL yang di tuju
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        // driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        driver.findElement(By.xpath("//td[@data-month='4' and @data-year='2019']/a[text()='15']\n")).click();
//
        Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        System.out.println(driver.findElements(By.cssSelector("input[type$='checkbox']")).size());
        driver.close();
        // Kita akan coba klik 4 kali di Adult-testID-plus-one-cta menggunakan perulangan

        // INI MENGGUNAKAN WHILE
        /* int i = 1;
        while(i<5)
        {
            driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
            i++;
        }*/

        // INI MENGGUNAKAN FOR
//        for(int i=1;i<2;i++)
//        {
//            driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
//        }
//        System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
//
//        driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
        // Assert.fail();
    }
}
