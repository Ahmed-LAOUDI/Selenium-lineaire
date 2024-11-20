package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		WebDriver driver = new ChromeDriver();
		
		// Maximize browser
		driver.manage().window().maximize();
		
		// Delete cookies
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/slider/");
		WebElement Slider = driver.findElement(By.id("sliderContainer"));
		
		Actions action = new Actions(driver);
		action.moveToElement(Slider,45,0).perform();
		Slider.click();
}

}
