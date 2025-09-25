package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.testng.Assert;

public class validateEnableElement {
    public static void main(String[]Arg)
    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // URL yang di tuju

        WebElement rbtnOneWay = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
        WebElement rbtnRoundTrip = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
        WebElement scDate = driver.findElement(By.id("ctl00_mainContent_view_date2"));

        // jika ingin memastikan button atau section itu disable , melalui html , caranya seperti berikut
        // System.out.println(scDate.isEnabled());
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
        rbtnRoundTrip.click();
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
        // Logik untuk menentukan benar atau tidak element Div1 enable
        if ((driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")))
        {
            System.out.println("it's Enables!");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
        driver.close();

    }
}
