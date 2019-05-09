package com.lara;

import java.util.Scanner;

public class ReversNum {
public static void main(String[] args) {
	int num,rnum=0,remender;
	Scanner sc = new Scanner(System.in);
	System.out.println("pls enter a positive number: ");
	num =sc.nextInt();
	while(num !=0)
	{
		remender=num%10;
		rnum=rnum*10+remender;
		num=num/10;
	}
	System.out.println("reverse  number is : "+rnum);
	
}
}
