package com.caluclator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_page_1 {
	
	WebDriver driver;
	
	public void Statrt_Browser(){

		driver = new FirefoxDriver();
		
	}

	public void test_1(){
		driver.navigate().to("https://www.google.com/?gws_rd=ssl");
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sb_ifc0']")));
		driver.findElement(By.xpath("//*[@id='sb_ifc0']")).sendKeys("formloop");
		driver.findElement(By.xpath("//button[@value='Search']")).click();
	}
	
	public void test_2(){
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("FormLoop - Calculators, Converters and Rates.")));
		driver.findElement(By.partialLinkText("FormLoop - Calculators, Converters and Rates.")).click();
	}
}
