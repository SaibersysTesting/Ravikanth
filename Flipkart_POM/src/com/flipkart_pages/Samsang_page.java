package com.flipkart_pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Samsang_page {
	
	public static WebElement element=null;
	
	public static WebElement samsang_j7(WebDriver driver){
		
		element = driver.findElement(By.xpath("//a[@title='Samsung Galaxy J7 - 6 (New 2016 Edition) (White, 16 GB)  ']"));
		return element;
	}
	
	public static WebElement mobile_name(WebDriver driver){
		
		element = driver.findElement(By.partialLinkText("Samsung Galaxy J7 - 6 (New 2016 Edition)"));
		return element;
	}
	
	public static WebElement price_2000(WebDriver driver){
		
		element = driver.findElement(By.xpath("//input[@class='facetoption']"));
		return element;
	}
	
	public static WebElement Samsang_E1200(WebDriver driver){
		
		element = driver.findElement(By.xpath("//a[@title='Samsung Guru E1200 (Black) ']"));
		return element;
		
	}

}
