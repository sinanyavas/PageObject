package objectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindBy_RediffLoginPage {

    WebDriver driver;

    public FindBy_RediffLoginPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /*By username = By.xpath("//*[@id=\"login1\"]");
    By password = By.name("passwd");
    By submit = By.name("proceed");
    By linkHOME = By.linkText("Home");
    */

    @FindBy(xpath = "//*[@id=\\\"login1\\" )
    WebElement username;

    @FindBy(name = "passwd")
    WebElement password;

    @FindBy(name = "proceed" )
    WebElement submit;

    @FindBy(linkText = "Home")
    WebElement linkHOME;

    public WebElement Emailid(){

       return username;
    }

    public WebElement Password(){

        return password;
    }

    public WebElement submit(){

        return submit;
    }

    public WebElement linkHome(){

        return linkHOME;
    }

}
