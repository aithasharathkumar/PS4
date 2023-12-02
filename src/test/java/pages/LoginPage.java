package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
	
	@FindBy(id="Email")
	static WebElement Txtbox_Username;
	
	@FindBy(id="Password")
	static WebElement Txtbox_Password;
	
	@FindBy(xpath="//input[@value='Log in']")
	static WebElement Btn_login;
	
	@FindBy(linkText="Log out")
	static WebElement Btn_logout;
	
	public void enterLoginDetails(String u, String p) {
		Txtbox_Username.sendKeys(u);
		Txtbox_Password.sendKeys(p);
		Btn_login.click();
	}
	
	public void clickLogout() {
		Btn_logout.click();
	}
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
}

