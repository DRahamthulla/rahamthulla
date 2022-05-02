package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {
	public static void main(String[] args) throws InterruptedException {
    //load the driver
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Window\\Desktop\\sel\\chrome\\chromedriver.exe");
    WebDriver wd=new ChromeDriver();
    //maximise the web browser screen
        wd.manage().window().maximize();
    //load the webpage
        wd.get("file:///C:/Users/Window/Desktop/index.html");
        Select sc=new Select(wd.findElement(By.name("subjects")));
        //sc.selectByIndex(2);
        sc.selectByValue("java");

 
    List<WebElement> list=sc.getOptions();
    for(WebElement we:list) {
        System.out.println(we.getText());
    }

    
    
    
}
}

