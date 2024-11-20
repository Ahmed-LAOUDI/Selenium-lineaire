package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testmarjanemall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// open chrome browser 
				WebDriver driver = new ChromeDriver();
				
				// Maximize browser
				driver.manage().window().maximize();
				
				// Delete cookies
				driver.manage().deleteAllCookies();
				
				driver.get("https://www.marjanemall.ma/");
				WebElement sliderLink = driver.findElement(By.cssSelector("a.overlay-link[href='https://www.marjanemall.ma/black-friday#lpHP-1503']"));

				// Clic via JavaScript pour contourner les restrictions de visibilité
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", sliderLink);
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='AC&Co CHEMISE NOIR']")));  // Rechercher un texte partiel
			    element.click(); 
			    WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("product-addtocart-button")));  // Rechercher un texte partiel
			    JavascriptExecutor executor1 = (JavascriptExecutor) driver;
				executor1.executeScript("arguments[0].click();", element1);
			 
			   


	}

}
