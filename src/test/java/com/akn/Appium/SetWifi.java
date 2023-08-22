package com.akn.Appium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SetWifi extends Base {

	@Test
	public void setWify() {
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		//Xpath: //tagName[@attribute=value]
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		driver.findElement(By.id("android:id/edit")).sendKeys("Hello");
		//driver.findElement(AppiumBy.className("android.widget.Button")).get(1).click();
		driver.findElement(By.id("android:id/button1")).click();

	}
}
