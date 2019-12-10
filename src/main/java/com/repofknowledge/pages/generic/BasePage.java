package com.repofknowledge.pages.generic;

import com.repofknowledge.utilities.DriverManager;
import com.repofknowledge.utilities.TestUtility;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;


public class BasePage{

    public static final Logger LOGGER = Logger.getLogger(BasePage.class);
    public WebDriver getDriver() {
        return TestUtility.driverMap.get(Thread.currentThread().getId());
    }

    public void getURL(String url) {
        try{
            LOGGER.info("before getURL with URL:: " + url);
            getDriver().get(url);
            LOGGER.info("after getURL with URL:: " + url);
        } catch(WebDriverException e) {
            LOGGER.info("There was an exception when entered url and the exception is " + e.getMessage());
        }

    }
    public void enterText(By locator, String textToEnter) {
        try{
            LOGGER.info("before enterText with text:: " + textToEnter);
            getDriver().findElement(locator).sendKeys(textToEnter);
            LOGGER.info("after enterText with text:: " + textToEnter);
        } catch(WebDriverException e) {
            LOGGER.info("There was an exception when entered text and the exception is " + e.getMessage());
        }

    }
}
