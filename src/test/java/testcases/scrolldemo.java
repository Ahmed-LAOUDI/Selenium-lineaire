package testcases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();

				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

				driver.manage().window().maximize();

				driver.manage().deleteAllCookies();

				driver.get("https://demoqa.com/menu/#");
				 
				//Thread.sleep(3000);
				// To perfom scroll on application using selenium 
				JavascriptExecutor js = (JavascriptExecutor) driver ;
				js.executeScript("window.scrollBy( 0, 500)","");
				

	}

}
