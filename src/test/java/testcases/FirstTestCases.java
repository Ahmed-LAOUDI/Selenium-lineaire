package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCases {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//open chrome browser 
		WebDriver driver = new ChromeDriver();
		
		//open url application 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Fill username 
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		// Fill password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//click on login buton 
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// click on login button(methode alternative , if type of butTon is submit)
		// driver.submit();
		
		//Validation enter on home page
		
		// Close chrome browser 
		//driver.close();
		
		//Kill session browser 
		//driver.quit();
		
		

	}

}
