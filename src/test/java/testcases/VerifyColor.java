package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyColor {

	
	WebDriver driver = new ChromeDriver();
	
	// Maximize browser
	driver.manage().window().maximize();
	
	// Delete cookies
	driver.manage().deleteAllCookies();
	
	driver.get("https://demoqa.com/buttons");
	
	
	
	
}
