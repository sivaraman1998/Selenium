package com.windows_handling.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling_Realtime {
	public static WebDriver driver;
	static String window1;

	public static void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Driver107\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");	
		
		String title1 = driver.getTitle();
	
		System.out.println(title1);
		
		window1 = driver.getWindowHandle();
		
	}
	
	public static void getProduct() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("//div//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(2000);

		Actions a=new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//div[@class='InyRMC _3Il5oO']//div//div[5]//descendant::div//following-sibling::div//div//div[text()='Electronics']"));
		a.moveToElement(element).build().perform();
		Thread.sleep(2000);
		
		WebElement element2 = driver.findElement(By.xpath("//div[@id=\"container\"]//div//div//div[@class='InyRMC _3Il5oO']//div[@class=\"eFQ30H\"][5]//div[@class=\"_1psGvi SLyWEo\"]//div[@class=\"_3XS_gI\"]//a[@class='_6WOcW9 _3YpNQe']"));
		a.click(element2).build().perform();
		Thread.sleep(2000);
		
		WebElement element3 = driver.findElement(By.xpath("//div[@id=\"container\"]//div//div[@class=\"_331-kn\"]//span[text()='Electronics']"));
		a.moveToElement(element3).build().perform();
		Thread.sleep(2000);
		
		WebElement product = driver.findElement(By.xpath("//div[@id=\"container\"]//div//div[@class=\"_331-kn\"]//div[@class=\"_1QrT3s\"]//a[text()='Mi']"));
		a.contextClick(product).build().perform();
		Thread.sleep(5000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		
		for (String id : windowHandles2) {
			if(!(window1.equals(windowHandles2))){
				driver.switchTo().window(id);
			}
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		browserlaunch();
		getProduct();
	}
}
