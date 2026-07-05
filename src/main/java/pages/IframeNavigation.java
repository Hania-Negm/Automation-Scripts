package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IframeNavigation {
    private WebDriver driver;

    public IframeNavigation(WebDriver driver){
        this.driver = driver;
    }

    String text = "An iFrame containing the TinyMCE WYSIWYG Editor";

    private By  iframePageTitle = By.xpath("//h3[contains(text(),'An iFrame containing the TinyMCE WYSIWYG Editor')]");

    public IframeNavigation assertion(){
        String actualText = driver.findElement(iframePageTitle).getText();
        String expectedText = text;

        if(actualText.equals(expectedText)){
            System.out.println("Same title : Assertion passed");
        }else {
            System.out.println("Diff title : Assertion failed");
        }

        return this;
    }
}
