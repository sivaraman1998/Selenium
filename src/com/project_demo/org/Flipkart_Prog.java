package com.project_demo.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Prog {

	public static  WebDriver driver;
	
	public static void browerLaunch() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Driver107\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
	}
	
	public static void findProduct() throws AWTException, InterruptedException {
		
		driver.findElement(By.xpath("//div//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(2000);

		Actions a=new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//div[@class='InyRMC _3Il5oO']//div//div[5]//descendant::div//following-sibling::div//div//div[text()='Electronics']"));
		a.moveToElement(element).build().perform();
		Thread.sleep(2000);
		
		WebElement element2 = driver.findElement(By.xpath("(//a[@class=\"_6WOcW9 _3YpNQe\"])[2]"));
		a.click(element2).build().perform();
		Thread.sleep(2000);
		
		WebElement element3 = driver.findElement(By.xpath("//div[@id='container']//div//div[@class='_331-kn']//descendant::span[text()='Electronics']"));
		a.moveToElement(element3).build().perform();
		Thread.sleep(2000);
		
		WebElement element4 = driver.findElement(By.xpath("//a[@title='Mi']"));
		element4.click();
		Thread.sleep(2000);
				
	}
	
	public static void takeScreen() throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Screenshot\\flipkart.png");
		FileUtils.copyFile(source, dest);
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		browerLaunch();
		findProduct();
		takeScreen();
	}
}
