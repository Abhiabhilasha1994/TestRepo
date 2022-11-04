package ElementRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ExcelRead;
import Utilities.ExplicitWait;
import Utilities.GeneralUtility;

public class WaiterPage {
	public WebDriver driver;
	GeneralUtility gu = new GeneralUtility();
	ExplicitWait ew = new ExplicitWait();

	public WaiterPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this); // initialization of pagefactory
	}
	
	@FindBy(xpath = "//*[contains(text(),'People')]")
	public WebElement peoples;
	
	@FindBy(xpath = "//*[contains(text(),'Waiters')]")
	public WebElement waiters;
	
	@FindBy(xpath = "//button[@class=\"btn btn-add btn-lg\"]")
	public WebElement addwaiter;
	

	@FindBy(xpath = "//input[@id=\"WaiterName\"]")
	public WebElement waitername;
	
	@FindBy(xpath = "//button[@class=\"btn btn-add\"]")
	public WebElement waitersubmitt;
	
	@FindBy(xpath = "//input[@class=\"form-control input-sm\"]")
	public WebElement search;
	
	@FindBy(xpath = "//input[@class=\"form-control input-sm\"]")
	public WebElement searchname;
	
	@FindBy(xpath = "//input[@class=\"form-control input-sm\"]")
	public WebElement searchmobilenumber;
	

	public boolean isAddWaitersPageVisible() {
		return gu.elementDisplayed(addwaiter);
	}
	
	public boolean isWaitersPageVisible() {
		return gu.elementDisplayed(waiters);
	}
	
	public boolean isSearchNameVisible() {
		return gu.elementDisplayed(searchname);
	}
	
	public boolean isSearchMobileNumberVisible() {
		return gu.elementDisplayed(searchmobilenumber);
	}
	
	
	
	public void clickOnPeoples(){
		gu.clickUsingJS(driver, peoples);

	}
	

	public void clickOnSearch(){
		gu.clickUsingJS(driver, search);

	}
	public void clickOnWaiters(){
		gu.clickUsingJS(driver, waiters);

	}
	
	public void clickOnWaitersSubmitt(){
		gu.clickUsingJS(driver, waitersubmitt);

	}
	
	public void clickOnAddWaiters(){
		gu.clickUsingJS(driver, addwaiter);

	}
	
	public  void enterSearchname(String name) {
		gu.enterValues(searchname, name);
		
	}
	
	public  void enterSearchMobileNumber(String name) {
		gu.enterValues(searchmobilenumber, name);
		
	}
	
	public  void enterWaitername(String name) {
		gu.enterValues(waitername, name);
		
	}
	
	public String readWaitername(int a, int b) throws Exception {

		return ExcelRead.ReadExcelXFileNew(a, b);
	}
	
	
	
	

}
