package com.amrit;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PWriter {
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("abc2.txt");
		PrintWriter out = new PrintWriter(fw);
		out.write(100); //d
		out.println(100);//100
		out.println(true);
		out.println('c');
		out.println("durga");
		out.flush();
		out.close();
		System.out.println("done");
	}
}
