package Mobile.automation.pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public class AutoConnectAudioPage {
	public AndroidDriver<MobileElement> driver;

	public AutoConnectAudioPage(AndroidDriver<MobileElement> dr) {
		driver = dr;
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(id = ("us.zoom.videomeetings:id/panel_internet"))
	WebElement panel_internet;
	
	@FindBy(id = ("us.zoom.videomeetings:id/img_internet")) WebElement Verifypanel_internet;
	
		public void ClickPanel_internet() {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOf(panel_internet));
			panel_internet.click();
			boolean isSelected = Verifypanel_internet.isSelected();
			if (isSelected == false) {
				Verifypanel_internet.click();
				String s = Verifypanel_internet.getAttribute("content-desc");
				Assert.assertEquals("Selected", s);
				System.out.println(s);
			
		}
	
}
}
