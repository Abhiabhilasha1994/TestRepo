package ExecuteClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepositary.LoginPage;
import Utilities.ExcelRead;

public class LoginPageTestClass extends BaseClass {
	LoginPage lp ;

	@Test(priority=1,groups= {"login"})
	public void verifySuccessfullLogin() throws Exception {
		
		lp = new LoginPage(driver);
		lp.enterUsername(lp.readUsername(1, 0));
		lp.enterPasword(lp.readPassword(2, 0));

		lp.clickOnLoginbtn();

		boolean actual=lp.isAdminVisibled();
		Assert.assertTrue(actual);


	}
	@Test(priority=2,groups= {"login2"},dataProvider="Search Provider",dataProviderClass=DataProviderClass.class)
	public void verifyUnsuccessfullLogin(String name, String pass) {
		lp = new LoginPage(driver);
		lp.enterUsername(name);
		lp.enterPasword(pass);
		lp.clickOnLoginbtn();
		boolean actual=lp.isAdminVisibled();
		Assert.assertFalse(actual);

		
	}
	@Test(priority=3,groups= {"group1"})
	public void VerifyTheLogoIsDisplayedOrNot() {
		
		lp = new LoginPage(driver);
		boolean actual=lp.isLogoVisible();
		Assert.assertTrue(actual);
		
	}
}
