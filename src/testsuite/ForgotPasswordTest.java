package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Before
    public void setUp() {
        browserSetUp(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //click on the ‘Forgot your password’ link
        clickOnElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]"));

        //Verify the text ‘Reset Password’
        String expectedText = "Reset Password";
        String actualText = getTextFromElement(By.xpath("//h6[@class=\"oxd-text oxd-text--h6 orangehrm-forgot-password-title\"]"));
    }
    @After
    public void tearDown(){
        closeBrowser();
    }

}
