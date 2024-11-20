package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize browser
		driver.manage().window().maximize();
		
		// Delete cookies
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/select-menu");
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("window.scrollBy( 0, 500)","");
		
		WebElement selectMenu = driver.findElement(By.id("oldSelectMenu"));
		Select dropDownList = new Select(selectMenu);
		
		//Select by index
		//dropDownList.selectByIndex(3);
		
		//Select by value
		//dropDownList.selectByValue("4");
		//Select by visible text
		dropDownList.selectByVisibleText("White");
		//driver.quit();
			
		
		

	}

}