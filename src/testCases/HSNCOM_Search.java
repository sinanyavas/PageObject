package testCases;

import objectReposetory.FindBy_HSNCOM_HomePage;
import objectReposetory.FindBy_HSNCOM_ResultsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HSNCOM_Search {

    @Test

    public void search() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hsn.com/shop/electronics/ec");
        driver.manage().window().maximize();

        FindBy_HSNCOM_HomePage hm = new FindBy_HSNCOM_HomePage(driver);
        hm.searchbar().sendKeys("motorolla");
        hm.searchSubmit().click();

        FindBy_HSNCOM_ResultsPage hr = new FindBy_HSNCOM_ResultsPage(driver);
        hr.firstResult().click();

        driver.quit();

    }


}
