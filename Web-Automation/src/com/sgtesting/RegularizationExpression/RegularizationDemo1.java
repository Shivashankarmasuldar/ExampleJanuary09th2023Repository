package com.sgtesting.RegularizationExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularizationDemo1 {
	public static void main(String[] args) {

		MatcherDemo1();
		FindDemo1();
		CountOfMatching();
		patternMatching();
		positionofmatching();
		replacedemo();
		splitdemo();
	}

	private static void MatcherDemo1()
	{
		Pattern patterns=Pattern.compile("Java");
		Matcher match=patterns.matcher("Java");
		boolean v1=match.matches();
		System.out.println(v1);
	}
	private static void FindDemo1()
	{
		Pattern pat=Pattern.compile("Java");
		Matcher match=pat.matcher("Java JDK Java JVM JRE Java");
		boolean v1=match.find();
		System.out.println(v1);
	}
	private static void CountOfMatching()
	{
		Pattern pat=Pattern.compile("Java");
		Matcher match=pat.matcher("Java JDk Java JvM JRE Java");
		int count=0;
		while(match.find())
		{
			count=count+1;
		}
		System.out.println("count :"+count);
	}
	private static void patternMatching()
	{
		Pattern pat=Pattern.compile("Java");
		Matcher match=pat.matcher("Java JDK Java JRE JVM Java");
		while(match.find())
		{
			System.out.println(match.group());	
		}
	}
	private static void positionofmatching()
	{
		Pattern pat=Pattern.compile("Java");
		Matcher match=pat.matcher("Java JDK Java JVM JRE Java");
		while(match.find())
		{
			System.out.println(match.start()+" Its Start position:"+match.end());
		}
	}
	private static void replacedemo()
	{
		Pattern pat=Pattern.compile("Java");
		Matcher match=pat.matcher("Java JDK Java JRE JVM Java");
		String s=match.replaceAll("Python");
		System.out.println(s);
	}
	private static void splitdemo()
	{
		Pattern pat=Pattern.compile("[,]");
		String s[]=pat.split("Mango,Apple,Banana,Orange");
		for(String kk:s)
		{
			System.out.println(kk);
		}

	}
}
