package Mobile.automation.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class SettingsPage {
	public AndroidDriver<MobileElement> driver;
	
	public SettingsPage(AndroidDriver<MobileElement> dr) {
		driver = dr;
		PageFactory.initElements(dr, this);

	}
	
	@FindBy(id = ("us.zoom.videomeetings:id/btnMeeting")) WebElement MeetingsButton;
	@FindBy(xpath =  ("//android.widget.TextView[@resource-id='us.zoom.videomeetings:id/txtTitle']")) WebElement VerifyMeetingsSettings;
	@FindBy(xpath =  ("//android.widget.TextView[@resource-id='us.zoom.videomeetings:id/txtAutoConnectAudioSelection']"))WebElement VerifyAutoCoOff;
	

		public void ClickMeetingsButton() {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOf(MeetingsButton));
			MeetingsButton.click();
			SoftAssert sf = new SoftAssert();
			wait.until(ExpectedConditions.visibilityOf(VerifyMeetingsSettings));
			String ExpectedText = "Meeting Settings";
			String ActualText = VerifyMeetingsSettings.getText();
			sf.assertEquals(ActualText, ExpectedText);
			String ExpectedText2 = "Off *";
			String ActualText2 = VerifyAutoCoOff.getText();
			sf.assertEquals(ActualText2, ExpectedText2);
			sf.assertAll();
			
		}

	
}
