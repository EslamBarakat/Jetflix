package Pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import tests.BaseClass;

public class HomePage extends BaseClass{
	AppiumDriver<MobileElement> driver;

	public HomePage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	private By filter = By.xpath("//*[@content-desc = 'Filter & Sort Movies']");
	private By moviesList = By.xpath("//*[contains(@content-desc , 'Poster Image of')]");
	private By loader = By.xpath("//*[@text = 'Fetching Movie Detail']");
   
    
    public void clickFilter() {
    	waitForElementToBeVisible(filter);
		click(filter);
		waitForElementToBeVisible(filter);
	}

	public void selectFirstMovieInList() {
		driver.findElements(moviesList).get(0).click();
		waitForElementToBeVisible(loader);
		waitForElementToBeInvisibleVisible(loader);
	}
	
	  
	  public String getTitleHomePage() {
		  
		  //This is for loading
		    sleep(2000);
			String poster = driver.findElement(moviesList).getAttribute("content-desc");
			return	poster.replace("Poster Image of ", "");
		}   	
}
