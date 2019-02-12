package objectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindBy_RediffHomePage {

    WebDriver driver;

    public FindBy_RediffHomePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /*By searchButton = By.id("srch_show_hide_btn");
    By submit = By.xpath("//input[@type='submit']");
    */


    @FindBy(id = "srch_show_hide_btn")
    WebElement searchButton;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submit;

    public WebElement searchButton() {
        return searchButton;
    }
    public WebElement submit() {
        return submit;
    }



}
