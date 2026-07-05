package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThirdHomePageTrial {
    private WebDriver driver;

    public ThirdHomePageTrial(WebDriver driver){
        this.driver = driver;
    }

    private By statusCodeLink = By.cssSelector("a[href='/status_codes']");

    public void clickOnStatusCodeLink(){
        driver.findElement(statusCodeLink).click();
    }
}
