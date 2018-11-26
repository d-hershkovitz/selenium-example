package com.dean;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

public class SearchGoogleTest extends BasicTest {
	
	@Test 
	public void searchGoogle() {
		driver.get("http://www.google.com");

		GoogleSearchPage searchPage = new GoogleSearchPage(driver);
		assertTrue(searchPage.isInitialized());
		
		ResultPage resultPage = searchPage.search("github d-hershkovitz");

		assertTrue(resultPage.isInitialized());
		
		By xpath = By.xpath("//a[contains(@href, 'https://github.com/d-hershkovitz')]");
		
		assertTrue(resultPage.isContains(xpath));
	}
}
