package com.facebook.www.scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.facebook.www.pages.ErrorMsg;
import com.facebook.www.pages.Login;

import utils.GenericMethods;

public class VerifyErrorMsg {

	WebDriver driver;
	@BeforeTest
	public void oppenapplication() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	@Test
	public void verifyinvalidcredential() throws IOException {
		Login lp =new Login(driver);
		ErrorMsg Em = new ErrorMsg(driver);
		
		
		String[][] data = GenericMethods.getData("C:\\selenium testing\testdata.xlsx", "sheet2");
		
		for(int i = 1;i<data.length;i++){
		
		lp.loginapplication("data[i][0]","data[i][1]");
	    boolean errormsg=Em.errorpage();
	    Assert.assertTrue(errormsg);
		}
		
		
	}
	@AfterTest
	public void closeapplication() {
		driver.close();
		
	}
}
