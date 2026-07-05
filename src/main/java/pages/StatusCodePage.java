package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodePage {
    private WebDriver driver;

    public StatusCodePage(WebDriver driver){
        this.driver = driver;
    }

    String text = "Status Codes";

    private By stautsCodeHeader = By.tagName("h3");

    public void assertionOnStatusCodeTitle(){
        String actualText = driver.findElement(stautsCodeHeader).getText();
        String expectedText = text;

        if (actualText.equals(expectedText)){
            System.out.println("The header of Status Code Page is Correct");
        }else{
            System.out.println("The header of Status Code Page is incorrect");
        }
    }

    private By status$200 = By.cssSelector("[href='status_codes/200']");

    public void clickOnStatus$200(){
        driver.findElement(status$200).click();
    }

    private By status$301 = By.cssSelector("[href='status_codes/301']");

    public void clickOnStatus$301(){
        driver.findElement(status$301).click();
    }

    private By status$404 = By.cssSelector("[href='status_codes/404']");

    public void clickOnStatus$404(){
        driver.findElement(status$404).click();
    }

    private By status$500 = By.cssSelector("[href='status_codes/500']");

    public void clickOnStatus$500(){
        driver.findElement(status$500).click();
    }
}
