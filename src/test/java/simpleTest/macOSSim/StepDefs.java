package simpleTest.macOSSim;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;


import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;

import java.io.File;
import java.net.URL;

import org.junit.Before;
import org.junit.runner.RunWith;

import org.junit.jupiter.api.Test;
//import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;

import org.openqa.selenium.remote.CapabilityType;
 
import org.openqa.selenium.remote.DesiredCapabilities;	
//import io.appium.java_client.ios.IOSDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;

public class StepDefs {
	 
	
	public static WebDriver obj=null;
	
	
	@Test
	
	/*
	 @Before
	    public void setUp() throws Exception {
	 
	        //Appium needs the path of app build
	        //Set up the desired capabilities and pass the iOS SDK version and app path to Appium
	        //File app = new File("/Users/mactester/Desktop/IntegrationApp.app");
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("platformName", "iOS");
	        capabilities.setCapability("deviceName", "iPhone SE");
	        capabilities.setCapability("udid", "32F776B7-2846-4FA7-A138-066AA3CBA429");
	        
	        capabilities.setCapability("automationName", "XCUITest");
	       capabilities.setCapability("app", "/Users/mactester/Desktop/IntegrationApp.app");
	      // capabilities.setCapability("bundleid", "com.facebook.wda.integrationApp");
	        // capabilities.setCapability(CapabilityType.BROWSER_NAME, "iOS");
	       capabilities.setCapability("platformVersion", "11.4");
	       // capabilities.setCapability(CapabilityType.PLATFORM, "Mac");
	       // capabilities.setCapability("app", app.getAbsolutePath());
	 
	        //Create an instance of RemoteWebDriver and connect to the Appium server.
	        //Appium will launch the BmiCalc App in iPhone Simulator using the configurations specified in Desired Capabilities
	        obj = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
	    }
	 */

	@Given("^Open App on Device$")
	public void url_opened() throws Throwable {
		   //Appium needs the path of app build
        //Set up the desired capabilities and pass the iOS SDK version and app path to Appium
        //File app = new File("/Users/mactester/Desktop/IntegrationApp.app");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone SE");
        capabilities.setCapability("udid", "32F776B7-2846-4FA7-A138-066AA3CBA429");
        
        capabilities.setCapability("automationName", "XCUITest");
       capabilities.setCapability("app", "/Users/mactester/Desktop/IntegrationApp.app");
      // capabilities.setCapability("bundleid", "com.facebook.wda.integrationApp");
        // capabilities.setCapability(CapabilityType.BROWSER_NAME, "iOS");
       capabilities.setCapability("platformVersion", "11.4");
       // capabilities.setCapability(CapabilityType.PLATFORM, "Mac");
       // capabilities.setCapability("app", app.getAbsolutePath());
 
        //Create an instance of RemoteWebDriver and connect to the Appium server.
        //Appium will launch the BmiCalc App in iPhone Simulator using the configurations specified in Desired Capabilities
        obj = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
	}
	
	/*
	
	@Given("^url opened$")
	public void url_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		
		//check which os the test is running in
		String os = System.getProperty("os.name").toLowerCase();
		Wedbriver driver = new ChromeDriver();
		if (os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		} else {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");
		}
		driver.get("http:/www.google.com");
		
	
		//System.setProperty("webdriver.gecko.driver","geckodriver");
		//System.setProperty("webdriver.chrome.driver","chromedriver");
	//	System.setProperty("webdriver.chrome.driver", "/home/vin/Downloads/chromedriver");
		System.setProperty("webdriver.chrome.driver", "/chromedriver");
	        obj=new FirefoxDriver();
	
		
		
		//obj=new ChromeDriver();

	        obj.manage().window().maximize();

	        obj.get("https://mail.google.com");
	}

*/



}
