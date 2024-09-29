package com.delhivery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
public class happyFlow {
       
        public static void main(String[] args) {
            // Set up WebDriver
            System.setProperty("webdriver.chrome.driver", "/home/delhivery/git/SeleniumUIAutomationFramework/src/test/resources/drivers/chromedriver");
            WebDriver driver = new ChromeDriver();

            // Navigate to URL
            driver.get("https://www.amazon.com/");

            // Assert URL
            String expectedUrl = "https://www.amazon.com/";
            String actualUrl = driver.getCurrentUrl();
            assertEquals(actualUrl, expectedUrl, "URLs do not match");

            // Close the browser
            driver.quit();
        }
    }

