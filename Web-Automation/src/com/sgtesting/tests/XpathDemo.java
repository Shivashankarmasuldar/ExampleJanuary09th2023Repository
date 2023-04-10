package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathDemo {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		absoluteXpath();
		relativeXpathBasedOnTagName();
		relativeXpathBasedOnTagNameWithIndex();
		relativeXpathWithTagNameAndAttributeNameValue();
		relativeXpathWithAttributeNameValue();
		relativeXpathWithAttributeValue();
		relativeXpathWithTagNameWithMultipleAttributeNameValue();
		relativeXpathWithTagNameWithMultipleAttributeNameValueUsingOR();
		relativeXpathWithTagNameWithMultipleAttributeNameValueUsingAND();


	}
	private static void launchBrowser()
	{
		try {

			ChromeOptions obj=new ChromeOptions();
			obj.addArguments("remote-allow-origins=*");
			oBrowser=new ChromeDriver(obj);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void navigateURL()
	{
		try {
			oBrowser.navigate().to("file:///D:/Xpath/Sample.html");
			Thread.sleep(1000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void absoluteXpath()
	{
		try {

			oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("Darling");
			Thread.sleep(1000);
		} catch (Exception e) 
		{
			e.printStackTrace();	
		}
	}
	/**
	 * Case 2: identify the element based on tagName with index
	 * syntax: //<tagName>[index]
	 */
	private static void relativeXpathBasedOnTagName()
	{
		try {
			oBrowser.findElement(By.xpath("//input")).sendKeys("Darling");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Case 2: identify the element based on tagName with index
	 * syntax: //<tagName>[index]
	 */
	private static void relativeXpathBasedOnTagNameWithIndex()
	{
		try {
			oBrowser.findElement(By.xpath("//input[2]")).sendKeys("Darling");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Case 3: identify the element based on tagName with 
	 *			Attribute Name and Value Combination
	 * syntax: //<tagName>[@attributename='attributevalue']
	 */
	private static void relativeXpathWithTagNameAndAttributeNameValue()
	{
		try {
			oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Case 4: irrespective of tagName,identify the element based on  
	 *			Attribute Name and Value Combination
	 * syntax: //*[@attributename='attributevalue']
	 */
	private static void relativeXpathWithAttributeNameValue()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Case 5: irrespective of tagName, irrespective of  
	 *			Attribute Name, identify based on attribute Value 
	 * syntax: //*[@*='attributevalue']
	 */
	private static void relativeXpathWithAttributeValue()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Case 6: identify the element based on tagName with 
	 *			Multiple Attribute Name and Value Combination
	 * syntax: //<tagName>[@attributename1='attributevalue'][@attributename2='attributevalue']
	 */
	private static void relativeXpathWithTagNameWithMultipleAttributeNameValue()
	{
		try {
			oBrowser.findElement(By.xpath()).click();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Case 7: identify the element based on tagName with 
	 *			Multiple Attribute Name and Value Combination using OR operator
	 * syntax: //<tagName>[@attributename1='attributevalue' or @attributename2='attributevalue']
	 */
	private static void relativeXpathWithTagNameWithMultipleAttributeNameValueUsingOR()
	{
		try {
			oBrowser.findElement(By.xpath("//input[@name='submit1btn1' or @value='Submit']")).click();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Case 8: identify the element based on tagName with 
	 *			Multiple Attribute Name and Value Combination using AND operator
	 * syntax: //<tagName>[@attributename1='attributevalue' and @attributename2='attributevalue']
	 */
	private static void relativeXpathWithTagNameWithMultipleAttributeNameValueUsingAND()
	{
		try {
			oBrowser.findElement(By.xpath("//input[@value='Submit' and @value='Submit']")).click();

		} catch (Exception e)
		{	
			e.printStackTrace();
		}
	}
	/**
	 * Case 9: identify the element based on  
	 *			partial matching of Attribute Value 
	 * syntax: 
	 *  starts-with(@attributeName,'attributeValue')
	 *  ends-with(@attributeName,'attributeValue')
	 *  contains(@attributeName,'attributeValue')
	 * 
	 *  //<tagName>[starts-with(@attributeName,'attributeValue')]
	 *  //<tagName>[ends-with(@attributeName,'attributeValue')]
	 *  //<tagName>[contains(@attributeName,'attributeValue')]
	 */


}
