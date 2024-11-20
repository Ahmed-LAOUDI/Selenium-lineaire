package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolintoElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize browser
		driver.manage().window().maximize();
		
		// Delete cookies
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		
		WebElement LinkText= driver.findElement(By.linkText("How to run Selenium tests using Firefox Driver"));
		//Scrolling down the page till the element is found
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].scrollIntoView()",LinkText);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		

	}

}
