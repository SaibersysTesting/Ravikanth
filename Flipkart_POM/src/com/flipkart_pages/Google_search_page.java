package com.flipkart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google_search_page {
	
	public static WebElement element = null;
	
	public static WebElement Google_searchbar(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='lst-ib']"));
		return element;
	}
	
	
	public static WebElement Gmail_Search(WebDriver driver){
		element = driver.findElement(By.partialLinkText("Gmail"));
		return element;
	}
	
	
	public static WebElement Search_button(WebDriver driver){
		element = driver.findElement(By.xpath("//button[@value='Search']"));
		return element;
	}
	
	public static WebElement Flipkart_button(WebDriver driver){
		
		element = driver.findElement(By.partialLinkText("Flipkart"));
		return element;
	}
	
	

}
