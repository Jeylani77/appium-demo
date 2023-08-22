package com.akn.Appium;

//import io.appium.java_client.AppiumBy;

//import java.io.File;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
//import io.appium.java_client.service.local.AppiumServiceBuilder;
//import io.appium.java_client.service.local.AppiumServiceBuilder;

//import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
//import java.util.HashMap;
//import java.util.Map;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;

public class Base {

	public AndroidDriver driver;
	public AppiumDriverLocalService service;

	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException, InterruptedException {
		
//		Map<String, String> env = new HashMap<String, String>(System.getenv());
//		env.put("ANDROID_HOME", "C:\\Users\\LENOVO\\AppData\\Local\\Android\\Sdk");
//		env.put("JAVA_HOME", "C:\\Program Files\\Java\\jdk1.8.0_301");
		//run appium service auto
		
		/*
		 * service = new AppiumServiceBuilder() .withAppiumJS( new File(
		 * "C:\\Users\\LENOVO\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js"
		 * )) .withIPAddress("127.0.0.1").usingPort(4723) .withEnvironment(env)
		 * .withTimeout(Duration.ofSeconds(300)).build(); service.start();
		 */
		
		
		//create capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("AKNDevice");
		options.setApp(System.getProperty("user.dir")+"\\src\\test\\java\\ressources\\ApiDemos-debug.apk");
		
		//create object for android driver
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		
		//objects locators : id, xpath, className, accessibilityId, androidUIautomator
		//driver.findElement(AppiumBy.accessibilityId("Graphics")).click();
		
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		//service.stop();
	}
}
