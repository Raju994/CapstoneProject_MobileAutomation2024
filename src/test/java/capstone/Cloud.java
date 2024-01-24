

package capstone;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Cloud {
    RemoteWebDriver driver;
    
    @BeforeTest
    public void setup() throws Exception {
        
        System.out.println("launching an application in Safari browser");
        
        
       
        
        //Accesskey
        String accessKey = Constants.accessKey;
        //Username
        String username =Constants.username;
        
        //BrowserStack Url
        String cloudBrowserStack = "https://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";
   
        //launching a chrome browser 
        DesiredCapabilities caps = new DesiredCapabilities();
        

        //Selecting SafariBrowser
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.SAFARI);
        //Selecting Mobile 
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, Constants.deviceName);
        

        //Selecting Build number and Build Name
        caps.setCapability("build", "Genpact POC - v5.0");
        caps.setCapability("name", "run Safari browser on device - HRM app");
        
        //launching URL 
        driver = new RemoteWebDriver(new URL(cloudBrowserStack), caps);
        
        //Launching OrangeHRM
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(7000);
        
        
    }
    
   
    @Test
    public void verifyLoginFeature() throws Exception {
        
        System.out.println("login test case execution started......");
        
        //Entering UserName
        driver.findElement(By.name("username")).sendKeys("Admin");
        //Entering Password
        driver.findElement(By.name("password")).sendKeys("admin123");
        
        Thread.sleep(4000);
        
        //Click on Login
        driver.findElement(By.tagName("button")).click();
        
        Thread.sleep(4000);
        
        
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
         
    }
    
    @AfterTest
    public void teardown() throws Exception {
        
        Thread.sleep(4000);
        driver.close();
        driver.quit();
        
    }

}
