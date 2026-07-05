package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.AddRemovePage;
import pages.SecondHomePageTrial;

public class AddElementTest {
    private WebDriver driver;
    private SecondHomePageTrial secondHomePageTrial;
    private AddRemovePage addRemovePage;

    @Test
    public void startTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        Thread.sleep(2000);

        secondHomePageTrial = new SecondHomePageTrial(driver);
        secondHomePageTrial.clickONAddRemoveLink();

        Thread.sleep(2000);

        addRemovePage = new AddRemovePage(driver);
        addRemovePage.assertions();
        addRemovePage.clickOnAddBtn();

        Thread.sleep(2000);

        addRemovePage.clickOnDeleteBtn();
    }
}
