package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDotCom {
    public static void main(String[] args) {
        // add WebDriverManager-download chromedriver exe file
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        // go to walmart/ amazon
        driver.get("https://amazon.com");

        //write camera in search box
        WebElement searchBoxElement = driver.findElement(By.id("twotabsearchtextbox"));
        searchBoxElement.sendKeys("camera");

        //click on search box
        WebElement searchButtonElement= driver.findElement(By.id("nav-search-submit-button"));
        searchButtonElement.click();
    }
}
