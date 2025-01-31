package com.smartfren;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTestClass {

	@BeforeMethod
	public void setUp() {
		initializeBrowser("firefox");
	}

	@Test (priority=1)
	public void login() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys("EIADMIN");
//		driver.findElement(By.id("username")).sendKeys("EIADMIN");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("Admin@1234");
//		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		driver.findElement(By.id("submit")).click();
	}
}
