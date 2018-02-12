/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.researchandrecords;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import pages.researchandrecords.OrdinancePage;
import utilities.DriverInstance;

/**
 *
 * @author Dell
 */
public class OrdinanceTest {

    private WebDriver driver;

    public OrdinanceTest() {
    }

    @Before
    public void setUp() {
        driver = DriverInstance.getInstance();
    }

    @Test
    public void addOrdinace() {
        // Go to root 
        driver.get("http://localhost:8000/login");
//        // Click the login button
//        driver.findElement(By.linkText("Login")).click();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login("admin@example.com", "password");

        OrdinancePage addNewOrdPage = PageFactory.initElements(driver, OrdinancePage.class);
        addNewOrdPage.addNewOrdinance("2", "2018", "Ordinance number 2", "ordinance");
        driver.close();
    }

    @Test
    public void viewOrdinace() {
        // Go to root 
        driver.get("http://localhost:8000/login");
//        // Click the login button
//        driver.findElement(By.linkText("Login")).click();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login("admin@example.com", "password");

        OrdinancePage viewOrdPage = PageFactory.initElements(driver, OrdinancePage.class);
        viewOrdPage.viewOrdinance();
        driver.close();
    }

//    @Test
//    public void deleteOrdinace() {
//        // Go to root 
//        driver.get("http://localhost:8000/login");
////        // Click the login button
////        driver.findElement(By.linkText("Login")).click();
//
//        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
//        loginPage.login("admin@example.com", "password");
//
//        OrdinancePage deleteOrdPage = PageFactory.initElements(driver, OrdinancePage.class);
//        deleteOrdPage.deleteOrdinance();
//        driver.close();
//    }
    @Test
    public void editOrdinace() {
        // Go to root 
        driver.get("http://localhost:8000/login");
//        // Click the login button
//        driver.findElement(By.linkText("Login")).click();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login("admin@example.com", "password");

        OrdinancePage editOrdPage = PageFactory.initElements(driver, OrdinancePage.class);
        editOrdPage.editOrdinance("12");
        driver.close();
    }
    
     @Test
    public void sortTable() {
        // Go to root 
        driver.get("http://localhost:8000/login");
//        // Click the login button
//        driver.findElement(By.linkText("Login")).click();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login("admin@example.com", "password");

        OrdinancePage sortTablePage = PageFactory.initElements(driver, OrdinancePage.class);
        sortTablePage.tableSorting();
        driver.close();
    }
    
    @Test
    public void resetFilter() {
        // Go to root 
        driver.get("http://localhost:8000/login");
//        // Click the login button
//        driver.findElement(By.linkText("Login")).click();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login("admin@example.com", "password");

        OrdinancePage resetFilterPage = PageFactory.initElements(driver, OrdinancePage.class);
        resetFilterPage.resetFiltering();
        driver.close();
    }
    
     @Test
    public void search() {
        // Go to root 
        driver.get("http://localhost:8000/login");
//        // Click the login button
//        driver.findElement(By.linkText("Login")).click();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login("admin@example.com", "password");

        OrdinancePage searchPage = PageFactory.initElements(driver, OrdinancePage.class);
        searchPage.searchFunction("1");
        driver.close();
    }
}
