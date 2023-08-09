package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(){
        this.driver = WebDriverFactory.createWebDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }

    public void quit(){
        WebDriverFactory.shutDown();
    }
}
