package com.repofknowledge.utilities;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class DriverManager {

    public final static Logger LOGGER = Logger.getLogger(DriverManager.class);

    @BeforeMethod(alwaysRun=true)
    public void createDriverInstance() {
        String browserToLaunch = System.getProperty("browser");
        WebDriver driver = null;

        if(browserToLaunch.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-extensions");
            driver = new ChromeDriver(options);
            LOGGER.info("Chrome Browser is Launched");
            driver.manage().deleteAllCookies();


        }
        Long threadID = Thread.currentThread().getId();
        TestUtility.driverMap.put(threadID, driver);

    }

    public WebDriver getDriver() {
        Long threadID = Thread.currentThread().getId();
        return TestUtility.driverMap.get(threadID);
    }

    public void quitDriver() {
        WebDriver driver = getDriver();
        if(driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
