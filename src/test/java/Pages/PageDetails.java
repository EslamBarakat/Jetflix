
package Pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import tests.BaseClass;

public class PageDetails extends BaseClass {
	
	AppiumDriver<MobileElement> driver;

	public PageDetails(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	private By movieRate = By.xpath("//*[@text = 'Vote Avg']/following-sibling::android.widget.TextView[1]");
    private By firstMovieTitlePD = By.xpath("//android.widget.TextView[@index=\"4\"]");
    private By backButton = By.xpath("//android.view.View[@content-desc=\"Go Back\"]");
    

	public String getMovieRate() {
		return getText(movieRate);			
	}
	
	public String getFirstMovieTitlePD() {

		return getText(firstMovieTitlePD);		
	}
	
	public void clickBackButton() {
		
		click(backButton);
	}
}


