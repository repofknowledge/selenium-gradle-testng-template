package com.repofknowledge.utilities;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.ConcurrentHashMap;

public class TestUtility {

    public static ConcurrentHashMap<Long, WebDriver> driverMap = new ConcurrentHashMap<Long, WebDriver>();
}
