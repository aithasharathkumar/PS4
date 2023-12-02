package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
	
	@FindBy(linkText="Log in")
	static WebElement link_login;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLoginLink() {
		link_login.click();
	}

}

