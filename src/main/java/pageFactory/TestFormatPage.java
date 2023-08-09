package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Util.Util.*;

public class TestFormatPage extends BasePage {
    public TestFormatPage() { super(); }

    private String PAGE_URL = "/test_form";

    @FindBy(xpath = "//*[@id='name']")
    WebElement nameField;
    @FindBy(xpath = "//*[@id='date']")
    WebElement dateField;
    @FindBy(xpath = "//*[contains(@class, 'btn-primary')]")
    WebElement testBtn;
    @FindBy(xpath = "//*[@class='alert danger-alert']")
    WebElement dangerAlert;
    @FindBy(xpath = "//*[@class='alert success-alert']")
    WebElement successAlert;
    @FindBy(xpath = "//*[@class='container  shadow']")
     WebElement form;

    public void navigateToTestFormatPage(){
        driver.get(BASE_URL+PAGE_URL);
    }
    public void fillNameField(String userName){
        nameField.sendKeys(userName);
    }
    public void fillDateFiled(String birthDate){
        dateField.sendKeys(birthDate);
    }
    public void clearNameFiled(){
        nameField.clear();
    }
    public void clearDateField(){
        dateField.clear();
    }
    public void clicTestBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(testBtn));
        testBtn.click();
    }
    public String presentDangerAlert(){
        wait.until(ExpectedConditions.visibilityOf(dangerAlert));
        return dangerAlert.getText();
    }
    public String presentSuccessAlert(){
        wait.until(ExpectedConditions.visibilityOf(successAlert));
        return successAlert.getText();
    }
    public void waitToPresentForm(){
        wait.until(ExpectedConditions.visibilityOf(form));
    }
    public void ClearTheFormat(){
        clearNameFiled();
        clearDateField();
    }
}
