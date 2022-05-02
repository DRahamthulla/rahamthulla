package com;
import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {
	public static void main(String[] args) throws InterruptedException {
    //load the driver
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Window\\Desktop\\sel\\chrome\\chromedriver.exe");
   WebDriver wd=new ChromeDriver();
   wd.get("https:/www.filpkart.com/");
   WebElement upload=wd.findElement(By.xpath("//*[@type='text]"));
   upload.click();
   TakesScreenshot ts=(TakesScreenshot)wd;
   File src=ts.getScreenshotAs(OutputType.FILE);    
    
}
}

