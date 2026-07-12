package tests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import reportmanager.extendReport;
import utility.utils;

public class login {
	ExtentReports extent;
	ExtentTest test;
	UiAutomator2Options options;
	AndroidDriver driver;
	@BeforeTest
	private void baseSetup() throws InterruptedException, MalformedURLException, URISyntaxException {
		extent = extendReport.getReport();

		 test = extent.createTest("Login Test");
		 options = new UiAutomator2Options();

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

		 driver = new AndroidDriver(
			    new URI("http://127.0.0.1:4723").toURL(), options
			);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
		@Test
		private void launchApp() throws InterruptedException, IOException {
			driver.findElement(AppiumBy.id("com.dailyinsights:id/txtContinue")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(AppiumBy.id("com.dailyinsights:id/txtSkip")).click();
			// Close keyboard
			Thread.sleep(10000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			driver.findElement(AppiumBy.id("com.dailyinsights:id/login_txt")).click();
			driver.findElement(AppiumBy.id("com.dailyinsights:id/edtEmail")).sendKeys("testinge428@gmail.com");
			driver.findElement(AppiumBy.id("com.dailyinsights:id/edtPassword")).sendKeys("Password123@");
			driver.findElement(AppiumBy.id("com.dailyinsights:id/txtLogin")).click();
			String screenshot =
			        utils.takeScreenshot(driver, "Login");

			test.pass("Login Successful")
			    .addScreenCaptureFromPath(screenshot);
			


		}
		@AfterTest
		private void closeSession() {
			// TODO Auto-generated method stub
			extent.flush();

			driver.quit();

		}
		
	
		

}