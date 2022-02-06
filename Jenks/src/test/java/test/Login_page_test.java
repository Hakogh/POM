package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TestBase;

public class Login_page_test extends TestBase {

	LoginPage loginPageObj;

	@BeforeMethod
	public void setUp() {
		initDriver();
		loginPageObj = PageFactory.initElements(driver, LoginPage.class);
	}

	@Test
	public void loginTest() throws Throwable {
		loginPageObj.insertUserName("demo@techfios.com");
		loginPageObj.insertPassWord("abc123");
		loginPageObj.clickSign();
		screenShot(driver);
	}

	@Test
	public void PageTitleTest() throws Throwable {
		loginPageObj.insertUserName("demo@techfios.com");
		loginPageObj.insertPassWord("abc123");
		loginPageObj.clickSign();
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle= "Dashboard- iBilling"; // fail
		Assert.assertEquals(actualTitle, expectedTitle);
		screenShot(driver);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
