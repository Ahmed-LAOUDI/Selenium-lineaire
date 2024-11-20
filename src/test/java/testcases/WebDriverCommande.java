package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommande {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// open chrome browser 
				WebDriver driver = new ChromeDriver();
				
				// Maximize browser
				driver.manage().window().maximize();
				
				// Delete cookies
				driver.manage().deleteAllCookies();
				String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
				driver.get("url");
				String title = driver.getTitle();
				int lengthTitle = title.length();
				
				System.out.println("the title is "+ title);
				
				System.out.println("the length title is "+ lengthTitle);
				
				String actualUrl = driver.getCurrentUrl();
				if (actualUrl.equals("url")) {
					System.out.println("verification successfull-the correct url is opened");
				}else {
					System.out.println("verification failed-incorrect url is opened");
				}
				System.out.println(actualUrl);
				System.out.println(url);
				
				String pageSource = driver.getPageSource();
				int lengthSource = pageSource.length();
				System.out.println(lengthSource);
				
				}
	}


