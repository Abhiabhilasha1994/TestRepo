package ExecuteClasses;

import org.testng.annotations.Test;

import Utilities.Screenshot;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	WebDriver driver;
	public static Properties property;
	public Screenshot sh;

	public static void readProperty() throws IOException {
		property = new Properties();
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\resources\\Config.properties");
		property.load(fs);
	}

	@BeforeMethod(groups={"open"})
	@Parameters("browser")
	public void beforeMethod(String browserValue) throws IOException {
		readProperty();

		if(browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty(property.getProperty("ChromeSystemProperty"),
					System.getProperty("user.dir") + property.getProperty("ChromeDriverPath"));
			driver = new ChromeDriver();

		}
		else if(browserValue.equalsIgnoreCase("edge")) {
			System.setProperty(property.getProperty("EdgeSystemProperty"),
					System.getProperty("user.dir") + property.getProperty("EdgeDriverPath"));
			driver = new EdgeDriver();
		}

		driver.get(property.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterMethod(groups={"close"})
	public void afterMethod(ITestResult itr) throws IOException {
		if (itr.getStatus() == ITestResult.FAILURE) {

			sh = new Screenshot();
			sh.takeScreenShot(driver, itr.getName());
		}
		driver.close();

	}

}