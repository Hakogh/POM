package steps;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.Databasepage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefeinition extends TestBase {

	LoginPage loginpage;
	Databasepage databasepage;
	@Before
	public void before() {
		initDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		databasepage = new Databasepage();

	}
	@Given("^User is on Techfios login page$")
	public void user_is_on_Techfios_login_page() throws Throwable {
		//initDriver();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
	}



	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) throws Throwable {
		//loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUserName(username);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		//loginpage = PageFactory.initElements(driver, LoginPage.class); we put it when we switch methods on feauture as scenario
		//or we can create a method before and put this line with intiDriver on it

		loginpage.insertPassWord(password);
	}

	@And("^User clicks on Signin button$")
	public void user_clicks_on_Signin_button() throws Throwable {
		loginpage.clickSign();
	}

	@When("^User enters \"([^\"]*)\" from mysqldatabase$")
	public void user_enters_from_mysqldatabase(String data) throws SQLException, InterruptedException {
		switch (data) {
		case "username":
			System.out.println("username from DB:"+ databasepage.getData("username"));
			loginpage.insertUserName(databasepage.getData("username"));
			Thread.sleep(3000);
			break;
		case"password":
			System.out.println("password from DB:"+databasepage.getData("password"));
			loginpage.insertPassWord(databasepage.getData("password"));
			Thread.sleep(3000);
			break;
			default:
				System.out.println("unable to enter data");
		}
	    
	}
	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() throws Throwable {
//		String expect = "DashBoard- iBilling";
//		String actual = ((WebDriver) loginpage).getTitle();
//		Assert.assertEquals(expect, actual);
		System.out.println("User is in Deashboard page ||");
		screenShot(driver);

	}

	@Then("^User click on Bank&Cash$")
	public void click_on_Bank() {
		loginpage.clickBank();
	}
	@Then("^User Click on New Account$")
	public void click_on_New_Account() {
		loginpage.clickNewAccount();
	}
	@Then("^User should land on Accounts$")
	public void user_should_land_on_Accounts() throws IOException {
		System.out.println("User is in Accounts page ||");
		screenShot(driver);
	}
	@When("^User enters Account Title as \"([^\"]*)\"$")
	public void user_enters_Title(String Titre) {
		
		loginpage.title(Titre);
	}
	@When("^User enters Description as \"([^\"]*)\"$")
	public void user_enters_Description(String Desc) {
		loginpage.description(Desc);
	}
	@When("^User enters Initial Balance$")
	public void user_enters_Balance() {
		int blnc = generateRandomNo(99999);
		loginpage.balance(blnc);
	}
	@When("^User enters Account Number$")
	public void user_enters_Account_Number() {
		
		int generateName = generateRandomNo(999999999);
		loginpage.accountNum(generateName);
	}
	@When("^User enters Contact Person as \"([^\"]*)\"$")

	public void user_enters_Contact(String contact) {

		loginpage.contact(contact);
	}
	@When("^User enters Phone$")
	public void user_enters_Phone() {
		int phn = generateRandomNo(999999999);
		loginpage.phone(phn);
	}
	@When("^User click on Submit$")
	public void users_click_on_Submit() {
		loginpage.clickSubmit();
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
		
	}
}
