package com.repofknowledge.pages.project;

import com.repofknowledge.pages.generic.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private final By searchBox = By.name("q");

    public void loginToApplication() {
        getURL("http://google.com");
        enterText(searchBox, "Ram");
    }

}
