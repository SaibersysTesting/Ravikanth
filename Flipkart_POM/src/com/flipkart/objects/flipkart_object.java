package com.flipkart.objects;

import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.flipkart_pages.Flipkart_page;
import com.flipkart_pages.Google_search_page;
import com.flipkart_pages.Phone_page;
import com.flipkart_pages.Samsang_page;
import com.flipkart_pages.cart_page;

public class flipkart_object {
	
	public static void flipkart_objects(WebDriver driver){
		
		
		Google_search_page.Google_searchbar(driver).sendKeys("flipkart");
		Google_search_page.Search_button(driver).click();
		Google_search_page.Flipkart_button(driver).click();
		Actions action = new Actions(driver);
		action.moveToElement(Flipkart_page.electronics_mouseover_menu(driver)).moveToElement(Flipkart_page.electronics_mouseover_submenu(driver)).click().build().perform();
		/*String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', 

				true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
								((JavascriptExecutor) driver).executeScript(mouseOverScript,
										HoverElement);*/
		//Flipkart_page.electronics_mouseover(driver);
	    /*Flipkart_page.Search_flipkart_field(driver).sendKeys("Samsang");
	    Flipkart_page.Search_flipkart(driver).click();
	    Phone_page.clicking_on_j7(driver).click();
	   String expected = "Samsung Galaxy J7 - 6 (New 2016 Edition) (White,...";
	   System.out.println("printing the mobile name "+ expected);
	   String actual=Samsang_page.mobile_name(driver).getText();
	   System.out.println(actual);
	   if(actual==expected){
		   try{
			   Phone_page.Addtocart_button(driver).click();
		   }
		   catch(Exception E)
		   {
			   WebElement element = Phone_page.Addtocart_button(driver);
			   JavascriptExecutor executor = (JavascriptExecutor)driver;
			   executor.executeScript("arguments[0].click();", element);
		   }
		    try{
		    cart_page.Cart_info(driver).click();
		    cart_page.remove_button(driver).click();
		   }catch(NoSuchElementException e){
			   System.out.println(e);
		   }
	   }	   
	   else{
		   System.out.println("no text as expected");
	   }
	   
	   
	    
	}*/
	}
}
