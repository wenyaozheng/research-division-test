/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages.researchandrecords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 *
 * @author Dell
 */
public class ResolutionPage {

    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "/html/body/div/aside[1]/div/section/ul[2]/li[3]/a")
    private WebElement rnrBtn;
    @FindBy(how = How.XPATH, using = "/html/body/div/aside[1]/div/section/ul[2]/li[3]/ul/li[2]/a")
    private WebElement resolutionsBtn;
    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/section/div/div/div[2]/div[1]/a[1]")
    private WebElement addNewResolutionBtn;
    @FindBy(how = How.LINK_TEXT, using = "Reset Filtering")
    private WebElement resetFilteringBtn;
    @FindBy(how = How.NAME, using = "number")
    private WebElement number;
    @FindBy(how = How.NAME, using = "series")
    private WebElement series;
    @FindBy(how = How.NAME, using = "title")
    private WebElement title;
    @FindBy(how = How.NAME, using = "keywords")
    private WebElement keywords;
    @FindBy(how = How.NAME, using = "pdf")
    private WebElement pdfUploadBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"resolutionsForm\"]/div[2]/button")
    private WebElement createBtn;
    @FindBy(how = How.LINK_TEXT, using = "View")
    private WebElement viewOrdBtn;
    @FindBy(how = How.LINK_TEXT, using = "Edit")
    private WebElement editOrdBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"resolutionsForm\"]/div[2]/button")
    private WebElement updateBtn;
    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/section/div/div/div[2]/table/tbody/tr[1]/td[5]/form/button")
    private WebElement deleteOrdBtn;
    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/section/div/div/div[2]/table/thead/tr/th[1]/a")
    private WebElement sortTableBtn;
    @FindBy(how = How.NAME, using = "q")
    private WebElement searchTextBoxBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"search-btn\"]/i")
    private WebElement searchBtn;

    public ResolutionPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Receives user input to create a new ordinance
     *
     *
     * @param ordNum
     * @param seriesNum
     * @param title
     * @param keyWords
     */
    public void addNewResolution(String ordNum, String seriesNum, String title, String keyWords) {
        this.rnrBtn.click();
        this.resolutionsBtn.click();
        this.addNewResolutionBtn.click();
        this.number.sendKeys(ordNum);
        this.series.sendKeys(seriesNum);
        this.title.sendKeys(title);
        this.keywords.sendKeys(keyWords);
        this.pdfUploadBtn.click();
        this.createBtn.click();
    }

    /**
     * Resets previously set format
     *
     */
    public void resetFiltering() {
        this.rnrBtn.click();
        this.resolutionsBtn.click();
        this.resetFilteringBtn.click();
        //assert if no more filter
    }

    /**
     * View the ordinance profile
     */
    public void viewResolution() {
        this.rnrBtn.click();
        this.resolutionsBtn.click();
        this.viewOrdBtn.click();
        //assert if no more filter
    }

    /**
     * Modify the contents of the ordinance
     * 
     * @param ordNum
     */
    public void editResolution(String ordNum) {
        this.rnrBtn.click();
        this.resolutionsBtn.click();
        this.editOrdBtn.click();
        this.number.sendKeys(ordNum);
        this.updateBtn.click();
        //assert if no more filter
    }

    /**
     * Remove the ordinance from the list
     */
    public void deleteResolution() {
        this.rnrBtn.click();
        this.resolutionsBtn.click();
        this.deleteOrdBtn.click();
        //assert if no more filter
    }

    /**
     * Sort the table columns
     */
    public void tableSorting() {
        this.rnrBtn.click();
        this.resolutionsBtn.click();
        this.sortTableBtn.click();
        //assert if no more filter
    }

    /**
     * Search for a specific item
     * 
     * @param searchWord
     */
    public void searchFunction(String searchWord) {
        this.rnrBtn.click();
        this.resolutionsBtn.click();
        this.searchTextBoxBtn.sendKeys(searchWord);
        this.searchBtn.click();
        //assert if no more filter
    }
//    /**
//     * Returns the error message
//     *
//     * @return
//     */
//    public String getErrorMessage() {
//        return this.errorMessage.getText();
//    }
}
