package ElementRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ExcelRead;
import Utilities.ExplicitWait;
import Utilities.GeneralUtility;

public class StoresPage {
	public WebDriver driver;
	GeneralUtility gu = new GeneralUtility();
	ExplicitWait ew = new ExplicitWait();

	public StoresPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this); // initialization of pagefactory
	}

	@FindBy(xpath = "//*[contains(text(),'Stores')]")
	public WebElement stores;

	@FindBy(xpath = "//button[@class=\"btn btn-add btn-lg\"]")
	public WebElement addstores;

	@FindBy(xpath = "//input[starts-with(@id,'Store')]")
	public WebElement storename;

	@FindBy(xpath = "//button[@class=\"btn btn-add\"]")
	public WebElement submitt;

	@FindBy(xpath = "//input[@class=\"form-control input-sm\"]")
	public WebElement search;

	@FindBy(xpath = "//input[@class=\"form-control input-sm\"]")
	public WebElement searchname;

	public boolean isStoresPageVisible() {
		return gu.elementDisplayed(stores);
	}

	public boolean isStoresPageNameVisible() {
		return gu.elementDisplayed(searchname);
	}

	public void clickOnStoresPage() {
		gu.clickUsingJS(driver, stores);

	}

	public void clickOnAddStores() {
		gu.clickUsingJS(driver, addstores);

	}

	public void clickOnAddStoressubmitt() {
		gu.clickUsingJS(driver, submitt);

	}

	public void clickOnSearchbtn() {
		gu.clickUsingJS(driver, search);

	}

	public boolean isAddStorebtnVisible() {
		return gu.elementDisplayed(addstores);
	}

	public void enterSearchStorename(String name) {
		gu.enterValues(searchname, name);

	}

	public void enterStorename(String name) {
		gu.enterValues(storename, name);

	}

	public String readStorename(int a, int b) throws Exception {

		return ExcelRead.ReadExcelXFileNew(a, b);
	}

}
