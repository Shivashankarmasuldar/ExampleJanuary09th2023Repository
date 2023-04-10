package com.sgtesting.RegularizationExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.remote.http.UrlTemplate.Match;

public class RegularizationExpressionDemo2 {
	public static void main(String[] args) {
		regExpTesting1();
		regExptestin2();
		regExpTestin3();

	}
	private static void regExpTesting1()
	{
		String str=("Banglore recieved 125 centimeters of rain yesterday");
		Pattern pat=Pattern.compile("[0-9]");
		Matcher match=pat.matcher(str);
		boolean v1=match.find();
		System.out.println(v1);
		System.out.println("----------------------------");
	}
	private static void regExptestin2()
	{
		String str=("Banglore recieved 125 centimeters of rain yesterday");
		Pattern pat=Pattern.compile("[0-9]{3}");
		Matcher match=pat.matcher(str);
		String s=match.replaceAll("many");
		System.out.println(s);
		System.out.println("----------------------------");

	}
	private static void regExpTestin3()
	{
		String str=("The temple is at the top of the hills");
		Pattern pat=Pattern.compile("[a-zA-Z]");
		Matcher match=pat.matcher(str);
		while(match.find())
		{
			System.out.println(match.group());
		}
	}
}
