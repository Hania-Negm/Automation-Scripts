package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    private  WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

//    private By LoginBtn = By.xpath("//a[text()='Form Authentication']");

    // 1- Create Locator
    private By LoginLink = By.linkText("Form Authentication");

    // 2- Take action inside the method

    public void clickLoginLink(){
        driver.findElement(LoginLink).click();
    }
}
