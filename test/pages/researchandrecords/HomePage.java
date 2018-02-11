package pages.researchandrecords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author chris
 */
public class HomePage {

    private final WebDriver driver;
    @FindBy(css = ".logo-lg")
    private WebElement header;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     *
     * Returns the header string
     * @return String of the header page
     */
    public String getHeader() {
        return header.getText();
    }

}
