package com.sgtesting.Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	private static final String Employee = null;

	public static void main(String[] args) {
		
		 DeSerialization();
	}

	private static void DeSerialization()
	{
		FileInputStream fin=null;
		ObjectInputStream Oin=null;
		Employee empObj=null;
	
		try {
			fin=new FileInputStream("D:\\Serialization\\Employee.ser");
			Oin=new ObjectInputStream(fin);
			empObj=(Employee)Oin.readObject();
			empObj.ShowempNo();
			empObj.ShowempName();
			empObj.ShowempJob();
			empObj.ShowSalary();
			
		} catch (Exception e) 
		{
		e.printStackTrace();
		}
		finally
		{
			try {
				fin.close();
				Oin.close();
			} catch (Exception e)
			{
			e.printStackTrace();
			}
		}
	}
}

