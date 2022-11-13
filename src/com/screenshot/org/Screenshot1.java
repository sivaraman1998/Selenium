package com.screenshot.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {
	  public static void main(String[] args) throws IOException, InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
		  
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://www.instagram.com/accounts/login/");
		   driver.manage().window().maximize();
		   Thread.sleep(12000);
		   
		   TakesScreenshot ss =(TakesScreenshot) driver;
		   File source = ss.getScreenshotAs(OutputType.FILE);
		   File dest = new File("C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Screenshot\\inst.png");
		   FileUtils.copyFile(source, dest);
	}

}
