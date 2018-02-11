/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.buyers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import pages.buyers.BuyerChangePasswordPage;
import utilities.DriverInstance;

/**
 *
 * @author Dell
 */
public class BuyerChangePasswordTest {

    private WebDriver driver;

    public BuyerChangePasswordTest() {
    }

    @Before
    public void setUp() {
        driver = DriverInstance.getInstance();
    }

    @Test
    public void changePassword() {
        // Go to root 
        driver.get("http://localhost:8000");
        // Click the login button
        driver.findElement(By.linkText("Login")).click();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login("buyer1@gmail.com", "password1");

        driver.findElement(By.cssSelector("#accountDropDown")).click();
        driver.findElement(By.cssSelector("#menu-top > li.dropdown.open > ul > li:nth-child(1) > a")).click();
        // Change Password
        BuyerChangePasswordPage changePasswordPage = PageFactory.initElements(driver, BuyerChangePasswordPage.class);
        changePasswordPage.changePassword("password", "password2", "password2");
        //How to check if success notif is correct
        assertEquals("Sucess!...", changePasswordPage.getErrorMessage());
        driver.close();
    }

    @Test
    public void invalidChangePassword() {
        // Go to root 
        driver.get("http://localhost:8000");
        // Click the login button
        driver.findElement(By.linkText("Login")).click();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login("buyer1@gmail.com", "password1");

        driver.findElement(By.cssSelector("#accountDropDown")).click();
        driver.findElement(By.cssSelector("#menu-top > li.dropdown.open > ul > li:nth-child(1) > a")).click();
        // Change Password
        BuyerChangePasswordPage changePasswordPage = PageFactory.initElements(driver, BuyerChangePasswordPage.class);
        changePasswordPage.changePassword("password2", "password1", "passwords");
        //How to check if error message is correct?
        driver.close();
    }
}
