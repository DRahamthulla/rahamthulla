package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
	    //load the driver
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Window\\Desktop\\sel\\chrome\\chromedriver.exe");

	    WebDriver wd=new ChromeDriver();
	    wd.get("/www.google.com");
	    wd.switchTo().alert().accept();
	    wd.switchTo().alert().dismiss();
	    wd.switchTo().alert().accept();
	    wd.switchTo().alert().sendKeys("text");
	    wd.close();
	    
	    WebDriver wd1=new ChromeDriver();
	    wd1.findElement(By.id("xyz")).sendKeys(Keys.CONTROL + "t");
	    WebDriver wd2=new ChromeDriver();

	    wd2.findElement(By.id("xyz")).sendKeys(Keys.CONTROL+"r");

   
	}
}
