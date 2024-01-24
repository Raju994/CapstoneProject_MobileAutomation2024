package virtualDevice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class VD_CalculatorTest {
	
	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() throws Exception {
		
		
		//Appium Server Details
		
			String appServer = "http://localhost:4723/wd/hub/";
		
		
		
		//Device Details
		//unique ID
		//platformName
		//platformVersion
			
		DesiredCapabilities caps = new DesiredCapabilities();							//JSON format
		
		caps.setCapability("udid", "emulator-5554");    								//adb devices 
		caps.setCapability("platformName", "Android");									//platformName
//		caps.setCapability("platformVersion", "11.0");
			
		
//		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		
				
		System.out.println("connect to device......");
		
		
		//Application Details
		//appPackage
		//appActivity
		
		//fetch the appPackage and App Activity
		
		//app1 ---- using application APK info
		//clock details
		
//		caps.setCapability("appPackage", "com.google.android.deskclock");
//		caps.setCapability("appActivity", "com.android.deskclock.DeskClock");
		
		
		caps.setCapability("appPackage", "com.google.android.calculator");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
		//send details to appium server ------ JSON format
		
//		{
//			"udid": "unique ID of Device"
//			"platformName": "Android",
//			"platformVersion": "11.0",
//			
//			"appPackage": "app package specific to application",
//			"appActivity": "specific page/screen on application"
//			
//		}
		
		
		
		//appium server logs ------- API call  
//										----- StatusCode/ sessionID / GET/POST / REST API
		
		
		driver = new AppiumDriver<MobileElement>(new URL(appServer), caps);
		
		
		
	}
	
	
	
	@Test
	public void verifyADDFeature() {
		
		//998877 + 998899 = 
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_7")).click();
		driver.findElement(By.id("digit_7")).click();
		
		
		//click on plus icon ----- com.google.android.calculator:id/op_add
		driver.findElement(By.id("op_add")).click();
				
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_9")).click();
		
		
		//click on EQUAL icon ----- com.google.android.calculator:id/eq
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		
		
		//GET THE RESULTS
		String results = driver.findElement(By.id("result_final")).getText();
		
		System.out.println("Results are: " + results);
		
		Assert.assertEquals(results, "1997776");
		
		
		System.out.println("execution of add test feature......");
		
	}

}
