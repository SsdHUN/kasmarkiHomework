package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {

    private static WebDriver webDriver = null;

    public static WebDriver createWebDriver(){
        if (webDriver == null){
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            webDriver = new ChromeDriver(chromeOptions);
        } return webDriver;
    }
    public static void shutDown(){
        webDriver.quit();
        webDriver = null;
    }
}