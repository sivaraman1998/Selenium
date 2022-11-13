package com.windows_handling.org;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_HanDLing {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().window().maximize();
		
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		
		Actions a1= new Actions (driver);
		
		WebElement play = driver.findElement(By.linkText("Plays"));
		a1.contextClick(play).build().perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.KEY_RELEASED);
//		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		Set<String> wh = driver.getWindowHandles();
		
		for (String wh1 : wh) {
			String title = driver.switchTo().window(wh1).getTitle();
			System.out.println(title);
		}
		
		String s="Top Upcoming Plays in Chennai | Best Live Plays in Chennai - BookMyShow";
		for (String wh2 : wh) {
			if(driver.switchTo().window(wh2).getTitle().equals(s)) {
				break;
			}
		}
		
		int size1 = driver.getWindowHandles().size();
		System.out.println(size1);
		
		for (String wh3 : wh) {
			boolean equalsIgnoreCase = driver.switchTo().window(wh3).getTitle().equalsIgnoreCase(s);
			System.out.println(equalsIgnoreCase);
		}
		
		
		
		
		
		
		
		
		
	}

	}


