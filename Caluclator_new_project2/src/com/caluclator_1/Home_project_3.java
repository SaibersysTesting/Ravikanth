package com.caluclator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_project_3 extends Home_page_1{
	
	public void test_4(){
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath(".//*[@id='login-content']/div[2]/p[2]/button")));
		driver.findElement(By.xpath(".//*[@id='login-content']/div[2]/p[2]/button")).click();
		System.out.println("Clicked on the tab");
	}
	
	public void test_5(){
		
		driver.findElement(By.xpath("//input[@name='s']")).sendKeys("45");
		driver.findElement(By.xpath("//input[@name='t']")).sendKeys("5");
		System.out.println("Getting the value of the Distance");
		driver.findElement(By.xpath("//input[@value='Calculate']")).click();
		System.out.println("clicked on Caluclate");
	}

}
