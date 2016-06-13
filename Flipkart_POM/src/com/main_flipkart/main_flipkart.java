package com.main_flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.flipkart.objects.flipkart_object;

public class main_flipkart {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVIKANTH\\Desktop\\chromeDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		flipkart_object.flipkart_objects(driver);

		driver.close();
		driver.quit();
	}

}
