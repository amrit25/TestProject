package com.amrit;

import java.io.BufferedReader;
import java.io.FileReader;

public class BReader 
{
public static void main(String[] args) throws Exception
{
	FileReader fr = new FileReader("C:\\Users\\Amrit Raj\\git\\TestProject\\app1\\src\\amrit.txt");
	//FileReader fr = new FileReader("abc2.txt");
	BufferedReader br = new BufferedReader(fr);
	String line =br.readLine();
	while(line != null)
	{
		System.out.println(line);
		line=br.readLine();
	}
	br.close();
	System.out.println("done");
}
}
