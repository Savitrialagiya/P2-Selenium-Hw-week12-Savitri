package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Before
    public void setUp() {
        browserSetUp(baseUrl);
    }
  @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //Enter “Admin” username
      sendTextToElement(By.name("username"),"Admin");
      //Enter “admin123“ password
      sendTextToElement(By.name("password"),"admin123");
      // Click on ‘LOGIN’ button
      clickOnElement(By.xpath("//button[@type=\"submit\"]"));
      //Verify the ‘Dashboard’ text is display
      //Expected Text
      String expectedText = "Dashboard";
      String actualText = getTextFromElement(By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]"));
      //Compare actual and expected
      Assert.assertEquals(expectedText,actualText);

}
    @After
    public void tearDown(){
        closeBrowser();
    }

}
