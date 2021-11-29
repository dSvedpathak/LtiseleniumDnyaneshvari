package com.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BasePage;
import com.pages.SigninPage;

public class SigninPageTest extends BasePage {
	SigninPage sp = new SigninPage();
	@BeforeMethod
	public void setup()
	{
		initialization();
	}
	
	@Test
	public void validateTitleTest()
	{
		String actual = sp.validateTitle();
		Assert.assertEquals(actual,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test
	public void validateLoginTest() throws InterruptedException
	{
		String user = prop.getProperty("username");
		String passw = prop.getProperty("password");	
		String ans = sp.validateLogin(user,passw);
		Assert.assertEquals(ans,"Hello, Vighnesh");
	}
	
	@Test
	public void validateAddressDisplayTest() throws InterruptedException
	{
		validateLoginTest();
		Assert.assertTrue(sp.validateAddressDisplay());
	}
	
	@AfterMethod
	public void setupend()
	{
		teardown();
	}
}
