package Mobile.automation.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TeamChatClass {

	public AndroidDriver<MobileElement> driver;

	public TeamChatClass(AndroidDriver<MobileElement> dr) {
		driver = dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(id = ("us.zoom.videomeetings:id/imgFilterIcon"))
	WebElement imgFilterIcon;
	@FindBy(xpath = ("//android.widget.TextView[@text='Mentions']"))
	WebElement SelectMention;
	@FindBy(xpath = ("//android.widget.TextView[@text='Mentions']"))
	WebElement VerifyMentionIsSelected;
	@FindBy(id = ("us.zoom.videomeetings:id/iconOptCancel"))
	WebElement imgFilterCancel;
	@FindBy(xpath = ("//android.widget.TextView[@text='Direct Messages']"))
	WebElement SelectDirectMessage;
	@FindBy(xpath = ("//android.widget.TextView[@text='Unread']"))
	WebElement SelectUnread;
	@FindBy(xpath = ("//android.widget.TextView[@text='Muted']"))
	WebElement SelectMuted;
	@FindBy(id = "us.zoom.videomeetings:id/imgOptIcon") WebElement Starred;
	
	
	public void ClickimgFilterIcon() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(imgFilterIcon));
		imgFilterIcon.click();
	}
	public void ClickSelectMention() {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(SelectMention));
		SelectMention.click();
		SoftAssert sf = new SoftAssert();
		String ExpectedText = "Mentions";
		wait.until(ExpectedConditions.visibilityOf(VerifyMentionIsSelected));
		String ActualText = VerifyMentionIsSelected.getText();
		System.out.println(ActualText);
		sf.assertEquals(ActualText, ExpectedText);
		sf.assertAll();
	}
	public void ClickimgFilterCancel() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(imgFilterCancel));
		imgFilterCancel.click();
	}
	public void ClickSelectDirectMessage() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(SelectDirectMessage));
		SelectDirectMessage.click();
		SoftAssert sf = new SoftAssert();
		String ExpectedText = "Direct Messages";
		wait.until(ExpectedConditions.visibilityOf(SelectDirectMessage));
		String ActualText = SelectDirectMessage.getText();
		System.out.println(ActualText);
		sf.assertEquals(ActualText, ExpectedText);
		sf.assertAll();
	}
	public void ClickSelectUnread() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(SelectUnread));
		SelectUnread.click();
		SoftAssert sf = new SoftAssert();
		String ExpectedText = "Unread";
		wait.until(ExpectedConditions.visibilityOf(SelectUnread));
		String ActualText = SelectUnread.getText();
		System.out.println(ActualText);
		sf.assertEquals(ActualText, ExpectedText);
		sf.assertAll();
	}
	public void ClickSelectMuted() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(SelectMuted));
		SelectMuted.click();
		SoftAssert sf = new SoftAssert();
		String ExpectedText = "Muted";
		wait.until(ExpectedConditions.visibilityOf(SelectMuted));
		String ActualText = SelectMuted.getText();
		System.out.println(ActualText);
		sf.assertEquals(ActualText, ExpectedText);
		sf.assertAll();
	}
	public void ClickStarred() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(Starred));
		Starred.click();
	}
}
