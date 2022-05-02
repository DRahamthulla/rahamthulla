package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAccess {
	public static void main(String[] args) throws InterruptedException {
    //load the driver
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Window\\Desktop\\sel\\chrome\\chromedriver.exe");
    WebDriver wd=new ChromeDriver();
//maximise the web browser screen
    wd.manage().window().maximize();
//load the webpage
    wd.get("https://google.com/");
//title of webpage what loaded
    System.out.println(wd.getTitle());
//load the url
    System.out.println(wd.getCurrentUrl());
    
    wd.get("https://www.simplilearn.com");
    wd.findElement(By.class("login")).click();
//    wd.findElement(By.id("//*[@id=\"tads\"]/div/div/div/div[1]/a/div[1]")).click();
//    wd.findElement(By.linkText("//*[@id=\"topHeader\"]/div/nav[2]/a")).click();
//    wd.findElement(By.id("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("abc@gmail.com");
//    wd.findElement(By.id("//*[@id=\"password\"]")).sendKeys("1234567");
//   
   // wd.findElement(By.id("continue")).click();
    
    
    
}
}

