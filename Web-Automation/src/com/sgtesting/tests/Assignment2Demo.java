package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2Demo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launcbrowser();
		navigateURL();
		Login();
		minimizeflyoutwindow();
		Createuser();
		ModifiedUser();
		DeleteUser();
		Logout();
		closeApp();
	}

	private static void launcbrowser()
	{
		try {

			ChromeOptions obj=new ChromeOptions();
			obj.addArguments("--remote-allow-origins=*");
			oBrowser=new ChromeDriver(obj);

		} catch (Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void navigateURL()
	{
		try {

			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(3000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try {

			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeflyoutwindow()
	{
		try 
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Createuser()
	{
		try {

			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Hitman");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("HitManSharma");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("Shiva@1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("ShivaShankar1");
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
	private static void ModifiedUser()
	{
		try {

			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Hitman1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("HitManSharma1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("Shiva1234@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("Shivashankar5");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("Shiva@123123");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Shiva@123123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();

			Thread.sleep(1000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void DeleteUser()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);

			TargetLocator target=oBrowser.switchTo();
			Alert oAlert=target.alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

		} catch (Exception e) 
		{
			e.printStackTrace();	
		}
	}
	private static void Logout()
	{
		try 
		{
			oBrowser.findElement(By.linkText("Logout")).click();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApp()
	{
		try 
		{
			oBrowser.close();
		} catch (Exception e) 
		{
			e.printStackTrace();	
		}
	}
}
