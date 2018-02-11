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
public class OrdinancePage {

    private final WebDriver driver;

    @FindBy(how = How.XPATH, using = "/html/body/div/aside[1]/div/section/ul[2]/li[3]/a")
    private WebElement rnrBtn;
    @FindBy(how = How.XPATH, using = "/html/body/div/aside[1]/div/section/ul[2]/li[3]/ul/li[1]/a")
    private WebElement ordinanceBtn;
    @FindBy(how = How.CSS, using = ".btn btn-success")
    private WebElement addNewOrdinanceBtn;
    @FindBy(how = How.NAME, using = "Reset Filtering")
    private WebElement resetFilteringBtn;
    @FindBy(how = How.NAME, using = "Number")
    private WebElement number;
    @FindBy(how = How.NAME, using = "Series")
    private WebElement series;
    @FindBy(how = How.NAME, using = "Title")
    private WebElement title;
    @FindBy(how = How.NAME, using = "Keywords")
    private WebElement keywords;
    @FindBy(how = How.NAME, using = "pdf")
    private WebElement pdfUploadBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"ordinancesForm\"]/div[2]/button")
    private WebElement createBtn;

    public OrdinancePage(WebDriver driver) {
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
    public void addNewOrdinance(String ordNum, String seriesNum, String title, String keyWords) {
        this.rnrBtn.click();
        this.ordinanceBtn.click();
        this.addNewOrdinanceBtn.click();
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
        this.resetFilteringBtn.click();
        //assert if no more filter
    }

    /**
     * Returns the error message
     *
     * @return
     */
    public String getErrorMessage() {
        return this.errorMessage.getText();
    }
}
