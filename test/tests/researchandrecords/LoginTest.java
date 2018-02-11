package tests.researchandrecords;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import utilities.DriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import pages.researchandrecords.HomePage;

public class LoginTest {

    private WebDriver driver;

    public LoginTest() {
    }

    @Before
    public void setUp() {
        driver = DriverInstance.getInstance();
    }

    @Test
    public void login() {
        // Go to root 
        driver.get("http://localhost:8000/login");
//        // Click the login button
//        driver.findElement(By.linkText("Login")).click();

        // Login Page
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login("admin@example.com", "password");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        assertEquals("ResearchDivision", homePage.getHeader());
        driver.close();
    }

    /**
     * Test with invalid email and password
     */
    @Test
    public void loginInvalidCredentials() {
        //Go to root
        driver.get("http://localhost:8000/login");
//        // Click the Login Button
//        driver.findElement(By.linkText("Login")).click();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login("admin@example.com", "wrongpassword");
        assertEquals("These credentials do not match our records.", loginPage.getErrorMessage());
        driver.close();
    }

    /**
     * Test on forgot password link
     */
    @Test
    public void forgotPassword() {
        driver.get("http://localhost:8000/login");
//      // Click the Login Button
//      driver.findElement(By.linkText("Login")).click();
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.forgotPassword();
        driver.close();
    }
}
