package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	static AppiumDriver<MobileElement> driver;


	@BeforeTest
	public  void setup() {
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		caps.setCapability(MobileCapabilityType.UDID, "RZCRA0BS86Z");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
		caps.setCapability("appPackage", "com.yasinkacmaz.jetflix");
		caps.setCapability("appActivity", "com.yasinkacmaz.jetflix.ui.main.MainActivity");

		URL url = null;
		try {
			url = new URL("http://127.0.0.1:4723/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver = new AppiumDriver<MobileElement>(url, caps);
	}
	

	public void sleep(int milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void waitForElementToBeInvisibleVisible(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);

			wait.until(ExpectedConditions.invisibilityOf(driver.findElement(locator)));
		} catch (NoSuchElementException e) {
		}
	}

	public void waitForElementToBeVisible(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);

			wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
		} catch (NoSuchElementException e) {

		}
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	public void click(By locator) {
		driver.findElement(locator).click();
		sleep(200);
	}

	public String getAttributes(By locator,String attribute) {

		return	driver.findElement(locator).getAttribute(attribute);
	}
	

	@AfterTest

	public void teardown() {
		driver.quit();
	}
}
