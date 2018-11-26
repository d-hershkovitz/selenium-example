package com.dean;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicTest {
	protected static WebDriver driver;
	
	protected final static String GECKO_DRIVER = "webdriver.gecko.driver";
	
	@BeforeClass
	public static void setUp() {
		String geckoPath = System.getProperty("user.dir")+File.separator + "geckodriver";
		System.setProperty(GECKO_DRIVER,geckoPath);

		driver = new FirefoxDriver();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Maximize Window
		driver.manage().window().maximize();
	}

	@After
	public void cleanUp() {
		driver.manage().deleteAllCookies();
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}
