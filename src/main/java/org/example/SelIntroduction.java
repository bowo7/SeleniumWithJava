package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Membuat test case mengecek tittle pada page
public class SelIntroduction {
    public static void main (String[] args){
        //System.setProperty("webdriver.chrome.drive","C:\\Users\\ASUS\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        // Jika menggunakan Firefox bisa install dulu Gecko driver jika tidak bisa di run download dulu lalu cari path nya
        // Cara install Gecko driver System.setProperty("webdriver.gecko.drive","C:\\Users\\ASUS\\Documents\\Driver\\geckodriver.exe");
        // Jika di Edge juga sama saja , tinggal panggil saja EdgeDriver nya

        //Firefox
        WebDriver driver = new FirefoxDriver();

//        //Chrome
//        WebDriver driver1 = new ChromeDriver();

//       // Edge
//        WebDriver driver2 = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
