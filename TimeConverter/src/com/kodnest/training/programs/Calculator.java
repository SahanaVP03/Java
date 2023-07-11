package com.kodnest.training.programs;
import java.util.*;
public class Calculator {
	Scanner scan=new Scanner(System.in);
	public void addition()
	{
	 System.out.println("enter two no for addition");
	 int a=scan.nextInt();
	 int b=scan.nextInt();
	 System.out.println("the  sum is"+(a+b));
	 
	}
	public void substraction()
	{
		System.out.println("enter two no for substraction");
		 int a=scan.nextInt();
		 int b=scan.nextInt();
		 System.out.println("the  difference is"+(a-b));
	}
	public void multiplication()
	{
		System.out.println("enter two no for multiplication");
		 int a=scan.nextInt();
		 int b=scan.nextInt();
		 System.out.println("the  producct is"+(a*b));
	}
	public void division()
	{
		System.out.println("enter two no for division");
		 int a=scan.nextInt();
		 int b=scan.nextInt();
		 System.out.println("the  quotient is"+(a/b));
	}
	public void findRem()
	{
		System.out.println("enter two no for finf remaainder ");
		 int a=scan.nextInt();
		 int b=scan.nextInt();
		 System.out.println("the  rem is"+(a%b));
	}
	public void findSquare()
	{
		System.out.println("enter  no for power");
		 int a=scan.nextInt();
		 //int b=scan.nextInt();
		 System.out.println("the  power is"+(a*a));
	}

}
