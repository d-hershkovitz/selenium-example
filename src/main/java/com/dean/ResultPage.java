package com.dean;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends PageObject{

	@FindBy(className = "srg" )
	private WebElement resultContent;
	
	public ResultPage(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		return resultContent!=null;
	}
	
	public boolean isContains(By byToFind){
		WebElement node = resultContent.findElement(byToFind);
		
		return node!=null;
	}
}
