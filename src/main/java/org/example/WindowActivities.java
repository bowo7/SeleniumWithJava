package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowActivities {
    public static void main(String[] Args)
    // Untuk Autogenerate method sub
    // Script ini digunakan jika kita ingin menavigasi ke spesifik url

    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
        //jika ingin kembali ke google . com maka gunakan back seperti ini
        // driver.navigate().back();
        // driver.navigate().forward();
        // Selanjutnya kita akan coba Select dropdown list terlebih dahulu dengan tag
        // kita buat dulu objeknya seberti berikut lalu di bungkus dengan kelas bawaan selenium -> Select
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        // Berikut beberapa cara select valuenya,
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText()+" Ini Berhasil terselect Pertama");
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText()+" Ini Berhasil terselect Kedua");
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText()+" Ini Berhasil terselect Ketiga");
        // driver.close();

    }
}
