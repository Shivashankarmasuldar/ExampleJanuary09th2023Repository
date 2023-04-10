package com.sgtesting.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
public static void main(String[] args) {
	serialization();

	}
	private static void serialization()
	{
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		Employee empobj=null;
		
		try {
			fout=new FileOutputStream("D:\\Serialization\\Employee.ser");
			empobj=new Employee(8055,"Shiva","QA",45000);
			out=new ObjectOutputStream(fout);
			out.writeObject(empobj);
		} catch (Exception e)
		{
		e.printStackTrace();
		}
		finally {
			try {
				fout.close();
				out.close();
				
			} catch (Exception e)
			{
			e.printStackTrace();
			}
		}
		
	}

}
