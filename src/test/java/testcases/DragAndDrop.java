package testcases;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://demoqa.com/droppable");

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);

		actions.dragAndDrop(source, target).perform();

		// verifz text changed into dropped !
		String tesxtTarget = target.getText();
		if(tesxtTarget.equals("Dropped!")) {
			System.out.println("Pass : Source is dropped to target as expected");
		}
		else  {
			System.out.println("Fail: Source could not be dropped to target as expected");
		}
		
		//Assertions.assertEquals(getText, "Dropped!")
		driver.quit();
		
		


	}

}
