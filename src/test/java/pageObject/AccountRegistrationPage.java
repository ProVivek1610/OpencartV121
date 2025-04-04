package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	
	public AccountRegistrationPage(WebDriver driver) {
		
		super(driver);
		
	}

	@FindBy(xpath = "//input(@id='input-firstname')") 
	WebElement txtFirstname;
	
	@FindBy(xpath = "//input(@id='input-lastname')") 
	WebElement txtLastname;
	

	@FindBy(xpath = "//input(@id='input-email')") 
	WebElement txtEmail;
	

	@FindBy(xpath = "//input(@id='input-telephone')") 
	WebElement txtTelephone;
	

	@FindBy(xpath = "//input(@id='input-passwaord')") 
	WebElement txtPassword;
	

	@FindBy(xpath = "//input(@id='input-confirm')") 
	WebElement txtCfrmPassword;
	
	
	@FindBy(xpath = "//input(@name='agree')") 
	WebElement chkPolicy;
	

	@FindBy(xpath = "//input(@value='Continue')") 
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1(normalize-space()='Your Account Has Been Credited!')") 
	WebElement msgConfirmation;
	
	public void setFirtName(String fname) {
		txtFirstname.sendKeys(fname);
	}
	
	
	public void setLastname(String lname) {
		txtLastname.sendKeys(lname);
	}
	
	public void setEmail(String mail) {
		txtEmail.sendKeys(mail);
	}
	
	public void setTelephone(String tele) {
		txtTelephone.sendKeys(tele);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void setConfirmPassword(String cnfpswd) {
		txtCfrmPassword.sendKeys(cnfpswd);
	}
	
	public void setPrivacyPolicy() {
		chkPolicy.clear();
	}
	
	public void clickContinue() {
		btnContinue.click();
	}
	
	
	public String getConfirmationMsg() {
		try {
			return(msgConfirmation.getText());
		}catch (Exception e) {
			return(e.getMessage());
		}
	}
	
	
	
	

	
}
