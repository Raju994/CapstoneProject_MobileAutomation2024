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

public class RD_CalculatorTest2 {
	
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
//		caps.setCapability("platformVerion", "13.0");   
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "GameMachine");   
		
		
		
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");   
		caps.setCapability(MobileCapabilityType.NO_RESET, true); 							//real devices 
		
		
		
		//Application Details
		//app1 ----- using APK info
		
		caps.setCapability("appPackage", "com.google.android.calculator");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		//create a Appium Driver ref variable
		
		
		driver = new AppiumDriver<MobileElement>(new URL(appServer), caps);
		
		
		
		
		
		
	}
	
	@Test(priority = -1, description = "TC: verify add feature !!")
	public void verifyAddTest() {
		
		System.out.println("add test feature.....");
		
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
		
	}
	
	
	@Test
	public void verifyMulTest() {
		
		System.out.println("add test feature.....");
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_8")).click();

		
		
		//click on Mul icon ----- com.google.android.calculator:id/op_add
		driver.findElement(By.id("op_mul")).click();
				
		
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
		
		Assert.assertEquals(results, "9977003212");
		
	}
	
	
	
	@Test
	public void verifyDivTest() {
		
		System.out.println("add test feature.....");
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_7")).click();
		driver.findElement(By.id("digit_7")).click();
		
		
		//click on div icon ----- com.google.android.calculator:id/op_add
		driver.findElement(By.id("op_div")).click();
				
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_7")).click();
		driver.findElement(By.id("digit_7")).click();
		
		
		//click on EQUAL icon ----- com.google.android.calculator:id/eq
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		
		
		//GET THE RESULTS
		String results = driver.findElement(By.id("result_final")).getText();
		
		System.out.println("Results are: " + results);
		
		Assert.assertEquals(results, "1");
		
	}
	
	
	
	
	@Test
	public void verifySubTest() {
		
		System.out.println("add test feature.....");
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_7")).click();
		driver.findElement(By.id("digit_7")).click();
		
		
		//click on plus icon ----- com.google.android.calculator:id/op_add
		driver.findElement(By.id("op_sub")).click();
				
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_9")).click();

		
		
		//click on EQUAL icon ----- com.google.android.calculator:id/eq
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		
		
		//GET THE RESULTS
		String results = driver.findElement(By.id("result_final")).getText();
		
		System.out.println("Results are: " + results);
		
		Assert.assertEquals(results, "898988");
		
	}

}
