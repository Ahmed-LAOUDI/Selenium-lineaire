package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500)","");
		
		WebElement fullName= driver.findElement(By.id("userName"));
		WebElement email= driver.findElement(By.id("userEmail"));
		WebElement currentadress= driver.findElement(By.id("currentAddress"));
		WebElement permanentAddress= driver.findElement(By.id("permanentAddress"));
		WebElement btnSubmit = driver.findElement(By.id("submit"));
		
		fullName.sendKeys("Ahmed Laoudi");
		email.sendKeys("Ahmed@gmail.com");
		currentadress.sendKeys("Maroc");
		
		//copy paste
		currentadress.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		currentadress.sendKeys(Keys.CONTROL,"c");
		permanentAddress.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		btnSubmit.click();
		
		
		
		
		
	}

}
