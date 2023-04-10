package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assigment3Demo {

	public  static WebDriver Obrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		NavigateURL();
		Login();
		minimizeflyoutwindow();
		CreateUser1();
		CreateUser2();
		CreateUser3();
		Logout();
		LoginUser1();
		LoginUser2();
		LoginUser3();
		Login();
		ModifiedPassword();
		LoginasUser1();
		Logout();
		LoginasUser2();
		Logout();
		LoginasUser3();
		Logout();
		Login();
		DeleteAllUser();
		Logout();
		clossApp();

	}
	private static void LaunchBrowser()
	{
		try {
			ChromeOptions obj=new ChromeOptions();
			obj.addArguments("--remote-allow-origins=*");
			Obrowser=new ChromeDriver(obj);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void NavigateURL()
	{
		try {

			Obrowser.navigate().to("http://localhost/login.do");

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try {

			Obrowser.findElement(By.id("username")).sendKeys("admin");
			Obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeflyoutwindow()
	{
		try {
			Obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void CreateUser1()
	{
		try {
			Obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Obrowser.findElement(By.name("firstName")).sendKeys("Hitman");
			Thread.sleep(2000);
			Obrowser.findElement(By.name("lastName")).sendKeys("Cricker");
			Obrowser.findElement(By.name("email")).sendKeys("Rohit@gmail.com");
			Obrowser.findElement(By.name("username")).sendKeys("rohitsharma");
			Obrowser.findElement(By.name("password")).sendKeys("HitMan1");
			Obrowser.findElement(By.name("passwordCopy")).sendKeys("HitMan1");
			Obrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CreateUser2()
	{
		try {

			Obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Obrowser.findElement(By.name("firstName")).sendKeys("Kohli");
			Thread.sleep(2000);
			Obrowser.findElement(By.name("lastName")).sendKeys("Batsman");
			Obrowser.findElement(By.name("email")).sendKeys("Kohli@gmail.com");
			Obrowser.findElement(By.name("username")).sendKeys("virat");
			Obrowser.findElement(By.name("password")).sendKeys("king12");
			Obrowser.findElement(By.name("passwordCopy")).sendKeys("king12");
			Obrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CreateUser3()
	{
		try {

			Obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			Obrowser.findElement(By.name("firstName")).sendKeys("Dhoni");
			Obrowser.findElement(By.name("lastName")).sendKeys("WicketKeeper");
			Obrowser.findElement(By.name("email")).sendKeys("Dhoni@gmail.com");
			Obrowser.findElement(By.name("username")).sendKeys("MsDhoni");
			Obrowser.findElement(By.name("password")).sendKeys("dhoni13");
			Obrowser.findElement(By.name("passwordCopy")).sendKeys("dhoni13");
			Obrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try 
		{

			Obrowser.findElement(By.id("logoutLink")).click();

		} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	private static void LoginUser1()
	{
		try {

			Obrowser.findElement(By.id("username")).sendKeys("rohitsharma");
			Obrowser.findElement(By.name("pwd")).sendKeys("HitMan1");
			Obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			Obrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(3000);
			Logout();

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LoginUser2()
	{
		try {

			Obrowser.findElement(By.id("username")).sendKeys("virat");
			Obrowser.findElement(By.name("pwd")).sendKeys("king12");
			Obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			Obrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(3000);
			Logout();

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LoginUser3()
	{
		try {

			Obrowser.findElement(By.id("username")).sendKeys("MsDhoni");
			Obrowser.findElement(By.name("pwd")).sendKeys("dhoni13");
			Obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			Obrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(3000);
			Logout();

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void ModifiedPassword()
	{
		try {
			Obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			Obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			Obrowser.findElement(By.name("password")).clear();
			Obrowser.findElement(By.name("password")).sendKeys("HitMan2");
			Thread.sleep(1000);
			Obrowser.findElement(By.name("passwordCopy")).clear();
			Obrowser.findElement(By.name("passwordCopy")).sendKeys("HitMan2");
			Thread.sleep(1000);
			Obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			Obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(2000);
			Obrowser.findElement(By.name("password")).clear();
			Obrowser.findElement(By.name("password")).sendKeys("Virat2");
			Thread.sleep(1000);
			Obrowser.findElement(By.name("passwordCopy")).clear();
			Obrowser.findElement(By.name("passwordCopy")).sendKeys("Virat2");
			Thread.sleep(1000);
			Obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			Obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[4]/td[1]")).click();
			Thread.sleep(2000);
			Obrowser.findElement(By.name("password")).clear();
			Obrowser.findElement(By.name("password")).sendKeys("Dhoni2");
			Thread.sleep(1000);
			Obrowser.findElement(By.name("passwordCopy")).clear();
			Obrowser.findElement(By.name("passwordCopy")).sendKeys("Dhoni2");
			Thread.sleep(1000);
			Obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(5000);
			Logout();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void LoginasUser1()
	{
		try {

			Obrowser.findElement(By.id("username")).sendKeys("rohitsharma");
			Obrowser.findElement(By.name("pwd")).sendKeys("HitMan2");
			Obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			Obrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(2000);

		} catch (Exception e)
		{
			e.printStackTrace();

		}
	}
	private static void LoginasUser2()
	{
		try {

			Obrowser.findElement(By.id("username")).sendKeys("virat");
			Obrowser.findElement(By.name("pwd")).sendKeys("Virat2");
			Obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			Obrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(2000);

		} catch (Exception e)
		{
			e.printStackTrace();

		}
	}
	private static void LoginasUser3()
	{
		try {

			Obrowser.findElement(By.id("username")).sendKeys("MsDhoni");
			Obrowser.findElement(By.name("pwd")).sendKeys("Dhoni2");
			Obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			Obrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(2000);

		} catch (Exception e)
		{
			e.printStackTrace();

		}
	}
	private static void DeleteAllUser()
	{
		try {
			Obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			Obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			Obrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(1000);
			TargetLocator target=Obrowser.switchTo();
			Alert oAlert=target.alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

			Obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(2000);
			Obrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(1000);
			TargetLocator target1=Obrowser.switchTo();
			Alert oAlert1=target1.alert();
			String content1=oAlert1.getText();
			System.out.println(content1);
			oAlert.accept();
			Thread.sleep(2000);

			Obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			Obrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			TargetLocator target2=Obrowser.switchTo();
			Alert oAlert2=target2.alert();
			String content2=oAlert2.getText();
			System.out.println(content2);
			oAlert.accept();
			Thread.sleep(2000);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void clossApp()
	{
		try {
			Obrowser.close();

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
