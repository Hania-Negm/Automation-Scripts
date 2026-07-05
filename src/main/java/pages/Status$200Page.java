package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Status$200Page {
    private WebDriver driver;

    public Status$200Page(WebDriver driver){
        this.driver = driver;
    }

    String text = "This page returned a 200 status code.";

    private By status$200text = By.xpath("//p[starts-with(normalize-space(),'This page returned a 200 status code.')]");

    public void assertionOnStatusCode$200(){
        String actualText = driver.findElement(status$200text).getText();
        String expectedText = text;
        if (actualText.equals(expectedText)){
            System.out.println("Staus code is 200 OK");
        }else {
            System.out.println("Status code is not 200");
        }
    }

    private By hereLink = By.cssSelector("[href='/status_codes']");

    public void clickOnHereLinkIn$200(){
        driver.findElement(hereLink).click();
    }
}
