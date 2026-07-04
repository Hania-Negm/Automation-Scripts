package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {
    private WebDriver driver;

    public SecurePage(WebDriver driver){
        this.driver = driver;
    }

    private final String text = "Secure Area";

    private final By secureText = By.xpath("//h2[contains(.,'Secure Area')]");

    public SecurePage assertOnSecureText(){

        // Assert
        String actualText = driver.findElement(secureText).getText();
        String expectedText = text;

        if(actualText.equals(expectedText)){
            System.out.println("Assertion passed");
        }else {
            System.out.println("Assertion failed");
        }
        return  this;
    }
}
