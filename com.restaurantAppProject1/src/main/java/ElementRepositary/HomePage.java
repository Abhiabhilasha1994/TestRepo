package ElementRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ExplicitWait;
import Utilities.GeneralUtility;

public class HomePage {
	
	public WebDriver driver;
	GeneralUtility gu = new GeneralUtility();
	ExplicitWait ew = new ExplicitWait();

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this); // initialization of pagefactory
	}
	
	@FindBy(xpath = "(//*[text()='Product'])[1]")
	public WebElement product;
	
	@FindBy(xpath = "(//*[text()='D4'])[1]")
	public WebElement d4store;
	
	@FindBy(xpath = "//i[@class='fa fa-sign-out fa-lg']")
	public WebElement logout;
	
	@FindBy(xpath = "//*[contains(text(),'Stores')]")
	public WebElement stores;
	
	@FindBy(xpath = "//*[contains(text(),'People')]")
	public WebElement peoples;
	
	public void clickOnPeoples(){
		gu.clickUsingJS(driver, peoples);

	}
	
	
	public boolean isProductTabVisible() {
		return gu.elementDisplayed(product);
	}
	public boolean isD4storeVisible() {
		return gu.elementDisplayed(d4store);
	}
	public void waitToFindProduct() {
		ew.explicitWaitPresenceOfElementsLocated(driver,"(//*[text()='Product'])[1]");
	}
	
	public void waitToFindD4() {
		ew.explicitWaitPresenceOfElementsLocated(driver,"(//*[text()='D4'])[1]");
	}
	
	public void clickOnProducts() {
		gu.clickUsingJS(driver, product);
	}
	
	public void clickOnLogout() {
		gu.clickUsingJS(driver, logout);
	}
	public void clickOnStoresPage(){
		gu.clickUsingJS(driver, stores);

	}
	

}
