
package Pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import tests.BaseClass;

public class Filters extends BaseClass {

	AppiumDriver<MobileElement> driver;

	public Filters(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	private By close = By.xpath("//*[@content-desc=\"Close\"]");
	private By voteAverage = By.xpath("//*[@text = 'Vote Average']");
	private By Ascending = By.xpath("//*[@text = 'Ascending']");
	private By Descending = By.xpath("//*[@text = 'Descending']");
	private By Reset = By.xpath("//*[@text='RESET']");
	private By descendingRadioButton = By.xpath("(//android.view.View[@index ='0' and .//*[@text='Descending']])[2]");
	private By ascendingRadioButton = By.xpath("(//android.view.View[@index ='1' and .//*[@text='Ascending']])[2]");

	public void clickVoteAverage() {
		waitForElementToBeVisible(voteAverage);
		click(voteAverage);
		//This for loading time
		sleep(2000);
	}

	public void clickAscending() {
		waitForElementToBeVisible(Ascending);
		click(Ascending);
		//This for loading time
		sleep(2000);
	}

	public void clickDescending() {
		waitForElementToBeVisible(Descending);
		click(Descending);
		//This for loading time
		sleep(2000);
	}

	public void closeFilters() {

		click(close);
		waitForElementToBeVisible(close);
	}

	public void clickResetButton() {

		click(Reset);
		//This for loading time
		sleep(2000);
	}

	public boolean isAscendingRadioButtonedChecked() {

		return driver.findElement(ascendingRadioButton).getAttribute("checked").equalsIgnoreCase("true");
	}

	public boolean isDescendingRadioButtonedChecked() {

		return driver.findElement(descendingRadioButton).getAttribute("checked").equalsIgnoreCase("true");

	}
}




