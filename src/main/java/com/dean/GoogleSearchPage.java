package com.dean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage extends PageObject {
	@FindBy(name = "q")
	private WebElement queryLine;

	@FindBy(name = "btnK")
	private WebElement searchButton;
	
	public GoogleSearchPage(WebDriver driver) {
		super(driver);
	}

	public String getQueryLineText() {
		return queryLine.getText();
	}

	public void clearQueryLine() {
		queryLine.clear();
	}
	
	public ResultPage search(String whatToSearch){
		clearQueryLine();
		queryLine.sendKeys(whatToSearch);
		
		searchButton.submit();
		
		waitForPageToComplete(10);
		
		return new ResultPage(driver);
	}
	
	public boolean isInitialized() {
		return queryLine.isDisplayed();
	}
}
