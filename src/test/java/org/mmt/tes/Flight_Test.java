package org.mmt.tes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Flight_Test{
	WebDriver driver;
	@Test
	public void test1() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		 driver= new HtmlUnitDriver();
		driver.get("https://www.makemytrip.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//Flight flight=PageFactory.initElements(driver,Flight.class);
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//driver.switchTo().frame("notification-frame-31764456");
	System.out.println("switched to frame");
	//driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
	System.out.println("starting.....");
	driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).click();
	driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).sendKeys("Dibrugarh (DIB)");
		
	System.out.println("Test passes");
	
	
	}
}
