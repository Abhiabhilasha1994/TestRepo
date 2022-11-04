package ExecuteClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepositary.HomePage;
import ElementRepositary.LoginPage;
import ElementRepositary.StoresPage;

public class StoresPageTestClass extends BaseClass  {
	

	LoginPage lp;
	HomePage hp;
	StoresPage sp;
  @Test
  public void verifyTheStorePageIsVisibleByClickingOnStoresTab() throws Exception {
	  
	  lp = new LoginPage(driver);
		lp.enterUsername(lp.readUsername(1, 0));
		lp.enterPasword(lp.readPassword(2, 0));

		lp.clickOnLoginbtn();

		hp = new HomePage(driver);
		hp.clickOnStoresPage();
		sp = new StoresPage(driver);
		boolean actual = sp.isStoresPageVisible();
		Assert.assertTrue(actual);
  }
  @Test
  public void createANewStore() throws Exception {
	  
	  	lp = new LoginPage(driver);
		lp.enterUsername(lp.readUsername(1, 0));
		lp.enterPasword(lp.readPassword(2, 0));

		lp.clickOnLoginbtn();

		hp = new HomePage(driver);
		hp.clickOnStoresPage();
		sp = new StoresPage(driver);
		sp.clickOnAddStores();
		sp.enterStorename(sp.readStorename(0, 1));
		sp.clickOnAddStoressubmitt();
		boolean actual = sp.isAddStorebtnVisible();
		Assert.assertTrue(actual);
		
  }
  
  @Test
  public void verifyStoreNameSearchByUsingStoreName() throws Exception {
	  
	  	lp = new LoginPage(driver);
		lp.enterUsername(lp.readUsername(1, 0));
		lp.enterPasword(lp.readPassword(2, 0));

		lp.clickOnLoginbtn();

		hp = new HomePage(driver);
		hp.clickOnStoresPage();
		sp = new StoresPage(driver);
		sp.clickOnSearchbtn();
		sp.enterSearchStorename("Ajstore");
		boolean actual = sp.isStoresPageNameVisible();
		Assert.assertTrue(actual);
		
		
	  
	  
  }
  @Test
  public void verifyTheAddstoreButtonIsVisibleOrNot() throws Exception {
	  
	  	lp = new LoginPage(driver);
		lp.enterUsername(lp.readUsername(1, 0));
		lp.enterPasword(lp.readPassword(2, 0));

		lp.clickOnLoginbtn();

		hp = new HomePage(driver);
		hp.clickOnStoresPage();
		sp = new StoresPage(driver);
		boolean actual = sp.isAddStorebtnVisible();
		Assert.assertTrue(actual);
		
	  
  }
	  
  
  
  
}
