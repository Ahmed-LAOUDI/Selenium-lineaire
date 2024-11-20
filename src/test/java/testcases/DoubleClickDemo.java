package testcases;

import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DoubleClickDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// open chrome browser 
				WebDriver driver = new ChromeDriver();
				
				// Implicit wait 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				// Maximize browser
				driver.manage().window().maximize();
				
				// delete cookies
				driver.manage().deleteAllCookies();
					
				// open url application 
				driver.get("https://demoqa.com/buttons");
				
				// Instantiate Actions Class
				Actions actions = new Actions(driver);
				
				WebElement btnDoubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
				actions.doubleClick(btnDoubleClick).perform();
		
	}

}
/*
package testcases;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import 
org.openqa.selenium.By
;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DoubleClickDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	
		// Maximize browser
		driver.manage().window().maximize();
		
		// Delete cookies
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/buttons");
		
		// Instantiate Actions class 
		Actions actions = new Actions(driver);
		
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
		actions.doubleClick(btnDoubleClick).build().perform();
		
		String text = driver.findElement(By.id("doubleClickMessage")).getText();
		Assertions.assertEquals(text, "You have done a double click");
		
		//driver.quit();
	}

} */