package com.xpath;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathx {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// tagname[@attributename='attributeValue']
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("xyz@gmail.com");

		// tagname[contains(@attributename,'attributevalue')]
		WebElement pass = driver.findElement(By.xpath("//input[contains(@type,'pass')]"));
		pass.sendKeys("1234@abc");
		Thread.sleep(3000);

		// tagname[text()='full text']
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Screenshot\\login.png");
		FileUtils.copyFile(source, dest);
		
		driver.navigate().back();

		// tagname[contains(text(),'half of the text')]
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		Thread.sleep(3000);
		
		TakesScreenshot ts1=(TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File dest1=new File("C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Screenshot\\forgot.png");
		FileUtils.copyFile(source1, dest1);
		
		driver.navigate().back();
		
		//(//tagname[@attributename='attributevalue'])[index]
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		
		TakesScreenshot ts2=(TakesScreenshot) driver;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File dest2=new File("C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Screenshot\\newacc.png");
		FileUtils.copyFile(source2, dest2);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
