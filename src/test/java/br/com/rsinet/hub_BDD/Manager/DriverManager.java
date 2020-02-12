package br.com.rsinet.hub_BDD.Manager;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import br.com.rsinet.hub_BDD.Utils.Config;
import io.appium.java_client.android.AndroidDriver;

public class DriverManager {

	private AndroidDriver<WebElement> driver;
	
	public DriverManager() {
		FileReaderManager.getInstance().getConfigReader().getBrowser();
	}

	public AndroidDriver<WebElement> getDriver() throws MalformedURLException {
		if (driver == null)
			driver = createDriver();
		return driver;
	}

	public AndroidDriver<WebElement> createDriver() throws MalformedURLException {

		Config configFileReader = new Config();
		DesiredCapabilities caps = new DesiredCapabilities();

		caps = new DesiredCapabilities();
		caps.setCapability("deviceName", configFileReader.getDeviceName());
		caps.setCapability("udid", configFileReader.getUdid());
		caps.setCapability("platformName", configFileReader.getPlatformName());
		caps.setCapability("platformVersion", configFileReader.getPlatformVersion());
		caps.setCapability("appPackage", configFileReader.getAppPackage());
		caps.setCapability("appActivity", configFileReader.getAppActivity());
		caps.setCapability("unicodeKeyboard", true);   
	      caps.setCapability("resetKeyboard", true);
//	      URL url = new URL("http://127.0.0.1:4723/wd/hub");

	      if(driver ==null )
	    	  
	  		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		return driver;
	}
			
	public void fecharDriver() {
		driver.quit();
	}

	public void reset() {
		driver.resetApp();
	}
}

