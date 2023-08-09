import org.junit.jupiter.api.*;
import pageFactory.TestFormatPage;

import static Util.Util.*;

public class TestFormat {
    static TestFormatPage testFormatPage;

    @BeforeAll
    public static void init(){
        testFormatPage = new TestFormatPage();
        testFormatPage.navigateToTestFormatPage();
        testFormatPage.waitToPresentForm();
    }

    @Test
    public void success(){
        testFormatPage.fillNameField(GOOD_NAME);
        testFormatPage.fillDateFiled(GOOD_DATE);
        testFormatPage.clicTestBtn();
        Assertions.assertEquals(SUCCES_ALERT, testFormatPage.presentSuccessAlert());
        testFormatPage.ClearTheFormat();
    }
    @Test
    public void emptyName(){
        testFormatPage.fillDateFiled(GOOD_DATE);
        testFormatPage.clicTestBtn();
        Assertions.assertEquals(EMPTY_NAME_ALERT, testFormatPage.presentDangerAlert());
        testFormatPage.ClearTheFormat();
    }
    @Test
    public void wrongName(){
        testFormatPage.fillNameField(WRONG_NAME);
        testFormatPage.fillDateFiled(GOOD_DATE);
        testFormatPage.clicTestBtn();
        Assertions.assertEquals(WRONG_NAME_ALERT, testFormatPage.presentDangerAlert());
        testFormatPage.ClearTheFormat();
    }
    @Test
    public void wrongDate(){
        testFormatPage.fillNameField(GOOD_NAME);
        testFormatPage.fillDateFiled(WRONG_DATE_FORMAT);
        testFormatPage.clicTestBtn();
        Assertions.assertEquals(WRONG_DATE_ALERT, testFormatPage.presentDangerAlert());
        testFormatPage.ClearTheFormat();
    }
    @Test
    public void tooYoung(){
        testFormatPage.fillNameField(GOOD_NAME);
        testFormatPage.fillDateFiled(TOO_YOUNG_DATE);
        testFormatPage.clicTestBtn();
        Assertions.assertEquals(TOO_YOUNG_ALERT, testFormatPage.presentDangerAlert());
        testFormatPage.ClearTheFormat();
    }
    @Test
    public void tooOld(){
        testFormatPage.fillNameField(GOOD_NAME);
        testFormatPage.fillDateFiled(TOO_OLD_DATE);
        testFormatPage.clicTestBtn();
        Assertions.assertEquals(TOO_OLD_ALERT, testFormatPage.presentDangerAlert());
        testFormatPage.ClearTheFormat();
    }
    @Test
    public void futureDate(){
        testFormatPage.fillNameField(GOOD_NAME);
        testFormatPage.fillDateFiled(FUTURE_DATE);
        testFormatPage.clicTestBtn();
        Assertions.assertEquals(FUTURE_ALERT, testFormatPage.presentDangerAlert());
        testFormatPage.ClearTheFormat();
    }
    @AfterAll
    public static void shutdown() {
        testFormatPage.quit();
    }
}
