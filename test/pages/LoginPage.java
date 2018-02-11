package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 *
 * @author chris
 */
public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
//    @FindBy(how = How.LINK_TEXT, using = "Login") 
//    private WebElement loginBtn;
    @FindBy(how = How.NAME, using = "email") 
    private WebElement email;
    @FindBy(how = How.NAME, using = "password") 
    private WebElement password;
    @FindBy(how = How.CSS, using = ".help-block")
    private WebElement errorMessage;
    @FindBy(how = How.LINK_TEXT, using = "I forgot my password")
    private WebElement forgotPwd;

    
    /**
     * Set the email and password after which, submit the form
     * @param email
     * @param password
     */
    public void login(String email, String password){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.email.submit();
    }
    public void forgotPassword(){
        this.forgotPwd.click();
    }
    
    /**
     * Returns the error message
     * @return 
     */
    public String getErrorMessage(){
        return this.errorMessage.getText();
    }
    
}
