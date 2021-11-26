package testNGDemo;

import org.testng.annotations.Test;

public class WebLogin {
@Test
public void weblogin() {
	System.out.println("Done");
}
@Test(groups="smoke")
public void passwordvalidation() {
	System.out.println("succesfull");
}
}
