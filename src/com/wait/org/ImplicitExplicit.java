package com.wait.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		
//		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		WebElement name1 = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		name1.sendKeys("Sowpriya");
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("SP");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	    
	    WebElement pass = driver.findElement(By.id("firstpassword"));
	    Thread.sleep(15000);
	    pass.sendKeys("1234");
	    Thread.sleep(2000);
	    
	    WebDriverWait wait=new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOf(pass));
	    
	    driver.findElement(By.id("secondpassword")).sendKeys("1234");
	    Thread.sleep(6000);
	   
	}

}
