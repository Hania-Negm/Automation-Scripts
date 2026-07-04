package autoScripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoFirstScript {
    WebDriver driver = new ChromeDriver();

    public void navigateTo(){
        // NAVIGATION
        driver.get("https://www.amazon.eg/-/en/ref=nav_logo");
        //driver.navigate().to("https://www.amazon.eg/-/en/ref=nav_logo");

        // SCREEN SIZE
        //driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1366,1366));

        System.out.println(driver.getTitle());

        // CLOSE
        //driver.close();

        //QUIT
        //driver.quit();
    }
}
