package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //enhanced way


      // add WebDriverManager-download chromedriver exe file
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

      // go to walmart/ amazon
        driver.get("file:///C:/Java/Selenium/sit.skyschooling/index.html");

        //write camera in search box
        WebElement searchBoxElement = driver.findElement(By.name("field-keyboards"));
        searchBoxElement.sendKeys("camera");

        //click on search box
        WebElement searchButtonElement= driver.findElement(By.id("nav-search-submit-button"));
        searchButtonElement.click();











        }
    }
