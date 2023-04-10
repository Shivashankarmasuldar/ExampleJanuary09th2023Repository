package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		lunchBrowser();
		navigateURL();
		closeApp();

	}
	private static void lunchBrowser()
	{
		try {

			oBrowser=new FirefoxDriver();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	private static void navigateURL()
	{
		try {
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void closeApp()
	{
		try {
			oBrowser.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
