package seleniumbasic;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AlretDemo1 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Alert alrt1=driver.switchTo().alert();
		Thread.sleep(3000);
		alrt1.accept();
		Thread.sleep(3000);
	driver.findElement(By.id("timerAlertButton")).click();
	Alert alrt2=driver.switchTo().alert();
		Thread.sleep(5000);
		alrt2.accept();
		Thread.sleep(3000);
		
		
	driver.findElement(By.id("confirmButton")).click();
		Alert alrt3=driver.switchTo().alert();
		Thread.sleep(3000);
		alrt3.accept();
		Thread.sleep(3000);
		driver.quit();
		
driver.findElement(By.id("promtButton")).click();
		Alert alrt4=driver.switchTo().alert();
		System.out.println(alrt4.getText());
		
		alrt4.sendKeys("DV");
		
		alrt4.accept();
		
		driver.quit();
	
		
		String text = driver.switchTo().alert().getText();
		
		String accepti=driver.findElement(By.xpath("//*[@id=\"javascriptAlertsWrapper\"]/div[3]/div[1]")).getText();
			System.out.println(accepti);
			driver.findElement(By.id("promtButton")).click();
			driver.switchTo().alert().sendKeys("Dnyanu");
			driver.switchTo().alert().accept();	
		
		
		
		
	}

}
