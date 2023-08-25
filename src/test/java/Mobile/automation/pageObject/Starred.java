package Mobile.automation.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Starred {
	WebDriver driver;
	
	public Starred (WebDriver dr) {
		driver = dr;
		PageFactory.initElements(dr, this);
	}
	
	
	@FindBy(id = "us.zoom.videomeetings:id/txtSessionListTitle") WebElement Chats;
	
	
	public void clickChat() {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(Chats));
		Chats.click();
	}
}
