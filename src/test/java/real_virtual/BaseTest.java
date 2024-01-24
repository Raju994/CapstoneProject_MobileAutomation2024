package real_virtual;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {

	
	AppiumDriver<MobileElement> driver;
	
	
	
	@Parameters("genpactDevice")
	@BeforeTest
	public void setup(String device) throws Exception {
		
		
		System.out.println("=================setup and device details================="+ device);
		
		//appium server
		
		String appServer = "http://localhost:4723/wd/hub/";
		
		
		//real and virtual device
		
		
		String deviceDetails = device;
		DesiredCapabilities caps = new DesiredCapabilities();
		
		
		if(deviceDetails.equalsIgnoreCase("real")) {
			
			System.out.println("==============execution on real device===========================");
			
			caps.setCapability("udid", "c60c1a73");     										//adb devices
			caps.setCapability("platformName", "Android"); 
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//			caps.setCapability("platformVerion", "");   
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "GameMachine");   
			
			
			
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");   
			caps.setCapability(MobileCapabilityType.NO_RESET, true); 							//real devices 
			
			
		}
		
		
		else if (deviceDetails.equalsIgnoreCase("virtual")) {
			System.out.println("==============execution on virtual device============================");
			
			caps.setCapability("udid", "emulator-5554");    								//adb devices 
			caps.setCapability("platformName", "Android");									//platformName
//			caps.setCapability("platformVersion", "11.0");
			
		}
		
		else {


			System.out.println("==============execution on default device real============================");
			caps.setCapability("udid", "c60c1a73");     										//adb devices
			caps.setCapability("platformName", "Android"); 
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//			caps.setCapability("platformVerion", "");   
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "GameMachine");   
			
			
			
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");   
			caps.setCapability(MobileCapabilityType.NO_RESET, true); 	
		}
		
		
		
		
		
		
		
		//Device Details
		
		
		
		
		//Application Details
		//app1 ----- using APK info
		
		caps.setCapability("appPackage", "com.google.android.calculator");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		//create a Appium Driver ref variable
		
		
		driver = new AppiumDriver<MobileElement>(new URL(appServer), caps);
		
		
		
		
		
		
	}
	
	
}
