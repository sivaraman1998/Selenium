
package com.frames.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Program {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");

        driver.switchTo().frame(0);
        Thread.sleep(3000);

		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();
        Thread.sleep(3000);

		String text1 = frame1.getText();
		System.out.println(text1);
		
		driver.switchTo().defaultContent();
        Thread.sleep(3000);
		
		driver.switchTo().frame(1);
        Thread.sleep(5000);
		driver.switchTo().frame("frame2");
		
        WebElement frame2 = driver.findElement(By.id("Click1"));
		frame2.click();
        Thread.sleep(3000);
		
		String text2 = frame2.getText();
		System.out.println(text2);
		
		driver.switchTo().defaultContent();
		
		List<WebElement> frame3 = driver.findElements(By.tagName("iframe"));
		int size1 = frame3.size();
		System.out.println("Total frames = "+size1);
	}

}
