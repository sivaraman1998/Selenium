package com.webtable.org;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://testleaf.herokuapp.com/pages/table.html");

		System.out.println("****ALL DATA****");

		List<WebElement> alldata = driver.findElements(By.xpath("//tbody/tr/td"));

		for (WebElement all : alldata) {

			String a1 = all.getText();
			System.out.println(a1);
		}

		System.out.println("****ROW DATA****");

		List<WebElement> rowdata = driver.findElements(By.xpath("//tbody/tr[1]"));

		for (WebElement row : rowdata) {
			String a2 = row.getText();

			System.out.println(a2);

		}
		System.out.println("****COLUMN DATA****");

		WebElement col = driver.findElement(By.xpath("//tbody/tr[2]/td[1]"));

		System.out.println(col.getText());

		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Sowpriya.S\\eclipse-workspace\\Selenium\\Screenshot\\table.png");
		FileUtils.copyFile(source, dest);

	}

}
