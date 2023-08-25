package Mobile.automation.utilitise;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Readconfig extends Mobile.automation.Reports.HtmlRoport
{
	Properties properties;
	String path = "D:\\EclipseFiles\\AppiumProject\\Configs\\Configs.properties";
	
	
	public Readconfig() {
		properties = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(path);
			properties.load(fis);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public String getUserName() {
		String value = properties.getProperty("UserName");
		if (value != null) {
			return value;

		} else {
			throw new RuntimeException("UserName is not specified in config file");

		}

	}

	public String getPassword() {
		String value = properties.getProperty("Password");
		if (value != null) {
			return value;

		} else {
			throw new RuntimeException("Password is not specified in config file");

		}

	}
	public String getMessage() {
		String value = properties.getProperty("Message");
		if (value != null) {
			return value;

		} else {
			throw new RuntimeException("Message is not specified in config file");

		}

	}
	public void Takescreenshot() throws IOException {
		Date cdate = new Date();
		String myfilename = cdate.toString().replace(" ", "_").replace(":", "-");
		File f = ((TakesScreenshot) LocalDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("Screenshots/" + myfilename + ".png"));
	}

}
