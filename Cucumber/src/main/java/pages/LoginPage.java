package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}


	@FindBy(how = How.XPATH,using = "//input[@id='username']") WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using="//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SUBMIT_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a") WebElement Bank;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a") WebElement New_Account;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement Account_Title;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]") WebElement Description;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]") WebElement Initial_Balance;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]") WebElement Account_Number;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]") WebElement Contact_Person;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]") WebElement Phone;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button") WebElement Submit;
	
	//Individual method 
	
	public void insertUserName(String USERNAME) {
		
		USERNAME_ELEMENT.sendKeys(USERNAME);
	}
	
	public void insertPassWord (String PASSWOR) {
		
		PASSWORD_ELEMENT.sendKeys(PASSWOR);
	}
	public void clickSign() {
		SUBMIT_ELEMENT.click();
	}
	public void clickBank() {
		Bank.click();
	}
	
	public void clickNewAccount() {
		New_Account.click();
	}
	
	public void title(String Titre) {
		Account_Title.sendKeys(Titre);
	}
	
	public void description(String Des) {
		Description.sendKeys(Des);
	}
	
	public void balance(int Balance) {
		Initial_Balance.sendKeys(String.valueOf(Balance));
	}
	
	public void accountNum(int generateName) {
		
		Account_Number.sendKeys(String.valueOf(generateName));
	}
	
	public void contact(String Contact) {
		Contact_Person.sendKeys(Contact);
	}
	
	public void phone(int Num) {
		Phone.sendKeys(String.valueOf(Num));
	}
	
	public void clickSubmit() {
		Submit.click();
	}
}
