package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class testCheckbox {
    public static void main(String[] args) throws InterruptedException {

        // 1. Setup Firefox
        WebDriver driver = new FirefoxDriver();

        // 2. Buka URL
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        // 3. Ambil element checkbox pertama (Option1)
        WebElement firstCheckbox = driver.findElement(By.id("checkBoxOption1"));

        // === STEP 1 : Check & Uncheck ===

        // Klik checkbox untuk check
        firstCheckbox.click();
        // Verifikasi apakah checkbox sudah checked
        if (firstCheckbox.isSelected()) {
            System.out.println("✅ Checkbox pertama berhasil di-check");
        } else {
            System.out.println("❌ Checkbox pertama GAGAL di-check");
        }

        Thread.sleep(1000); // hanya untuk demo, sebaiknya gunakan WebDriverWait

        // Klik lagi untuk uncheck
        firstCheckbox.click();
        // Verifikasi apakah checkbox sudah unchecked
        if (!firstCheckbox.isSelected()) {
            System.out.println("✅ Checkbox pertama berhasil di-uncheck");
        } else {
            System.out.println("❌ Checkbox pertama GAGAL di-uncheck");
        }

        // === STEP 2 : Hitung jumlah checkbox ===

        // Cari semua checkbox yang memiliki type='checkbox'
        List<WebElement> allCheckboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println("🔢 Jumlah checkbox di halaman: " + allCheckboxes.size());

        // 4. Tutup browser
        driver.quit();
    }
}
