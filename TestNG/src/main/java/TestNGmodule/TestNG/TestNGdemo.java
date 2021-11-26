package TestNGmodule.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGdemo {
	@Test
	public void login(){
		System.out.println("Login succ");
	}
	@BeforeMethod
	public void launchapplication( ) {
	System.out.println("BeforeMethod");
	}
	@Test
	public void password() {
	System.out.println("Password");
	}
	
	@AfterMethod
	public void closeapplication() {
	System.out.println("AfterMethod");
	}
	@Test
	public void homepagevalidation() {
	System.out.println("Validating Home Page");
}
}
	