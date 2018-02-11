/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages.buyers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 *
 * @author Dell
 */
public class BuyerChangePasswordPage {

    private final WebDriver driver;

    @FindBy(how = How.CSS, using = ".dropdown-toggle")
    private WebElement accountBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-top\"]/li[2]/ul/li[1]/a")
    private WebElement editPwdBtn;
    @FindBy(how = How.NAME, using = "current_password")
    private WebElement currentPwd;
    @FindBy(how = How.NAME, using = "new_password")
    private WebElement newPwd;
    @FindBy(how = How.NAME, using = "confirm_new_password")
    private WebElement confNewPwd;
     @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div[2]/div/div[2]/form/div[4]/div/input")
    private WebElement changeBtn;
     // last step
    private WebElement errorMessage;

    public BuyerChangePasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Receives user input of current and new passwords, then confirm new
     * password
     *
     * @param currentPwd
     * @param newPwd
     * @param confNewPwd
     */
    public void changePassword(String currentPwd, String newPwd, String confNewPwd) {
        this.accountBtn.click();
        this.editPwdBtn.click();
        this.currentPwd.sendKeys(currentPwd);
        this.newPwd.sendKeys(newPwd);
        this.confNewPwd.sendKeys(confNewPwd);
        this.changeBtn.click();
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
