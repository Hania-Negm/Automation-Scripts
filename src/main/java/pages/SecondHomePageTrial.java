package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondHomePageTrial {
    private WebDriver driver;

    public  SecondHomePageTrial(WebDriver driver){
        this.driver = driver;
    }

    private By addRemoveElement = By.cssSelector("[href='/add_remove_elements/']");

    public void clickONAddRemoveLink(){
        driver.findElement(addRemoveElement).click();
    }
}
