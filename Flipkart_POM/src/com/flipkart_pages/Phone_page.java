package com.flipkart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Phone_page {
	
	public static WebElement element = null;
	
	public static WebElement Selecting_mobile_color_white(WebDriver driver){
		
		element = driver.findElement(By.xpath("//a[@title='Samsung Guru Music 2 (White) ']"));
		return element;
	}

  public static WebElement Selecting_mobile_color_blue(WebDriver driver){
		
		element = driver.findElement(By.xpath("//div[@data-selectorvalue='Indigo Blue']"));
		return element;
	} 
  
  public static WebElement Selecting_mobile_color_black(WebDriver driver){
		
		element = driver.findElement(By.xpath("//div[@data-selectorvalue='Black']"));
		return element;
	} 
  
  public static WebElement Addtocart_button(WebDriver driver){
	  
	  element = driver.findElement(By.xpath("//input[@value='Add to Cart']"));
	  return element;
  }
  
  public static WebElement clicking_on_j7(WebDriver driver){
	  
	  element =driver.findElement(By.xpath("//a[@title='Samsung Galaxy J7 - 6 (New 2016 Edition) (White, 16 GB) ']"));
	  return element;
  }
  
}
