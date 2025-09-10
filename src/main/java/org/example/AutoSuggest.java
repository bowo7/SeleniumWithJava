package org.example;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggest {
    public static void main(String [] Args ) throws InterruptedException {
        WebDriver driver = new FirefoxDriver() ;
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        // Kita akan buat untuk select autosuggest di search field
        // kita buat local variable dulu berupa list dan jangan lupa import library list nya di atas
        driver.findElement(By.id("autosuggest")).sendKeys("Ind");
        Thread.sleep(5000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for (WebElement option : options)
        {
            if (option.getText().equalsIgnoreCase("Indonesia"))
            {
                option.click();
                break;
            }
        }

    }
}
