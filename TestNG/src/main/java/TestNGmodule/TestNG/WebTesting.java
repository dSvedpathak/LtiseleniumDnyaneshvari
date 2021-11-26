package TestNGmodule.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTesting {
	@BeforeTest
public void ValidationLogin() {
		System.out.println("Successfull");
	}
	
@Test
public void ResetPasswordTesting() {
	System.out.println("Successfull");
}
@AfterTest
public void webLogin() {
	System.out.println("Successfull");
}
}
