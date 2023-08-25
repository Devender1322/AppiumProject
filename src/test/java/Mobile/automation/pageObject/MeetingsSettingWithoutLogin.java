package Mobile.automation.pageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class MeetingsSettingWithoutLogin {
	public AndroidDriver<MobileElement> driver;

	public MeetingsSettingWithoutLogin(AndroidDriver<MobileElement> dr) {
		driver = dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(id = ("us.zoom.videomeetings:id/optionAutoConnectAudio"))
	WebElement AutoConnectAudio;

	@FindBy(xpath = ("//android.widget.TextView[@resource-id='us.zoom.videomeetings:id/txtTitle']"))
	WebElement VerifyAutoConnectAudioPage;

	@FindBy(id = ("us.zoom.videomeetings:id/chkAutoMuteMic"))
	WebElement AutoMuteAudio;
	@FindBy(id = ("us.zoom.videomeetings:id/chkOriginalAudio"))
	WebElement CheckOriginalAudio;
	@FindBy(id = ("us.zoom.videomeetings:id/chkNotOpenCamera"))
	WebElement TurnOffMyVideo;
	@FindBy(id = ("us.zoom.videomeetings:id/optionReactionSkinTone"))
	WebElement ReactionSkinTone;
	@FindBy(id = ("us.zoom.videomeetings:id/panel_dark"))
	WebElement SkinToneDark;
	@FindBy(xpath = ("//android.widget.ImageView[@content-desc=\"Selected\"]"))
	WebElement VerifySkinTone;

	

	public void ClickAutoConnectAudio() {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(AutoConnectAudio));
		AutoConnectAudio.click();
		SoftAssert sf = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOf(VerifyAutoConnectAudioPage));
		String ExpectedText = "Auto-Connect to Audio";
		String ActualText = VerifyAutoConnectAudioPage.getText();
		sf.assertEquals(ActualText, ExpectedText);
		sf.assertAll();
	}

	public void EnableAutoMuteAudio() {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(AutoMuteAudio));
		AutoMuteAudio.click();
	}

	public void EnableCheckOriginalAudio() {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(CheckOriginalAudio));
		CheckOriginalAudio.click();
	}

	public void EnableTurnOffMyVideo() {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(TurnOffMyVideo));
		TurnOffMyVideo.click();
	}

	public void ScrollToSkin() {
//		WebDriverWait wait = new WebDriverWait(driver, 25);
//		wait.until(ExpectedConditions.visibilityOf(ReactionSkinTone));
		TouchAction touchAction = new TouchAction (driver);
		touchAction.press(PointOption.point(515, 1694))
        .moveTo(PointOption.point(507, 276))
        .release()
        .perform();
		
	}

	public void ClickReactionSkinTone() {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(ReactionSkinTone));
		ReactionSkinTone.click();
	}

	public void SelectSkinToneDark() {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(SkinToneDark));
		boolean isSelected = VerifySkinTone.isSelected();
		if (isSelected == false) {
			SkinToneDark.click();
			String s = VerifySkinTone.getAttribute("content-desc");
			Assert.assertEquals("Selected", s);
			System.out.println(s);
		}
	}
}
