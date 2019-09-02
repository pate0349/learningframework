package com.facebook.www.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(id="loginbutton")
	private WebElement loginbtn;
	
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginapplication(String username, String password) {
		email.sendKeys(username);
		pass.sendKeys(password);
		loginbtn.click();
	}
	
}
