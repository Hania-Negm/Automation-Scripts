package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Status$404Page {
    private WebDriver driver;

    public Status$404Page(WebDriver driver){
        this.driver = driver;
    }

    String text = "This page returned a 404 status code.";

    private By status$404text = By.xpath("//p[starts-with(normalize-space(),'This page returned a 404 status code.')]");

    public void assertionOnStatusCode$404(){
        String actualText = driver.findElement(status$404text).getText();
        String expectedText = text;
        if (actualText.equals(expectedText)){
            System.out.println("Staus code is 404 OK");
        }else {
            System.out.println("Status code is not 404");
        }
    }

    private By hereLink = By.cssSelector("[href='/status_codes']");

    public void clickOnHereLinkIn$404(){
        driver.findElement(hereLink).click();
    }
}
