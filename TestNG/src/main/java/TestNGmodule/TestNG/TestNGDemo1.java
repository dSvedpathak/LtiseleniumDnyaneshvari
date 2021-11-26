package TestNGmodule.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo1 {
	WebDriver driver;
	

	@BeforeMethod
	public void setUp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	@Test
	public void validateTitle() {
	String title = driver.getTitle();
	boolean head=title.equalsIgnoreCase("OrangeHRM");	
	Assert.assertTrue(head);
	}
	
	@Test
	public void validateUsername() {
	boolean userName=driver.findElement(By.id("txtUsername")).isDisplayed();
	Assert.assertTrue(userName);
	}
	
	@Test
	public void validateLoginPanel() {
	String txt=driver.findElement(By.id("logInPanelHeading")).getText();
	Assert.assertEquals(txt, "LOGIN Panel");
	}
	
	@Test
	public void validateRecord() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		driver.findElement(By.name("searchSystemUser[userName]")).sendKeys("ajay");
		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
		String record=driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr/td")).getText();
		Assert.assertEquals(record, "No Records Found");
	}
	
	@Test
	public void validateRec() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		driver.findElement(By.name("searchSystemUser[userName]")).sendKeys("aravind");
		boolean name=driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr/td[2]")).isDisplayed();
		Assert.assertTrue(name);
		
	}
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
}