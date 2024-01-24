

package browseStack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Orange_Hrm {
    RemoteWebDriver driver;
    
    @BeforeTest
    public void setup() throws Exception {
        
        System.out.println("launching an application in chrome browser");
        
        
        //browserStack details
        //
        //
        
        
        String accessKey = "PT59X3SuFxDEQ3btDzgz";
        String username ="raju_0nVoUe";
        
        String cloudBrowserStack = "https://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";
        
        
        
        
        
        
        
        
        
        
        
        
        //launching a chrome browser
        
        DesiredCapabilities caps = new DesiredCapabilities();
        
//        caps.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.SAFARI);
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy S23");
        
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.SAFARI);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iphone 13 pro");
        
//        caps.setCapability("build", "Genpact POC - v1.0");
//        caps.setCapability("name", "run chrome browser on device - HRM app");
        
        caps.setCapability("build", "Genpact POC - v2.0");
        caps.setCapability("name", "run Safari browser on device - HRM app");
        
        
        
        
        
        driver = new RemoteWebDriver(new URL(cloudBrowserStack), caps);
        
        
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(7000);
        
        
    }
    
    
    
    @Test
    public void verifyLoginFeature() throws Exception {
        
        System.out.println("login test case execution started......");
        
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        
        Thread.sleep(4000);
        
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
