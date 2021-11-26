package seleniumbasic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingApplication {
public static void main(String args[]) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/*");
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.id("pass")).sendKeys("aaa");
	driver.findElement(By.id("u_0_d_6s")).clear();
}
}
