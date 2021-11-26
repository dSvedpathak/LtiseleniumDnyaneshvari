package seleniumbasic;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Orangehrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_Job\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewJobTitleList\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"jobTitle_jobTitle\"]")).sendKeys("Software Developer");
		driver.findElement(By.xpath("//*[@id=\"jobTitle_jobDescription\"]")).sendKeys("Software testing and Database Management");
		driver.findElement(By.xpath("//*[@id=\"jobTitle_note\"]")).sendKeys("Minimum 2-4 yrs of Experience");
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
        
	}

}
