package Mobile.automation.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import Mobile.automation.utilitise.Readconfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SignInPage {
	public AndroidDriver<MobileElement> driver;

	public SignInPage(AndroidDriver<MobileElement> dr) {
		driver = dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(id = ("us.zoom.videomeetings:id/edtUserName"))
	WebElement edtUserName;
	@FindBy(id = ("us.zoom.videomeetings:id/edtPassword"))
	WebElement edtPassword;
	@FindBy(id = ("us.zoom.videomeetings:id/btnLoginZoom"))
	WebElement btnLoginZoom;
	@FindBy(id = ("us.zoom.videomeetings:id/zm_permission_guide_notnow"))
	WebElement btnNotnow;
	@FindBy(id = ("us.zoom.videomeetings:id/zm_permission_guide_enable"))
	WebElement btnGetStart;
	@FindBy(xpath  = ("//android.widget.TextView[@resource-id='us.zoom.videomeetings:id/txtTitle']"))
	WebElement VerifyHomePage;
	@FindBy(xpath  = ("//android.widget.TextView[@resource-id='us.zoom.videomeetings:id/zm_permission_guide_title']"))
	WebElement VerifyNevermissyourmeeting;
	@FindBy(xpath  = ("//android.widget.TextView[@resource-id='us.zoom.videomeetings:id/zm_permission_guide_title']"))
	WebElement VerifyYourereadytogo;
	
	public void EnterEmailid() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(edtUserName));
		Readconfig rg = new Readconfig();
		edtUserName.click();
		edtUserName.sendKeys(rg.getUserName());

	}

	public void EnterPassword() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(edtPassword));
		Readconfig rg = new Readconfig();
		edtPassword.click();		
		edtPassword.sendKeys(rg.getPassword());

	}
	public void ClickSignInBtn() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(btnLoginZoom));
		btnLoginZoom.click();
		SoftAssert sf = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOf(VerifyNevermissyourmeeting));
		String ExpectedText = "Never miss your meeting";
		String ActualText = VerifyNevermissyourmeeting.getText();
		sf.assertEquals(ActualText, ExpectedText);
		sf.assertAll();

	}
	public void ClickbtnNotnow() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(btnNotnow));
		btnNotnow.click();
		SoftAssert sf = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOf(VerifyYourereadytogo));
		String ExpectedText = "You're ready to go!";
		String ActualText = VerifyYourereadytogo.getAttribute("content-desc");
		sf.assertEquals(ActualText, ExpectedText);
		sf.assertAll();

	}
	public void ClickbtnGetStart() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(btnGetStart));
		btnGetStart.click();
		SoftAssert sf = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOf(VerifyHomePage));
		String ExpectedText = "Meetings";
		String ActualText = VerifyHomePage.getText();
		sf.assertEquals(ActualText, ExpectedText);
		sf.assertAll();
	}
}