package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private By userName = By.id("username");
    private By password = By.name("password");
    private  By loginButton = By.className("radius");

    public LoginPage loginMethod(String name , String pass){
        driver.findElement(userName).sendKeys(name);
        driver.findElement(password).sendKeys(pass);

        return this;
    }

    public LoginPage clickLoginButton(){
        driver.findElement(loginButton).click();

        return this;
    }
}
