package com.test.github;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class LaunchGithub 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver","\\C:\\Users\\deepak.pruthi\\eclipse-workspace\\github\\src\\chromeDriver\\chromedriver.exe\\");
    	WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		driver.findElement(By.id("user[login]")).sendKeys("dpruthixyz");
		driver.findElement(By.id("user[email]")).sendKeys("dpruthi66@yopmail.com");
		driver.findElement(By.id("user[password]")).sendKeys("qwerty646@");
		driver.findElement(By.xpath("//button[text()='Sign up for GitHub']")).click();
		driver.manage().window().maximize();    }
}
