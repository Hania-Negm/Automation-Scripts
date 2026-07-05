package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.*;

public class StatusCodeTest {
    private WebDriver driver;
    private ThirdHomePageTrial thirdHomePageTrial;
    private StatusCodePage statusCodePage;
    private Status$200Page status$200Page;
    private Status$301Page status$301Page;
    private Status$404Page status$404Page;
    private Status$500Page status$500Page;

    @Test
    public void startTestStatusCodes() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().fullscreen();

        Thread.sleep(2000);

        thirdHomePageTrial = new ThirdHomePageTrial(driver);
        thirdHomePageTrial.clickOnStatusCodeLink();

        Thread.sleep(5000);

        statusCodePage = new StatusCodePage(driver);
        statusCodePage.assertionOnStatusCodeTitle();


        Thread.sleep(5000);

        statusCodePage.clickOnStatus$200();
        status$200Page = new Status$200Page(driver);
        status$200Page.assertionOnStatusCode$200();
        status$200Page.clickOnHereLinkIn$200();

        Thread.sleep(5000);

        statusCodePage.clickOnStatus$301();
        status$301Page = new Status$301Page(driver);
        status$301Page.assertionOnStatusCode$301();
        status$301Page.clickOnHereLinkIn$301();

        Thread.sleep(5000);

        statusCodePage.clickOnStatus$404();
        status$404Page = new Status$404Page(driver);
        status$404Page.assertionOnStatusCode$404();
        status$404Page.clickOnHereLinkIn$404();


        Thread.sleep(5000);

        statusCodePage.clickOnStatus$500();
        status$500Page = new Status$500Page(driver);
        status$500Page.assertionOnStatusCode$500();
        status$500Page.clickOnHereLinkIn$500();
    }
}
