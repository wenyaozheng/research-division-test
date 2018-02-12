/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.researchandrecords;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import pages.researchandrecords.OrdinancePage;
import pages.researchandrecords.ResolutionPage;
import utilities.DriverInstance;

/**
 *
 * @author Dell
 */
public class ResolutionTest {

    private WebDriver driver;

    public ResolutionTest() {
    }

    @Before
    public void setUp() {
        driver = DriverInstance.getInstance();
    }

    @Test
    public void addResolution() {
        // Go to root 
        driver.get("http://localhost:8000/login");
//        // Click the login button
//        driver.findElement(By.linkText("Login")).click();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login("admin@example.com", "password");

        ResolutionPage addNewResoPage = PageFactory.initElements(driver, ResolutionPage.class);
        addNewResoPage.addNewResolution("2", "2018", "Ordinance number 2", "ordinance");
        driver.close();
    }

//    @Test
//    public void viewResolution() {
//        // Go to root 
//        driver.get("http://localhost:8000/login");
////        // Click the login button
////        driver.findElement(By.linkText("Login")).click();
//
//        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
//        loginPage.login("admin@example.com", "password");
//
//        ResolutionPage viewResoPage = PageFactory.initElements(driver, ResolutionPage.class);
//        viewResoPage.viewResolution();
//        driver.close();
//    }
//
////    @Test
////    public void deleteOrdinace() {
////        // Go to root 
////        driver.get("http://localhost:8000/login");
//////        // Click the login button
//////        driver.findElement(By.linkText("Login")).click();
////
////        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
////        loginPage.login("admin@example.com", "password");
////
////        ResolutionPage deleteResoPage = PageFactory.initElements(driver, ResolutionPage.class);
////        deleteResoPage.deleteResolution();
////        driver.close ();
////    }
//
//    @Test
//    public void editResolution() {
//        // Go to root 
//        driver.get("http://localhost:8000/login");
////        // Click the login button
////        driver.findElement(By.linkText("Login")).click();
//
//        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
//        loginPage.login("admin@example.com", "password");
//        
//        ResolutionPage editResoPage = PageFactory.initElements(driver, ResolutionPage.class);
//        editResoPage.editResolution("234");
//        driver.close();
//    }
//
//    @Test
//    public void sortTable() {
//        // Go to root 
//        driver.get("http://localhost:8000/login");
////        // Click the login button
////        driver.findElement(By.linkText("Login")).click();
//
//        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
//        loginPage.login("admin@example.com", "password");
//
//        ResolutionPage sortTablePage = PageFactory.initElements(driver, ResolutionPage.class);
//        sortTablePage.tableSorting();
//        driver.close();
//    }
//
//    @Test
//    public void resetFilter() {
//        // Go to root 
//        driver.get("http://localhost:8000/login");
////        // Click the login button
////        driver.findElement(By.linkText("Login")).click();
//
//        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
//        loginPage.login("admin@example.com", "password");
//
//        ResolutionPage resetFilterPage = PageFactory.initElements(driver, ResolutionPage.class);
//        resetFilterPage.resetFiltering();
//        driver.close();
//    }
//
//    @Test
//    public void search() {
//        // Go to root 
//        driver.get("http://localhost:8000/login");
////        // Click the login button
////        driver.findElement(By.linkText("Login")).click();
//
//        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
//        loginPage.login("admin@example.com", "password");
//
//        ResolutionPage searchPage = PageFactory.initElements(driver, ResolutionPage.class);
//        searchPage.searchFunction("1");
//        driver.close();
//    }
}
