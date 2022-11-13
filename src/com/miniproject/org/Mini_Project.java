package com.miniproject.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.id("username")).sendKeys("Sowpriya");
		driver.findElement(By.id("password")).sendKeys("Sowpriya@123");
		Thread.sleep(2000);
		driver.findElement(By.id("login")).click();
		
		WebElement loc = driver.findElement(By.id("location"));
		Select s1=new Select(loc);
		s1.selectByIndex(2);
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s2=new Select(hotels);
		s2.selectByValue("Hotel Sunshine");
		
		WebElement type = driver.findElement(By.id("room_type"));
		Select s3=new Select(type);
		s3.selectByVisibleText("Double");
		
		WebElement num = driver.findElement(By.id("room_nos"));
		Select s4=new Select(num);
		s4.selectByVisibleText("3 - Three");
		
		driver.findElement(By.id("datepick_in")).sendKeys("22/11/2022");
		driver.findElement(By.id("datepick_out")).sendKeys("22/11/2023");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s5=new Select(adult);
		s5.selectByVisibleText("4 - Four");
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select s6=new Select(child);
		s6.selectByVisibleText("2 - Two");
		Thread.sleep(5000);
	
		driver.findElement(By.id("Submit")).click();
		
		driver.findElement(By.id("radiobutton_0")).click();
		
		driver.findElement(By.id("continue")).click();
		
		WebElement fn = driver.findElement(By.id("first_name"));
		fn.sendKeys("Sowpriya S");
		
		driver.findElement(By.id("last_name")).sendKeys("SP");
		
		driver.findElement(By.id("address")).sendKeys("Dharmapuri");
		
		driver.findElement(By.id("cc_num")).sendKeys("1234567891234512");
		
		WebElement type1 = driver.findElement(By.id("cc_type"));
		Select t1 = new Select (type1);
		t1.selectByIndex(2);
		
		WebElement exdate= driver.findElement(By.id("cc_exp_month"));
		Select t2=new Select(exdate);
		t2.selectByValue("11");
		
		WebElement exd1 = driver.findElement(By.id("cc_exp_year"));
		Select t3= new Select(exd1);
		t3.selectByVisibleText("2022");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("12345");
		
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot)driver; 
		File ts1 = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Screenshot\\miniproject.png");
		FileUtils.copyFile(ts1, dest);
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
