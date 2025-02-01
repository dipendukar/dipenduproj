package com.smartfren;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutPageTest extends BaseTestClass {

	@BeforeMethod
	public void setUp() {
		initializeBrowser("firefox");
		LoginPageTest loginTest = new LoginPageTest();
		loginTest.login();
	}

	@Test(priority=2)
	public void logouttest() throws InterruptedException {
		
		Thread.sleep(6000);
		driver.findElement(By.id("dashboard_uname")).click();
		WebElement logoutBtn = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));

		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.moveToElement(logoutBtn).click().perform();
	}
    @AfterMethod
    public void tearDown() {
        quitBrowser();
    }

}
