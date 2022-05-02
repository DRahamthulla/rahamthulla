package com;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {
	private static WebDriver driver=null;
	public static void main(String[] agrs) throws IOException, InterruptedException {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("hhtp:/toolsqa.com/automation-parctice-from");
		driver.findElement(By.id("photo")).click();
		Runtime.getRuntime().exec("c:/AutoltTest.exe");
		Thread.sleep(5000);
		driver.close();
		
	}
}



