package testcases;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemmentCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// open chrome browser 
		WebDriver driver = new ChromeDriver();
		
		// Maximize browser
		driver.manage().window().maximize();
		
		// Delete cookies
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.id("user-name"));
		username.clear();
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("secret_sauce");
		WebElement btnLogin = driver.findElement(By.id("login-button"));
		
		String addValue = username.getAttribute("name");
		System.out.println(addValue);
		
		//size of element 
		Dimension dimention = btnLogin.getSize();
		System.out.println("Height : "+ dimention.height);
		System.out.println("Width : "+ dimention.width);
		
		//Localization of element
		Point point = username.getLocation();
		System.out.println("X cordinate : "+ point.x);
		System.out.println("Y cordinate : "+ point.y);
		
		//verifier un element affiché 
		boolean result1 = btnLogin.isDisplayed();
		System.out.println(result1);
		// verifier un element active
		boolean result2 = btnLogin.isEnabled();
		System.out.println(result2);
		// verifier un element existe
		List <WebElement> loginBtn = driver.findElements(By.id("login-button"));
		if(loginBtn.size() != 0) {
			System.out.println("The element exist");
		}else {
			System.out.println("The element not exist");
		}
		
		
		btnLogin.click();
		
		
		
		
		
		
	}

}
