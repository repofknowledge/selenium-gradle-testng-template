package com.repofknowledge.tests;

import com.repofknowledge.pages.project.LoginPage;
import com.repofknowledge.utilities.DriverManager;
import org.testng.annotations.Test;

public class TC001 extends DriverManager {

    LoginPage loginPage = new LoginPage();

    @Test(groups = {"regression1"})
    public void tc001() {
        System.out.println("you are inthe test");
       loginPage.loginToApplication();
    }

    @Test(groups = {"smoke"})
    public void tc002() {
        System.out.println("you are inthe test");
        loginPage.loginToApplication();
 }

    @Test(groups = {"smoke"})
    public void tc003() {
        System.out.println("you are inthe test 3");
        loginPage.loginToApplication();
    }

}
