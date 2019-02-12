package objectReposetory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

    WebDriver driver;

    public RediffLoginPage(WebDriver driver){

        this.driver = driver;
    }

    By username = By.xpath("//*[@id=\"login1\"]");
    By password = By.name("passwd");
    By submit = By.name("proceed");
    By linkHOME = By.linkText("Home");


    public WebElement Emailid(){

       return driver.findElement(username);
    }

    public WebElement Password(){

        return driver.findElement(password);
    }

    public WebElement submit(){

        return driver.findElement(submit);
    }

    public WebElement linkHome(){

        return driver.findElement(linkHOME);
    }

}
