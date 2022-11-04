package ExecuteClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepositary.HomePage;
import ElementRepositary.LoginPage;
import ElementRepositary.ProductPage;

public class ProductPageTestClass extends BaseClass {

	LoginPage lp;
	HomePage hp;
	ProductPage pp;

	@Test
	public void verifyTheProductsPageIsVisibleByClickingProductTab() throws Exception {

		lp = new LoginPage(driver);
		lp.enterUsername(lp.readUsername(1, 0));
		lp.enterPasword(lp.readPassword(2, 0));

		lp.clickOnLoginbtn();

		hp = new HomePage(driver);
		hp.clickOnProducts();
		pp = new ProductPage(driver);

		boolean actual = pp.isProductDescriptionVisible();
		Assert.assertTrue(actual);
	}

	@Test

	public void verifyTheProductSearchByUsingName() throws Exception {

		lp = new LoginPage(driver);
		lp.enterUsername(lp.readUsername(1, 0));
		lp.enterPasword(lp.readPassword(2, 0));

		lp.clickOnLoginbtn();

		hp = new HomePage(driver);
		hp.clickOnProducts();
		pp = new ProductPage(driver);
		pp.clickOnSearchbtn();
		pp.enterSearchname(pp.readSearchname(0, 7));
		boolean actual = pp.IsSearchNameVisible();
		Assert.assertTrue(actual);

	}

	@Test

	public void verifyTheProductSearchByUsingCode() throws Exception {

		lp = new LoginPage(driver);
		lp.enterUsername(lp.readUsername(1, 0));
		lp.enterPasword(lp.readPassword(2, 0));

		lp.clickOnLoginbtn();

		hp = new HomePage(driver);
		hp.clickOnProducts();
		pp = new ProductPage(driver);
		pp.clickOnSearchbtn();
		pp.enterSearchProductCode("P005");
		boolean actual = pp.IsSearchCodeVisible();
		Assert.assertTrue(actual);

	}
	
	@Test

	public void verifyThePrintMenuIsDisplayedByClickingOnPrintMenu() throws Exception {
		
		lp = new LoginPage(driver);
		lp.enterUsername(lp.readUsername(1, 0));
		lp.enterPasword(lp.readPassword(2, 0));

		lp.clickOnLoginbtn();

		hp = new HomePage(driver);
		hp.clickOnProducts();
		pp = new ProductPage(driver);
		pp.clickOnPrintMenubtn();
		boolean actual = pp.IsPrintMenuVisible();
		Assert.assertTrue(actual);
		
	}
	@Test

	public void verifyTheAddProductButtonIsVisibleOrNot() throws Exception {
		
		lp = new LoginPage(driver);
		lp.enterUsername(lp.readUsername(1, 0));
		lp.enterPasword(lp.readPassword(2, 0));

		lp.clickOnLoginbtn();

		hp = new HomePage(driver);
		hp.clickOnProducts();
		pp = new ProductPage(driver);
		boolean actual = pp.IsAddProductMenuVisible();
		Assert.assertTrue(actual);
		
	}
	

}
