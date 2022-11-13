package com.project_demo.org;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mynthra_Prog {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/kdsprtywr?f=Gender%3Aboys%20girls%2Cgirls&plaEnabled=false");

		List<WebElement> allproducts = driver.findElements(By.xpath("//li[@class='product-base']"));

		int size1 = allproducts.size();
		System.out.println("Total Number Of Products : " + size1);

////    	for (WebElement getproduct : allproducts) {
////			String text1 = getproduct.getText();
////
////			System.out.println(text1);
//		}

		ArrayList<Integer> a1 = new ArrayList<Integer>();

		List<WebElement> lowprice = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
		for (WebElement lp : lowprice) {
			String text2 = lp.getText();

			String replace1 = text2.replace("Rs. ", "");

			Integer valueOf = Integer.valueOf(replace1);

			a1.add(valueOf);

			System.out.println(valueOf);
		}
		System.out.println("Minimum price :"+Collections.min(a1));

	}
}
