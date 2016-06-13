package com.caluclator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_page_2 extends Home_page_1{
	
	public void test_3(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeSelected(By.partialLinkText("Project Calculators")));
		WebElement menu = driver.findElement(By.partialLinkText("Project Calculators"));
		WebElement submenu= driver.findElement(By.xpath(".//*[@id='project_widget-ddcontent']/ul/li[3]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(menu).click(submenu).click().build().perform();
		
	}

}
