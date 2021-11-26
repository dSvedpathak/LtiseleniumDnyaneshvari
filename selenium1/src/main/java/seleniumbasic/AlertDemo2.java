package seleniumbasic;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("timerAlertButton")).click();
	driver.findElement(By.id("alertButton")).click();
   driver.findElement(By.id("confirmButton")).click();
		String text = driver.switchTo().alert().getText();
		
	String accepti=driver.findElement(By.xpath("//*[@id=\"javascriptAlertsWrapper\"]/div[3]/div[1]")).getText();
		System.out.println(accepti);
		driver.findElement(By.id("promtButton")).click();
		driver.switchTo().alert().sendKeys("Sourabh");
		driver.switchTo().alert().accept();
	}

}
