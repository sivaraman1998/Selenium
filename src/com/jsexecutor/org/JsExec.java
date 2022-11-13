package com.jsexecutor.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExec {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement aus = driver.findElement(By.linkText("Australia"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		((org.openqa.selenium.JavascriptExecutor) js).executeScript("arguments[0].scrollIntoView();", aus);
		Thread.sleep(2000);

		((org.openqa.selenium.JavascriptExecutor) js).executeScript("window.scrollBy(0, -5000)", "");
		Thread.sleep(2000);

		((org.openqa.selenium.JavascriptExecutor) js).executeScript("window.scrollBy(0, 5000)", "");
		Thread.sleep(2000);
	}
}
