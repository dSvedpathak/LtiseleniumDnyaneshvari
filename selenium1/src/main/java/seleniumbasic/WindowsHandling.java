package seleniumbasic;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://www.seleniumframework.com/Practiceform/");
        
        System.out.println(driver.getTitle());
        
       //1 window
        
        String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window id is " + parentWindow);
        driver.findElement(By.id("button1")).click();
  //2 window
        Set<String> handles = driver.getWindowHandles();
        
		for (String string : handles) {
        	System.out.println(string);
        }
        
        //identified by both parent and child window
        
        Iterator<String> it = handles.iterator();
        it.next();String childWindow = it.next();
        System.out.println("Child Window id is" + childWindow);
        
        //Switching between windows
        
        
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
        driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
		//quit and close
        
        driver.quit();
        //driver.close();
	}

}
