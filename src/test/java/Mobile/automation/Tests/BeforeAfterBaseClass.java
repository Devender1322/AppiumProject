package Mobile.automation.Tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import Mobile.automation.utilitise.Readconfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.MobileCapabilityType;

public class BeforeAfterBaseClass extends Readconfig{

	public Logger logs; 
	
@BeforeMethod
//AndroidDriver<MobileElement> Beforetest() throws MalformedURLException
	public void Setup() throws MalformedURLException {
	DesiredCapabilities capabilities = new DesiredCapabilities();

	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("deviceName", "Android");
	capabilities.setCapability("automationName", "UiAutomator2");
	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
	
	capabilities.setCapability("appPackage", "us.zoom.videomeetings"); 
	capabilities.setCapability("appActivity", "com.zipow.videobox.LauncherActivity"); 
	capabilities.setCapability(MobileCapabilityType.APP, "D:\\EclipseFiles\\AppiumProject\\src\\test\\resources\\apps\\Zoom.apk");
	capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "10");

	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	logs = LogManager.getLogger("Appium");
	LocalDriver = new AndroidDriver<MobileElement>(url, capabilities);
	LocalDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	logs.info("App opened");
	
	
	}


}
