package realDevice;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class RD_ClockAppTest {
	
	AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void setup() throws Exception {
		
		
		System.out.println("=================setup=================");
		
		//appium server
		
		String appServer = "http://localhost:4723/wd/hub/";
		
		
		
		//Device Details
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("udid", "c60c1a73");     										//adb devices
		caps.setCapability("platformName", "Android"); 
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		caps.setCapability("platformVerion", "");   
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "GameMachine");   
		
		
		
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");   
		caps.setCapability(MobileCapabilityType.NO_RESET, true); 							//real devices 
		
		
		
		//Application Details
		//app1 ----- using APK info
		
		
		//calculator app
//		caps.setCapability("appPackage", "com.google.android.calculator");
//		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
		
		//app2  ----- appPackage and appActivity
		//adb command   
		//com.google.android.calculator ----------------com.android.calculator2.Calculator
//		adb shell dumpsys window | find "mCurrentFocus"
//		  mCurrentFocus=Window{a231b15 u0 com.google.android.calculator/com.android.calculator2.Calculator}
		
		//mCurrentFocus=Window{a231b15 u0 com.google.android.calculator/com.android.calculator2.Calculator}
		
		
		//clock
//		mCurrentFocus=Window{9d27b51 u0 com.coloros.alarmclock/com.oplus.alarmclock.AlarmClock}
		
		
		caps.setCapability("appPackage", "com.coloros.alarmclock");
		caps.setCapability("appActivity", "com.oplus.alarmclock.AlarmClock");
		
		
		
		
		
		//create a Appium Driver ref variable
		
		
		driver = new AppiumDriver<MobileElement>(new URL(appServer), caps);
		
		
		
		
		
		
	}
	
	@Test
	public void verifyAddTest() {
		
		System.out.println("identify element using locator strategy.....");
		
		
		
		
		
	}

}
