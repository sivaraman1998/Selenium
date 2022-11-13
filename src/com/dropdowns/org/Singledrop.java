package com.dropdowns.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Singledrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		s1.selectByValue("10");
		Thread.sleep(2000);

		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select s2 = new Select(month);
		s2.selectByIndex(11);
		Thread.sleep(2000);

		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("2000");

	}

}
