package com.flipkart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cart_page {

	public static WebElement element = null;
	
	 public static WebElement Cart_info(WebDriver driver){
		  
		  element = driver.findElement(By.xpath("//span[contains(text(),'Cart')]"));
		  return element;
	  }
	
	public static WebElement Continoue_shopping(WebDriver driver){
		
		element = driver.findElement(By.partialLinkText("< Continue Shopping"));
		return element;
	}
	
	public static WebElement remove_button(WebDriver driver){
		
		element = driver.findElement(By.xpath("//a[@title='Remove Item']"));
		return element;
	}
}
