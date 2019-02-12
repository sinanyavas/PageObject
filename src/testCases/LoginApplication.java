package testCases;

import objectReposetory.RediffHomePage;
import objectReposetory.RediffLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginApplication {

    @Test

    public void Login() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        RediffLoginPage rd = new RediffLoginPage(driver);
        rd.Emailid().sendKeys("abbystavern@yahoo.com");
        rd.Password().sendKeys("GuiltyMachine98");
        rd.submit().click();
        rd.linkHome().click();

        RediffHomePage rh = new RediffHomePage(driver);
        rh.searchButton().click();
        Thread.sleep(1000);
        rh.submit().click();

        driver.quit();
    }


}
