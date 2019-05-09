package com.amrit;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	String s,revString="";
	System.out.println("pls enter the String:  ");
	Scanner sc = new Scanner(System.in);
	s=sc.nextLine();
	int length,i;
	length=s.length();
	for(i=length-1;i>=0;i--)
	{
		revString=revString+s.charAt(i);
	}
	System.out.println("reverse the string is : "+revString);
}
}
