package com.dean;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchGoogleTest extends BasicTest {
	

	@BeforeClass
	public void cleanCookkes(){
		cleanUp();
	}
	
	@Test 
	public void searchGoogle() {
		
		driver.get("http://www.google.com");

		GoogleSearchPage searchPage = new GoogleSearchPage(driver);
		Assert.assertTrue(searchPage.isInitialized());
		
		ResultPage resultPage = searchPage.search("github d-hershkovitz");

		Assert.assertTrue(resultPage.isInitialized());
		
		By xpath = By.xpath("//a[contains(@href, 'https://github.com/d-hershkovitz')]");
		
		Assert.assertTrue(resultPage.isContains(xpath));
	}
}
