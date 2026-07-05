package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;

    public FramesPage(WebDriver driver){
        this.driver = driver;
    }

    private By iframeLink = By.cssSelector("a[href='/iframe']");

    public void clickOnIframeLink(){
        driver.findElement(iframeLink).click();
    }
}
