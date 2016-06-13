package com.calculator_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class class_1 {
	
	WebDriver driver;
	
	public void Start_Browser(){
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.com/?gws_rd=ssl");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	public void test_1(){
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("formloop");
		driver.findElement(By.xpath("//button[@value='Search']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@value='Search']")));
	}
	
	public void test_2() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("FormLoop - Calculators, Converters and Rates.")).click();
		
		System.out.println("printed the link URL");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
