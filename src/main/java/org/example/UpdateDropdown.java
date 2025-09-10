package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpdateDropdown {
    public static void main(String[] Args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/"); // URL yang di tuju
        driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
        Thread.sleep(5000);
        // Kita akan coba klik 4 kali di Adult-testID-plus-one-cta menggunakan perulangan

        // INI MENGGUNAKAN WHILE
        /* int i = 1;
        while(i<5)
        {
            driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
            i++;
        }*/

        // INI MENGGUNAKAN FOR
        for(int i=1;i<5;i++)
        {
            driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
        }
        System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());

        driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();

    }
}
