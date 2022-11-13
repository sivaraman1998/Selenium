package com.alerts.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		driver.manage().window().maximize();

		// SIMPLE ALERT....>

		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(3000);
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		Thread.sleep(2000);

		// CONFIRM ALERT...>

		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);

		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		Thread.sleep(2000);

		// PROMT ALERT...>
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("sowpriya");
		alert3.accept();
		Thread.sleep(3000);

	}

}
