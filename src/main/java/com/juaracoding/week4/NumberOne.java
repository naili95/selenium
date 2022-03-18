package com.juaracoding.week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NumberOne {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		
		WebElement addBtn = driver.findElement(By.id("addNewRecordButton"));
		addBtn.click();
		
		WebElement inputFirst = driver.findElement(By.id("firstName"));
		inputFirst.sendKeys("Naili");
		
		WebElement inputLast = driver.findElement(By.id("lastName"));
		inputLast.sendKeys("Ulya");
		
		WebElement inputEmail = driver.findElement(By.id("userEmail"));
		inputEmail.sendKeys("naili@sqa.com");
		
		WebElement inputAge = driver.findElement(By.id("age"));
		inputAge.sendKeys("26");
		
		WebElement inputSalary = driver.findElement(By.id("salary"));
		inputSalary.sendKeys("80000");
		
		WebElement inputDept = driver.findElement(By.id("department"));
		inputDept.sendKeys("Chairman");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement submitBtn = driver.findElement(By.id("submit"));
		wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
		submitBtn.click();		
	}

}
