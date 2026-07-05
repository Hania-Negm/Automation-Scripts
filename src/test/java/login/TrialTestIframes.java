package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.IframeNavigation;
import pages.TrialHomePage;

public class TrialTestIframes {
    private WebDriver driver;
    private TrialHomePage trialHomePage;
    private FramesPage framesPage;
    private IframeNavigation iframeNavigation;

    @Test
    public void runTest(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        trialHomePage = new TrialHomePage(driver);
        framesPage = new FramesPage(driver);
        iframeNavigation = new IframeNavigation(driver);

        trialHomePage.clickOnFramesLink();
        framesPage.clickOnIframeLink();
        iframeNavigation.assertion();
    }
}
