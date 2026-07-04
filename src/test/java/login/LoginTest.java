package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest {
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;

    @Test
    public void loginForm(){
        driver = new ChromeDriver();

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

        driver.get("https://the-internet.herokuapp.com/");
        homePage.clickLoginLink();

        //Method Chaining
        loginPage.loginMethod("tomsmith" , "SuperSecretPassword!").clickLoginButton();
        // loginPage.clickLoginButton();
    }
}
