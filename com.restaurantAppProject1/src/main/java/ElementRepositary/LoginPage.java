package ElementRepositary;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ExcelRead;
import Utilities.ExplicitWait;
import Utilities.GeneralUtility;

public class LoginPage {
	public WebDriver driver;
	GeneralUtility gu = new GeneralUtility();
	ExplicitWait ew = new ExplicitWait();

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this); // initialization of pagefactory
	}

	@FindBy(xpath = "//input[@name='username']")
	public WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;
	@FindBy(xpath = "//input[@name='submit']")
	public WebElement loginBtn;
	@FindBy(className = "icon-bar")
	public WebElement iconbar;
	@FindBy(xpath = "//h1[text()='Login']")
	public WebElement loginText;//*[@id="login-modal"]/div/div/h1
	@FindBy(xpath ="//*[contains(text(),'admin Doe')]")
	public WebElement admin;
	@FindBy(xpath ="//img[@src='https://qalegend.com/restaurant/files/Setting/ea28fde2b923e00cc7c205fd95f0b5bb.jpg']")
	public WebElement logo;

	public boolean isAdminVisibled() {
		return gu.elementDisplayed(admin);

	}
	public boolean isLoginTextVisible() {
		return gu.elementDisplayed(loginText);
	}
	public boolean isLogoVisible() {
		return gu.elementDisplayed(logo);
	}

	public  void enterUsername(String uname) {
		gu.enterValues(username,uname);
	}
	public void enterPasword(String pwd) {
		gu.enterValues(password, pwd);
	}

	public void waitToFindAdmin() {
		ew.explicitWaitPresenceOfElementsLocated(driver,"//*[contains(text(),'admin Doe')]");
	}
	public String readUsername(int a, int b) throws Exception {

		return ExcelRead.ReadExcelXFileNew(a, b);
	}
	public String readPassword(int a,int b) throws IOException {
		return ExcelRead.ReadExcelXFileNew(a, b);
	}
	public void clickOnLoginbtn(){
		gu.clickUsingJS(driver, loginBtn);

	}



}
