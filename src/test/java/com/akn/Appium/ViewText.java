package com.akn.Appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ViewText extends Base {

	@Test
	public void testText() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Buttons\"]")).click();
		String normalButtonText = driver.findElement(By.id("io.appium.android.apis:id/button_normal")).getText();
		
		Assert.assertEquals(normalButtonText, "Normal");
	}
}
