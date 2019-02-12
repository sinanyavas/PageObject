package objectReposetory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindBy_HSNCOM_HomePage {

    WebDriver driver;

    public FindBy_HSNCOM_HomePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "search-input")
    WebElement searchbar;

    @FindBy(id = "search-submit-proxy")
    WebElement searchSubmit;

    public WebElement searchbar(){

        return searchbar;
    }

    public WebElement searchSubmit(){

        return searchSubmit;
    }

}
