package objectReposetory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindBy_HSNCOM_ResultsPage {

    WebDriver driver;

    public FindBy_HSNCOM_ResultsPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"template-product-grid\"]/div/div[2]/ul/li[1]")
    WebElement firstResult;


    public WebElement firstResult(){

        return firstResult;
    }


}
