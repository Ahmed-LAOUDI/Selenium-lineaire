package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://demoqa.com/select-menu");

		// Go back
		driver.navigate().back();
		Thread.sleep(4000);

		// Go forward
		driver.navigate().forward();
		Thread.sleep(4000);

		// refresh
		driver.navigate().refresh();
		driver.quit();

	}

}
