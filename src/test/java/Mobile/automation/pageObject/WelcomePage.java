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

public class WelcomePage {
	public AndroidDriver<MobileElement> driver ;

	public WelcomePage(AndroidDriver<MobileElement> dr) {
		driver = dr;
		PageFactory.initElements(dr, this);
		
	
	}

	@FindBy(xpath = ("//android.widget.ImageButton[@content-desc=\"Settings\"]"))
	WebElement SettingsButton;
	@FindBy(xpath = ("//android.widget.TextView[@content-desc=\"Settings\"]"))
	WebElement VerifySettingsPage;
	@FindBy(id = ("us.zoom.videomeetings:id/btnLogin"))
	WebElement SignInButton;
	
		public void clickSettingbutton() {
			WebDriverWait wait = new WebDriverWait(driver, 25);
			wait.until(ExpectedConditions.visibilityOf(SettingsButton));
			SettingsButton.click();
			SoftAssert sf = new SoftAssert();
			String ExpectedText = "SETTINGS";
			String ActualText = VerifySettingsPage.getText();
			System.out.println(ActualText);
			sf.assertEquals(ActualText, ExpectedText);
			sf.assertAll();
		}
		
		public void clickSignIn() {
			WebDriverWait wait = new WebDriverWait(driver, 25);
			wait.until(ExpectedConditions.visibilityOf(SignInButton));
			SignInButton.click();
		}
}

