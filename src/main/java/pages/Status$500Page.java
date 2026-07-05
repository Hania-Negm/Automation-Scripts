package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Status$500Page {
    private WebDriver driver;

    public Status$500Page(WebDriver driver){
        this.driver = driver;
    }

    String text = "This page returned a 500 status code.";

    private By status$500text = By.xpath("//p[starts-with(normalize-space(),'This page returned a 500 status code.')]");

    public void assertionOnStatusCode$500(){
        String actualText = driver.findElement(status$500text).getText();
        String expectedText = text;
        if (actualText.equals(expectedText)){
            System.out.println("Staus code is 500 OK");
        }else {
            System.out.println("Status code is not 500");
        }
    }

    private By hereLink = By.cssSelector("[href='/status_codes']");

    public void clickOnHereLinkIn$500(){
        driver.findElement(hereLink).click();
    }
}
