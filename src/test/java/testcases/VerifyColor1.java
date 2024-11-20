package testcases;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyColor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		// Delete cookies
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/buttons");
		
		//Get Element color
		String color = driver.findElement(By.id("doubleClickBtn")).getCssValue("background-color");
		System.out.println(color);
		Color color1 = Color.fromString(color);
		System.out.println(color1);
		String actualColor = color1.asHex();
		System.out.println(actualColor);
		Assertions.assertEquals("#007bff",actualColor);
		driver.quit();
		
		
		
		
		
		
		
	}
	}
