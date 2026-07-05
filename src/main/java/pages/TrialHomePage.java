package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrialHomePage {
    private WebDriver driver;

    public TrialHomePage(WebDriver driver){
        this.driver = driver;
    }

    private By framesLink = By.xpath("//a[contains(text(),'Frames')]");

    public void clickOnFramesLink(){
        driver.findElement(framesLink).click();
    }
}
