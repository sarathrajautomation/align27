package BaseClass;
import java.net.URI;
import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class basetest {
	 public AndroidDriver driver;

	    @BeforeMethod
	    public void setup() throws Exception {

	        UiAutomator2Options options = new UiAutomator2Options();
	        options.setPlatformName("Android");
			options.setAutomationName("UiAutomator2");
	
			options.setDeviceName("OPPO K12x 5G");
			options.setUdid("RKSCAECMHY55TWV4");
	
			// OPPO Calculator
			options.setAppPackage("com.dailyinsights");
			options.setAppActivity("com.dailyinsights.activities.SplashActivity"); // Important
			options.setNoReset(true);
			options.setFullReset(false);
	
			options.setCapability("dontStopAppOnReset", true);
			options.setCapability("skipServerInstallation", true);
	
			options.setCapability("uiautomator2ServerInstallTimeout", 60000);
			options.setCapability("adbExecTimeout", 60000);
	
			AndroidDriver driver = new AndroidDriver(
				    new URI("http://127.0.0.1:4723").toURL(), options
				);
			Thread.sleep(10000);

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }

	    @AfterMethod
	    public void tearDown() {

	        if(driver!=null)
	            driver.quit();

	    }

}
