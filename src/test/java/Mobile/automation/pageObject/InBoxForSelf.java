package Mobile.automation.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Mobile.automation.utilitise.Readconfig;

public class InBoxForSelf {
	WebDriver driver;
	public InBoxForSelf (WebDriver dr) {
		driver = dr;
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(id = "us.zoom.videomeetings:id/inflatedCommandEditText") WebElement ChatTextField;
	@FindBy(id = "us.zoom.videomeetings:id/btnSend") WebElement ChatSendBtn;
	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Audio message\"]") WebElement Audiomessage;
	
	
	public void clickChatTextField() {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(ChatTextField));
		Readconfig rg = new Readconfig();
		ChatTextField.sendKeys(rg.getMessage());
	}
	public void clickChatSendBtn() {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(ChatSendBtn));
		ChatSendBtn.click();
		boolean isEnabled = Audiomessage.isDisplayed();
	
		if  (isEnabled == true)
			System.out.println("Message sent");
		else 
			System.out.println("Message not sent");
		
	
	}
}
