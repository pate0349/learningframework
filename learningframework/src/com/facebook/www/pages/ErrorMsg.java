package com.facebook.www.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ErrorMsg {

	@FindBy(css="#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")
	private WebElement errormessage;
	
	
	public ErrorMsg(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean errorpage() {
		return errormessage.isDisplayed();
		
	}
	
}
