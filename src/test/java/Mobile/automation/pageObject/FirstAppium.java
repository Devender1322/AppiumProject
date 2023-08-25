package Mobile.automation.pageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class FirstAppium {

	public static void main(String[] args) throws MalformedURLException, InterruptedException, AWTException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "Android");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability(MobileCapabilityType.APP,
				"D:\\EclipseFiles\\AppiumProject\\src\\test\\resources\\apps\\Amazon.apk");
		capabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
		capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Search\"]")).click();
		driver.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text")).sendKeys("Shoe for men");
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		TouchAction touchAction = new TouchAction (driver);
		touchAction.press(PointOption.point(500, 1709)).moveTo(PointOption.point(535, 667)).release().perform();
		Thread.sleep(5000);
		touchAction.tap(new PointOption().withCoordinates(250, 610)).release().perform();
		Thread.sleep(5000);	
		touchAction.press(PointOption.point(559, 1695)).moveTo(PointOption.point(625, 472)).release().perform();
		
		Thread.sleep(2000);	
		
		driver.findElement(By.xpath
				("//android.view.View[@resource-id='addToCart_feature_div']")).click();
		driver.findElement(By.id("com.amazon.mShop.android.shopping:id/cart_count")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='Delete']")).click();
//		driver.findElement(By.xpath("//android.view.View[@content-desc=\"JBL Quantum 910 Wireless Gaming Headset, Black, Large \"]/android.widget.TextView")).isDisplayed();
		
		
		
		
//		driver.findElement(By.id("com.amazon.mShop.android.shopping:id/sign_in_button")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		String elementHierarchy = driver.getPageSource();
//		System.out.println(elementHierarchy);

//		driver.findElement(By.id("us.zoom.videomeetings:id/btnLogin")).click();
//		driver.findElement(By.id("us.zoom.videomeetings:id/edtUserName")).sendKeys("devengodara3@gmail.com");
//		driver.findElement(By.id("us.zoom.videomeetings:id/edtPassword")).sendKeys("@Devender1322@");
//		driver.findElement(By.id("us.zoom.videomeetings:id/btnLoginZoom")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.id("us.zoom.videomeetings:id/zm_permission_guide_notnow")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("us.zoom.videomeetings:id/zm_permission_guide_enable")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc='Team Chat tab']")).click();
//		
//		driver.findElement(By.id("us.zoom.videomeetings:id/imgOptIcon")).click();
		//android.view.ViewGroup[@content-desc="Starred, button, 1 of 7"]/android.widget.ImageView
//		driver.findElement(By.id("us.zoom.videomeetings:id/txtSessionListTitle")).click();
//		driver.findElement(By.id("us.zoom.videomeetings:id/inflatedCommandEditText")).sendKeys("Hello");
//		driver.findElement(By.id("us.zoom.videomeetings:id/btnSend")).click();
		
//		driver.findElement(By.id("us.zoom.videomeetings:id/imgFilterIcon")).click();
//		driver.findElement(By.xpath(
//				"//androidx.recyclerview.widget.RecyclerView[@resource-id='us.zoom.videomeetings:id/menu_list']/android.widget.LinearLayout[1]"))
//				.click();
//		driver.findElement(By.id("us.zoom.videomeetings:id/iconOptCancel")).click();
//		driver.findElement(By.id("us.zoom.videomeetings:id/imgFilterIcon")).click();
//		driver.findElement(By.xpath(
//				"//androidx.recyclerview.widget.RecyclerView[@resource-id='us.zoom.videomeetings:id/menu_list']/android.widget.LinearLayout[2]"))
//				.click();
//		driver.findElement(By.id("us.zoom.videomeetings:id/iconOptCancel")).click();
//		driver.findElement(By.id("us.zoom.videomeetings:id/imgFilterIcon")).click();
//		driver.findElement(By.xpath(
//				"//androidx.recyclerview.widget.RecyclerView[@resource-id='us.zoom.videomeetings:id/menu_list']/android.widget.LinearLayout[3]"))
//				.click();
//		driver.findElement(By.id("us.zoom.videomeetings:id/iconOptCancel")).click();
//		driver.findElement(By.id("us.zoom.videomeetings:id/imgFilterIcon")).click();
//		driver.findElement(By.xpath(
//				"//androidx.recyclerview.widget.RecyclerView[@resource-id='us.zoom.videomeetings:id/menu_list']/android.widget.LinearLayout[4]"))
//				.click();
//		driver.findElement(By.id("us.zoom.videomeetings:id/iconOptCancel")).click();
	

	}

}
