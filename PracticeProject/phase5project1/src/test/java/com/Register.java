package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register 
{
    public static void main( String[] args ) throws InterruptedException
    {
      
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Window\\Desktop\\sel\\chrome\\\\chromedriver.exe");
    	WebDriver d=new ChromeDriver();
    	d.manage().window().maximize();
    	d.get("http://localhost:8099/MyFirstProjec/Register.html");
    	d.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("admin");
    	Thread.sleep(10000);
    	d.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("Admin@123");
    	Thread.sleep(10000);
    	d.findElement(By.xpath("/html/body/form/input[3]")).sendKeys("7995940734");
    	Thread.sleep(10000);
    	d.findElement(By.xpath("/html/body/form/input[4]")).sendKeys("Admin2gamil.com");
    	Thread.sleep(10000);
    	d.findElement(By.xpath("/html/body/form/input[5]")).click();
    	Thread.sleep(10000);	
    }
}