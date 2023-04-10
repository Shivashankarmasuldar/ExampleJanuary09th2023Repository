package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment4Demo {
	public static WebDriver obj=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		login();
		createuser();
		logout();
		loginasuser1();
		loginasuser2();
		loginasuser3();
		loginasuser2modifypasswordforuser3();
		loginasuser3aftermodified();
		loginasuser1modifypwduser2();
		loginasuser2aftermodifiedpwd();
		modifypwdforuser1();
		loginasuser1aftermodifiedpwd();
		loginasUser2deleteuser3();
		loginasuser1deleteuser2();
	}
	private static void launchBrowser()
	{
		try {
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			obj=new ChromeDriver(opt);

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigateURL()
	{
		try {
			obj.navigate().to("http://localhost/login.do");
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try {
			obj.findElement(By.id("username")).sendKeys("admin");
			obj.findElement(By.name("pwd")).sendKeys("manager");
			obj.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser()
	{
		try {
			obj.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(1000);
			obj.findElement(By.name("firstName")).sendKeys("Shankar");
			Thread.sleep(1000);
			obj.findElement(By.name("lastName")).sendKeys("Masuldar");
			Thread.sleep(1000);
			obj.findElement(By.name("email")).sendKeys("masuladr97@gmail.com");
			Thread.sleep(1000);
			obj.findElement(By.name("username")).sendKeys("Shivashankar1");
			Thread.sleep(1000);
			obj.findElement(By.name("password")).sendKeys("Amarmasuldar@1234");
			Thread.sleep(1000);
			obj.findElement(By.name("passwordCopy")).sendKeys("Amarmasuldar@1234");
			Thread.sleep(1000);
			obj.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(1000);

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try {
			obj.findElement(By.linkText("Logout")).click();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser1()
	{
		try {
			obj.findElement(By.id("username")).sendKeys("Shivashankar1");
			obj.findElement(By.name("pwd")).sendKeys("Amarmasuldar@1234");
			obj.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			obj.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(1000);
			obj.findElement(By.name("firstName")).sendKeys("Shankar1");
			Thread.sleep(1000);
			obj.findElement(By.name("lastName")).sendKeys("Masuldar1");
			Thread.sleep(1000);
			obj.findElement(By.name("email")).sendKeys("masuladr9712@gmail.com");
			Thread.sleep(1000);
			obj.findElement(By.name("username")).sendKeys("Shivashankar2");
			Thread.sleep(1000);
			obj.findElement(By.name("password")).sendKeys("Amarmasuldar@456");
			Thread.sleep(1000);
			obj.findElement(By.name("passwordCopy")).sendKeys("Amarmasuldar@456");
			Thread.sleep(1000);
			obj.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			logout();
			Thread.sleep(1000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser2()
	{
		try {
			obj.findElement(By.id("username")).sendKeys("Shivashankar2");
			obj.findElement(By.name("pwd")).sendKeys("Amarmasuldar@456");
			obj.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			obj.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(1000);
			obj.findElement(By.name("firstName")).sendKeys("Shankar2");
			Thread.sleep(1000);
			obj.findElement(By.name("lastName")).sendKeys("Masuldar2");
			Thread.sleep(1000);
			obj.findElement(By.name("email")).sendKeys("masuladr971234@gmail.com");
			Thread.sleep(1000);
			obj.findElement(By.name("username")).sendKeys("Shivashankar3");
			Thread.sleep(1000);
			obj.findElement(By.name("password")).sendKeys("Amarmasuldar@789");
			Thread.sleep(1000);
			obj.findElement(By.name("passwordCopy")).sendKeys("Amarmasuldar@789");
			Thread.sleep(1000);
			obj.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			logout();

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser3()
	{
		try {
			obj.findElement(By.id("username")).sendKeys("Shivashankar3");
			obj.findElement(By.name("pwd")).sendKeys("Amarmasuldar@789");
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			obj.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(1000);
			logout();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser2modifypasswordforuser3()
	{
		try {
			obj.findElement(By.id("username")).sendKeys("Shivashankar2");
			obj.findElement(By.name("pwd")).sendKeys("Amarmasuldar@456");
			obj.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			obj.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(1000);
			obj.findElement(By.name("password")).clear();
			obj.findElement(By.name("password")).sendKeys("Amar@123");
			Thread.sleep(1000);
			obj.findElement(By.name("passwordCopy")).clear();
			obj.findElement(By.name("passwordCopy")).sendKeys("Amar@123");
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			logout();

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser3aftermodified()
	{
		try {
			obj.findElement(By.id("username")).sendKeys("Shivashankar3");
			obj.findElement(By.name("pwd")).sendKeys("Amar@123");
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			logout();

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser1modifypwduser2()
	{
		try {
			obj.findElement(By.id("username")).sendKeys("Shivashankar1");
			obj.findElement(By.name("pwd")).sendKeys("Amarmasuldar@1234");
			obj.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			obj.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
			obj.findElement(By.name("password")).clear();
			obj.findElement(By.name("password")).sendKeys("Amar@987");
			Thread.sleep(1000);
			obj.findElement(By.name("passwordCopy")).clear();
			obj.findElement(By.name("passwordCopy")).sendKeys("Amar@987");
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			logout();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser2aftermodifiedpwd()
	{
		try {
			obj.findElement(By.id("username")).sendKeys("Shivashankar2");
			obj.findElement(By.name("pwd")).sendKeys("Amar@987");
			obj.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			logout();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifypwdforuser1()
	{
		try {

			obj.findElement(By.id("username")).sendKeys("admin");
			obj.findElement(By.name("pwd")).sendKeys("manager");
			obj.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(1000);
			obj.findElement(By.name("password")).clear();
			obj.findElement(By.name("password")).sendKeys("Amar@777");
			Thread.sleep(1000);
			obj.findElement(By.name("passwordCopy")).clear();
			obj.findElement(By.name("passwordCopy")).sendKeys("Amar@777");
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			logout();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser1aftermodifiedpwd()
	{
		try {
			obj.findElement(By.id("username")).sendKeys("Shivashankar1");
			obj.findElement(By.name("pwd")).sendKeys("Amar@777");
			obj.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			logout();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasUser2deleteuser3()
	{
		try {
			obj.findElement(By.id("username")).sendKeys("Shivashankar2");
			obj.findElement(By.name("pwd")).sendKeys("Amar@987");
			obj.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			obj.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			TargetLocator target=obj.switchTo();
			Alert oAlert=target.alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			logout();
		} catch (Exception e) 
		{
			e.printStackTrace();	
		}
	}
	private static void loginasuser1deleteuser2()
	{
		try {

			obj.findElement(By.id("username")).sendKeys("Shivashankar1");
			obj.findElement(By.name("pwd")).sendKeys("Amar@777");
			obj.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);	
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
