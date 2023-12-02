package tests;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.TestBase;
import utilities.ExcelRead;

import utilities.MyListener;

public class LoginTest extends TestBase {
	
	WebDriver driver;
	HomePage h ;
	LoginPage l;
	ExcelRead e = new ExcelRead();
	
	
	static int rowNum=0;
	
	@DataProvider
	public Object[][] loginData() throws IOException{
		int LastRow = e.getLastRow("C:\\Users\\MYPC\\Desktop\\ps2\\TestData.xlsx", "Sheet1");
		Object[][] mydata = new Object[LastRow+1][2];
		for(int i=0;i<=LastRow;i++) {
			mydata[i][0] = e.readExcel("C:\\Users\\MYPC\\Desktop\\ps2\\TestData.xlsx", "Sheet1", i, 0);
			mydata[i][1] = e.readExcel("C:\\Users\\MYPC\\Desktop\\ps2\\TestData.xlsx", "Sheet1", i, 1);
		}
		return mydata;
	}
	
	@Test(dataProvider="loginData")
	public void testLogin(String u, String p) throws IOException {
		HomePage h = new HomePage();
		h.clickLoginLink();
		LoginPage l = new LoginPage();
		l.enterLoginDetails(u, p);
		try {
			l.clickLogout();
			
		}catch(Exception e) {
			//Assert.fail("Sign Out is not Present");
			
		}
		rowNum = rowNum+1;
	}
	
}
