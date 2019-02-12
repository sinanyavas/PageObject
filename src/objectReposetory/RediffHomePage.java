package objectReposetory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {

    WebDriver driver;

    public RediffHomePage(WebDriver driver) {

        this.driver = driver;
    }

    By searchButton = By.id("srch_show_hide_btn");
    By submit = By.xpath("//input[@type='submit']");


    public WebElement searchButton() {

        return driver.findElement(searchButton);
    }

    public WebElement submit() {
        return driver.findElement(submit);
    }



}
