package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://demoqa.com/menu");
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("window.scrollBy( 0, 500)","");
		
		WebElement menuList = driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(menuList).perform();
		
		WebElement subsublist = driver.findElement(By.xpath("//a[normalize-space()='SUB SUB LIST »']"));
		actions.moveToElement(subsublist).perform();
		
		
		
		
		
	}

}
