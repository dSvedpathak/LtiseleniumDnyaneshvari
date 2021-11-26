package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		
		
		
		List<WebElement>elems=driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]"));
		String name1="Aravind";
		WebElement name=driver.findElement(By.linkText(name1));
		String ID=name.getAttribute("href");
		ID=ID.substring(ID.length()-2);
		WebElement checkBox1=driver.findElement(By.xpath("//*[contains(@id,'_"+ID+"')]"));
		checkBox1.click();
		
	}

}
