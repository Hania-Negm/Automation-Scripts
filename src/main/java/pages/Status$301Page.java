package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Status$301Page {
    private WebDriver driver;

    public Status$301Page(WebDriver driver){
        this.driver = driver;
    }

    String text = "This page returned a 301 status code.";

    private By status$301text = By.xpath("//p[starts-with(normalize-space(),'This page returned a 301 status code.')]");

    public void assertionOnStatusCode$301(){
        String actualText = driver.findElement(status$301text).getText();
        String expectedText = text;
        if (actualText.equals(expectedText)){
            System.out.println("Staus code is 301 OK");
        }else {
            System.out.println("Status code is not 301");
        }
    }

    private By hereLink = By.cssSelector("[href='/status_codes']");

    public void clickOnHereLinkIn$301(){
        driver.findElement(hereLink).click();
    }
}
