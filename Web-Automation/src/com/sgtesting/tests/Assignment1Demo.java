package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1Demo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		login();
		minimizeflyoutwindow();
		Createuser();
		deleteuser();
		logout();
		closeApp();

	}

	private static void launchBrowser()
	{
		try 
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			oBrowser=new ChromeDriver(options);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void navigateURL()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(5000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try {

			oBrowser.findElement(By.id("username")).sendKeys("Admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeflyoutwindow()
	{
		try {
			
	oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
	Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Createuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Shiva1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("UserShiva");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("Shiva@1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("Shivauser22");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("Amar@1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Amar@1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(1000);
			
		} catch (Exception e)
		{
		e.printStackTrace();	
		}
	}
	private static void deleteuser()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(5000);
			
			TargetLocator target=oBrowser.switchTo();
			Alert oAlert=target.alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(5000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try {
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void closeApp()
	{
		try {
			oBrowser.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
