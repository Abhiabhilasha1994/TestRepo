package ExecuteClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepositary.HomePage;
import ElementRepositary.LoginPage;
import ElementRepositary.StoresPage;
import ElementRepositary.WaiterPage;

public class WaiterPageTestClass extends BaseClass {

	LoginPage lp;
	HomePage hp;
	StoresPage sp;
	WaiterPage wp;

	@Test
	public void verifyTheWaiterPageIsVisibleByClickingOnPeopleWaiter() throws Exception {
		lp = new LoginPage(driver);
		lp.enterUsername(lp.readUsername(1, 0));
		lp.enterPasword(lp.readPassword(2, 0));

		lp.clickOnLoginbtn();

		hp = new HomePage(driver);
		hp.clickOnPeoples();
		wp = new WaiterPage(driver);
		boolean actual = wp.isWaitersPageVisible();
		Assert.assertTrue(actual);

	}

	@Test
	public void verifyTheAddWaiterButtonIsVisibleOrNot() throws Exception {
		lp = new LoginPage(driver);
		lp.enterUsername(lp.readUsername(1, 0));
		lp.enterPasword(lp.readPassword(2, 0));
		lp.clickOnLoginbtn();
		hp = new HomePage(driver);
		hp.clickOnPeoples();
		wp = new WaiterPage(driver);
		wp.clickOnWaiters();
		boolean actual = wp.isAddWaitersPageVisible();
		Assert.assertTrue(actual);

	}

	@Test
	public void AddNewWaiter() throws Exception {

		lp = new LoginPage(driver);
		lp.enterUsername(lp.readUsername(1, 0));
		lp.enterPasword(lp.readPassword(2, 0));
		lp.clickOnLoginbtn();
		hp = new HomePage(driver);
		hp.clickOnPeoples();
		wp = new WaiterPage(driver);
		wp.clickOnWaiters();
		wp.clickOnAddWaiters();
		wp.enterWaitername(wp.readWaitername(0, 2));
		wp.clickOnWaitersSubmitt();
		boolean actual = wp.isAddWaitersPageVisible();
		Assert.assertTrue(actual);
	}

	@Test
	public void verifySearchAWaiterByUSingName() throws Exception {

		lp = new LoginPage(driver);
		lp.enterUsername(lp.readUsername(1, 0));
		lp.enterPasword(lp.readPassword(2, 0));
		lp.clickOnLoginbtn();
		hp = new HomePage(driver);
		hp.clickOnPeoples();
		wp = new WaiterPage(driver);
		wp.clickOnWaiters();
		wp.clickOnSearch();
		wp.enterSearchname("akshay");
		boolean actual = wp.isSearchNameVisible();
		Assert.assertTrue(actual);

	}
	
	@Test
	public void verifySearchAWaiterByUsingMobileNumber() throws Exception {
		lp = new LoginPage(driver);
		lp.enterUsername(lp.readUsername(1, 0));
		lp.enterPasword(lp.readPassword(2, 0));
		lp.clickOnLoginbtn();
		hp = new HomePage(driver);
		hp.clickOnPeoples();
		wp = new WaiterPage(driver);
		wp.clickOnWaiters();
		wp.clickOnSearch();
		wp.enterSearchMobileNumber("5465465");
		boolean actual = wp.isSearchMobileNumberVisible();
		Assert.assertTrue(actual);
		
		
	}

}
