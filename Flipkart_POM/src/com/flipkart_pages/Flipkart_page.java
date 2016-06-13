package com.flipkart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_page {

	public static WebElement element = null;

	public static WebElement flipkart_searchbar(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		return element;
	}

	public static WebElement electronics_mouseover_menu(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath(".//*[@id='fk-mainhead-id']/div[2]/div/div/ul/li[1]/a/span"));

		return element;
	}

	public static WebElement electronics_mouseover_submenu(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath(".//*[@id='menu-electronics-tab-0-content']/ul[1]/li[2]/a"));

		return element;
	}

	public static WebElement Search_flipkart(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@type='submit']"));
		return element;
	}

	public static WebElement Search_flipkart_field(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@placeholder='So, what are you wishing for today?']"));
		return element;
	}

}
