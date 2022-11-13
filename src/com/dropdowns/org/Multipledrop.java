package com.dropdowns.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipledrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		driver.manage().window().maximize();

		driver.get("https://testleaf.herokuapp.com/pages/Dropdown.html");
		Thread.sleep(2000);

		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		Select a1 = new Select(multiple);

		a1.selectByIndex(1);
		a1.selectByValue("2");
//		a1.deselectByIndex(1);
//		a1.selectByVisibleText("Loadrunner");
		a1.selectByVisibleText("UFT/QTP");

		List<WebElement> options1 = a1.getOptions();
		for (WebElement opt : options1) {
			String text = opt.getText();
			System.out.println(text);
		}

//		for(data_type variable : array | collection){  
//			//body of for-each loop  
//			}  

	}
}