import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DummyTest {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        String title = driver.getTitle();

        System.out.println("Title is : " + title);

//        By inputsLink = By.xpath("//a[text()='Inputs']");
//        By inputsLink = By.cssSelector("a[href='/inputs']");
//        By inputsLink = By.linkText("Inputs");
//          driver.findElement(inputsLink).click();

//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        List<WebElement> links = driver.findElements(By.xpath("//ul/li/a"));
        List<WebElement> links = driver.findElements(By.cssSelector("ul>li>a"));

//        for(WebElement link : links){
//            link.getSize();
//        }

        System.out.println("Number of links : " + links.size());
    }
}
