package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://omayo.blogspot.com/");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[2]/input")).isDisplayed());
        driver.quit();
	}

}
