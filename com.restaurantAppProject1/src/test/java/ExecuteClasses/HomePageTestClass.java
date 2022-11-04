package ExecuteClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepositary.HomePage;
import ElementRepositary.LoginPage;

public class HomePageTestClass extends BaseClass {
	
	LoginPage lp ;
	HomePage hp;
  @Test(priority=1,groups= {"group1"})
  public void verifyTheProductTabIsDisplayedOrNot() throws Exception {
	  
	  lp = new LoginPage(driver);
		lp.enterUsername(lp.readUsername(1, 0));
		lp.enterPasword(lp.readPassword(2, 0));

		lp.clickOnLoginbtn();
		
		hp = new HomePage(driver);
		boolean actual= hp.isProductTabVisible();
		Assert.assertTrue(actual);
  }
  @Test(priority=2,groups= {"group1"})
  
  public void verifyTheD4StoreIsDisplayedOrNot() throws Exception {
	  
	  lp = new LoginPage(driver);
		lp.enterUsername(lp.readUsername(1, 0));
		lp.enterPasword(lp.readPassword(2, 0));

		lp.clickOnLoginbtn();
		
		hp = new HomePage(driver);
		boolean actual = hp.isD4storeVisible();
		Assert.assertTrue(actual);
	  
	  
  }
@Test(priority=3,groups= {"group2"})
  
  public void verifyTheLogoutButtonIsWorksFineOrNot() throws Exception {
	
	lp = new LoginPage(driver);
	lp.enterUsername(lp.readUsername(1, 0));
	lp.enterPasword(lp.readPassword(2, 0));

	lp.clickOnLoginbtn();
	
	hp = new HomePage(driver);
	hp.clickOnLogout();
	String exp = "https://qalegend.com/restaurant/login";
	String act = driver.getCurrentUrl();
	Assert.assertEquals(act,exp);
}
  
   
}
