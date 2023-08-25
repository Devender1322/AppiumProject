package Mobile.automation.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HomePageAfterLogin {
	public AndroidDriver<MobileElement> driver;

	public HomePageAfterLogin(AndroidDriver<MobileElement> dr) {
		driver = dr;
		PageFactory.initElements(dr, this);
	}
	@FindBy(xpath = ("//android.widget.RelativeLayout[@content-desc='Team Chat tab']")) WebElement TeamChatTab;
	
	public void ClickTeamChatTab() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(TeamChatTab));
		TeamChatTab.click();
	}
}
	
	
	 
	
