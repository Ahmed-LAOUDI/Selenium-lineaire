package testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowshandleandswitchtoandclosequit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/browser-windows");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.tagName("title")).getText();
		
		WebElement messageWindowButton= driver.findElement(By.id("messageWindowButton"));
		//Scrolling down the page till the element is found
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].scrollIntoView()",messageWindowButton);
		 
		messageWindowButton.click();
		
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		for(String handlee : driver.getWindowHandles()){
			
			driver.switchTo().window(handlee);
			System.out.println(handlee);
			
			
		}
		//ferme la page active
		driver.close();
		//ferme tout les pages 
		driver.quit();	
		
		
		
		

	}

}
