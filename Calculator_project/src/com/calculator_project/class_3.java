package com.calculator_project;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class class_3 extends class_2 {

	String expected = "Velocity = 9 m/s";

	public void test_6() {

		String actual = driver.findElement(By.xpath("//*[@id='final_result']/p")).getText();
		System.out.println(actual);
		assertEquals(actual, expected);
	}

	public void test_7() {
		WebElement ele = driver.findElement(By.xpath("//input[@value='More Info...']"));
		Actions act = new Actions(driver);
		act.doubleClick(ele);
		System.out.println("clicked on more info");
	}

	public void close_Browser() {
		driver.close();
		driver.quit();
	}

}
