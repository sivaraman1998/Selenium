package com.action.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Robot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
//		driver.manage().window().maximize();
		
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		
		Actions a = new Actions(driver);//Mouse events
		
		WebElement a1 = driver.findElement(By.linkText("Sports"));
		
		a.contextClick(a1).build().perform();
		Thread.sleep(2000);
		
		Robot r = new Robot();//KeyBoard Events
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
				
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
