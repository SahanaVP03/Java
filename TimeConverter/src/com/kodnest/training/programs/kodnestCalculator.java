package com.kodnest.training.programs;
import java.util.Scanner;
public class kodnestCalculator {

	public static void main(String[] args) {
		while(true)
		{
			System.out.println("hello user welcome to kodnestcalculator");
			Scanner scan=new Scanner(System.in);
			System.out.println("+ ----------------->addition");
			System.out.println("- ----------------->substarction");
			System.out.println("* ----------------->multiplication");
			System.out.println("/ ----------------->division");
			System.out.println("% ----------------->find remainder");
			System.out.println("^ ----------------->find square");
			System.out.println("! ----------------->stop");
			
			Calculator c=new Calculator();
			System.out.println("enter your choice number");
			
			char choice=scan.next().charAt(0);
			switch(choice)
			{
			 case '+':
				  c.addition();
			break;
			 case '-':
				 
					c.substraction();
					break;
			 case '*':
				 c.multiplication();
					break;
			 case '/':
				 c.division();
				 break;
			 case '%':
				c.findRem();
				break;
			 case '^':
				 c.findSquare();
					break;
			default :
				break;
				 
			}
		}

	}

}
