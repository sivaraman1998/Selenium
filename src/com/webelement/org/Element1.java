package com.webelement.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement fbemail = driver.findElement(By.id("email"));
		fbemail.sendKeys("sowpriyasp@gmail.com");

		boolean fbdisplay = fbemail.isDisplayed();
		System.out.println(fbdisplay);

		String fbname = fbemail.getAttribute("name");
		System.out.println(fbname);

		WebElement fbpass = driver.findElement(By.id("pass"));
		fbpass.sendKeys("sowpriya");

		boolean fbenable = fbpass.isEnabled();
		System.out.println(fbenable);

		String attribute2 = fbpass.getAttribute(fbname);
		System.out.println(attribute2);

		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();

		boolean selected = login.isSelected();
		System.out.println(selected);

	}

}
