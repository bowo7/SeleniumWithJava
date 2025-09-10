package org.example;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class Helper {
    public static void openUrl(WebDriver driver, String url) {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }
    public static void closeBrowser(WebDriver driver) {
        driver.quit();
    }
    public static void clickElement(WebElement element) {
        element.click();
    }

    public static void setText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public static String getText(WebElement element) {
        return element.getText();
//    }
//    public static WebElement waitForElementVisible(WebDriver driver, By locator, int timeout) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//    }
//    public static <Select> void selectByText(WebElement element, String text) {
//        Select select = new Select(element);
//        select.selectByVisibleText(text);
//    }
//    public static void takeScreenshot(WebDriver driver, String fileName) throws IOException {
//        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(src, new File("./screenshots/" + fileName + ".png"));
    }




}
