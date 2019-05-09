package com.amrit;

import java.io.File;

public class FileReader {
	
	public static void main(String[] args) throws Exception
	{
	int count=0;
		File f =new File("C:\\Users\\Amrit Raj\\git\\TestProject\\app1");
		String[] s =f.list();
		for(String s1 : s)
		{
			System.out.println(s1);
			count++;
		}
		System.out.println("total number of file :"+count);
}

}