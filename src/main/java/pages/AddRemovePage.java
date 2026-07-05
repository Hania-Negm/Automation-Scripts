package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemovePage {
    private WebDriver driver;

    public AddRemovePage(WebDriver driver){
        this.driver = driver;
    }

    String text = "Add/Remove Elements";

    private By addRemoveHeader = By.tagName("h3");

    public AddRemovePage assertions(){
        String actualText = driver.findElement(addRemoveHeader).getText();

        String expectedText = text;

        if (actualText.equals(expectedText)){
            System.out.println("Passseeedddd");
        }else {
            System.out.println("Failllllleeedd");
        }
        return this;
    }

    private By addBtn = By.xpath("//button[contains(text(),'Add Element')]");


    public void clickOnAddBtn(){
        driver.findElement(addBtn).click();

    }

    private By deletBtn = By.xpath("//button[contains(text(),'Delete')]");

    public void clickOnDeleteBtn(){
        driver.findElement(deletBtn).click();

    }
}
