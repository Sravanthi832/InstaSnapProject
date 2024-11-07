package com.Ecommerce.instasnap.ProductTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Ecommerce.instasnap.GenericLibrary.BaseTest;

public class VerifyKidsProduct extends BaseTest {

	@Test(priority=1)
	public void createProduct()
	{
		Reporter.log("kids product created",true);
	}
	@Test(priority=2,invocationCount=2,dependsOnMethods="createProduct")
	public void updateProduct()
	{
		Reporter.log("kids product updated",true);
	}
}
