package com.Ecommerce.instasnap.GenericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	@BeforeClass
	public void BrowserSetup()
	{
		Reporter.log("Browser launched successfully",true);
	}
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("login successful",true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout successful",true);
	}
	
	@AfterClass
	public void TerminateBrowser()
	{
		Reporter.log("Browser closed successfully",true);
	}
}
