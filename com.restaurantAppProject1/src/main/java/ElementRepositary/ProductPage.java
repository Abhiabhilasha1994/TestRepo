package ElementRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ExcelRead;
import Utilities.ExplicitWait;
import Utilities.GeneralUtility;

public class ProductPage {
	
	public WebDriver driver;
	GeneralUtility gu = new GeneralUtility();
	ExplicitWait ew = new ExplicitWait();

	public ProductPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this); // initialization of pagefactory
	}

	@FindBy(xpath = "//table[@id='Table']//tr[1]//th[4]")
	public WebElement productDescription;
	
	@FindBy(xpath = "//table[@id='Table']//tr[1]//td[2]")
	public WebElement OrangeShake;
	
	@FindBy(xpath = "//*[@id=\"Table_filter\"]/label/input")
	public WebElement search;
	
	@FindBy(xpath = "//table[@id='Table']//tr[1]//td[1]")
	public WebElement productcode;
	
	@FindBy(xpath = "//a[@class=\"btn btn-red btn-xs\"]")
	public WebElement printmenu;
	
	@FindBy(xpath = "//button[@class=\"btn btn-add btn-lg\"]")
	public WebElement addproductmenu;
	
	@FindBy(xpath = "//input[@class=\"form-control input-sm\"]")
	public WebElement searchproductcode;
	
	
	
	public boolean isProductDescriptionVisible() {
		return gu.elementDisplayed(productDescription);
	}
	
	public boolean IsSearchNameVisible() {
		return gu.elementDisplayed(OrangeShake);
	}
	
	public boolean IsSearchCodeVisible() {
		return gu.elementDisplayed(searchproductcode);
	}
	public boolean IsPrintMenuVisible() {
		return gu.elementDisplayed(printmenu);
	}
	
	public boolean IsAddProductMenuVisible() {
		return gu.elementDisplayed(addproductmenu);
	}
	public void clickOnSearchbtn(){
		gu.clickUsingJS(driver, search);

	}
	
	public void clickOnPrintMenubtn(){
		gu.clickUsingJS(driver, printmenu);

	}
	
	public  void enterSearchname(String name) {
		gu.enterValues(search, name);
		
	}
	
	
	public  void enterSearchProductCode(String name) {
		gu.enterValues(searchproductcode, name);
		
	}
	public String readSearchname(int a, int b) throws Exception {

		return ExcelRead.ReadExcelXFileNew(a, b);
	}
	public  void enterSearchCode(String name) {
		gu.enterValues(productcode, name);
		
	}
	public String readSearchcode(int a, int b) throws Exception {

		return ExcelRead.ReadExcelXFileNew(a, b);
	}
	
	

}
