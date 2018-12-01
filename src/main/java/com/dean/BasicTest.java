package com.dean;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BasicTest {
	protected static WebDriver driver;
	
	protected final static String GECKO_DRIVER = "webdriver.gecko.driver";
	
	@BeforeClass
	public void setUp() {
		String geckoPath = System.getProperty("user.dir")+File.separator + "geckodriver";
		System.setProperty(GECKO_DRIVER,geckoPath);

		driver = new FirefoxDriver();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Maximize Window
		driver.manage().window().maximize();
	}

	protected void cleanUp() {
		driver.manage().deleteAllCookies();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
