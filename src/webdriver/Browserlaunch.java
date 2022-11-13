package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.get("https://www.youtube.com/");
		
		driver.navigate().refresh();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
		
		
		
          
		
	}

}
