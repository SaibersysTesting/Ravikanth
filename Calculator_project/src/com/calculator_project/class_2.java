package com.calculator_project;

import org.openqa.selenium.By;

public class class_2 extends class_1{

	public void test_3() throws InterruptedException {
	
	driver.findElement(By.xpath(".//*[@id='login-content']/div[2]/p[2]/button")).click();
	System.out.println("clicked on test mobile direct");
		
	}
	
	
	public void test_4() throws InterruptedException{
		//driver.findElement(By.xpath("//input[@name='s']")).sendKeys("45");
		System.out.println("printing the value 45");
		driver.findElement(By.xpath("//input[@name='t']")).sendKeys("5");
		System.out.println("printing the value 5");
	}
	
	public void test_5(){
		
		driver.findElement(By.xpath("//input[@value='Calculate']")).click();
	}
}
