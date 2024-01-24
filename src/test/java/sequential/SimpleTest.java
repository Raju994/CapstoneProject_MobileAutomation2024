package sequential;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileCapabilityType;

public class SimpleTest {
    
    RemoteWebDriver driver;
   
    
    @Parameters("device")
    @BeforeTest
    public void setup(String div_xml) throws Exception {


        String device = Constants.deviceName2;
        System.out.println("=================setup connect with cloud=================" + device + " : "+ div_xml);
        
        //browserStack details
        //HPYdq7hzku1SkwCQzxKq
        //neerajrangu_oDVmO0
        
        
        String accessKey = "PT59X3SuFxDEQ3btDzgz";
        String username ="raju_0nVoUe";
        
        String cloudBrowserStack = "https://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";
        
        
        DesiredCapabilities caps = new DesiredCapabilities();
        
//      caps.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.CHROME);
//      caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 3a");
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO A96");
        
        
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, div_xml);
        
        
        //caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\91995\\Downloads\\Appium-20240115T105035Z-001\\Appium\\sampleApp\\ApiDemos-debug.apk");
        
        //cloud services
        caps.setCapability(MobileCapabilityType.APP, "bs://52bc1d8a96b83f33caed7af61140085d38d0161f");
        
        caps.setCapability("build", "Genpact POC - v1.0 sampleApp");
        caps.setCapability("name", "run app on cloud device - sample app");
        
        
        
        
        
        driver = new RemoteWebDriver(new URL(cloudBrowserStack), caps);
        
        
        
        
        //create a Appium Driver ref variable
        
        
        
    }
    
    
    
    @Test
    public void verifyAPIDEMOTest() throws Exception {
        
        //application ----- iOS and Android  
        //properties ----- common for android/iOS
        
        //ioS ---- AccessibilityId   ------ OS
        //android ---- content-desc  ------ OS
        
        //locator ----- 
        
        Thread.sleep(5000);
        
        System.out.println("identify element using locator strategy.....");
        
        
        
        
        List<WebElement> allElement = driver.findElements(By.id("android:id/text1"));           
        
        System.out.println("element count are : "+ allElement.size());
        
        
        
        for (int i = 0; i < allElement.size(); i++) {
            
            
            String ele_text = allElement.get(i).getText();
            System.out.println("================================================");
            
            System.out.println("===============element Text: " + ele_text);
            
            
            
            
            
            if(ele_text.equalsIgnoreCase("OS")) {
                
                
                allElement.get(i).click();
                break;
            }
            
            System.out.println("================================================");
            
            
        }
        
        Thread.sleep(5000);
     
        
        
        
    }

}