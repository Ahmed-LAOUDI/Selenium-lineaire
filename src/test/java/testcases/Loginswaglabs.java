package testcases;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginswaglabs {

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
		driver.get("https://www.saucedemo.com/");
		
		// Fill username 
		WebElement username = driver.findElement(By.name("user-name"));
		
		
		username.clear();
		username.sendKeys("standard_user");
		
		// Fill password
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("secret_sauce");
		
		// click on login button 
		//driver.findElement(By.xpath("//input[@name='login-button']")).click();
		
		//click on login button using Explicit wait 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//driver.findElement(By.xpath("//input[@name='login-button']")).wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='login-button']")));
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		
		//Validation enter home page
		String textProduct =driver.findElement(By.xpath("")).getText();
		
		Assertions.assertEquals(textProduct,"Products");
		
		//Print screen message
		System.out.println("Login sucessffuly");
			//*[contains(text(), 'Products')]	
		
		//Kill session browser 
		//driver.quit();
		
	}

}
