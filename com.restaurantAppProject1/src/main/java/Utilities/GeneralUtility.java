package Utilities;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

	public class GeneralUtility {

	public String getElementText(WebElement element) {
	String text = element.getText();
	return text;
	}

	public boolean elementDisplayed(WebElement element) {
	boolean textdisplay = element.isDisplayed();
	return textdisplay;
	}

	public boolean elementEnabled(WebElement element) {
	boolean textselect = element.isEnabled();
	return textselect;

	}

	public boolean elementSelected(WebElement element) {
	boolean textunselect = element.isSelected();
	return textunselect;

	}

	public void enterValues(WebElement element, String text) {
	element.sendKeys(text);

	}

	public void clickUsingJS(WebDriver driver, WebElement element) {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", element);

	}

	public void dropdownByValue(WebElement element, String value) {
	Select select = new Select(element);
	select.selectByValue(value);
	}

	public void dropdownByVisibletext(WebElement element, String value) {

	Select select = new Select(element);
	select.selectByVisibleText(value);
	}

	public void dropdownByIndex(WebElement element, int value) {

	Select select = new Select(element);
	select.selectByIndex(value);

	}

	public void addImplicitWait(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void addThreadSleep() throws InterruptedException {
	Thread.sleep(5000);
	}

	public void scrollToFindAnElement(WebElement element, WebDriver driver) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", element);

	}

	}



