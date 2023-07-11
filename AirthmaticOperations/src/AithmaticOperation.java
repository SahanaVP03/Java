import java.util.Scanner;
public class AithmaticOperation {

	public static void main(String[] args)
	{
		Scanner Scan=new Scanner(System.in);
		int num1=Scan.nextInt();
		int num2=Scan.nextInt();
		 int result1= subtractNumbers( 20, 5);
         int result2=multiplyNumbers( 4,  5);
         double result3= divideNumbers( 20,  4);
         int result4=findRemainder( 10,  3);
         System.out.println("diffrence of num1 and num2"+result1);
         System.out.println("product"+result2);
         System.out.printf("%f.2\n",result3);
         System.out.println("remainder"+result4);

	}
	public static int subtractNumbers(int num1, int num2)
	{
		return num1-num2;
	}
	public static int multiplyNumbers(int num1, int num2)
	{
		return num1*num2;
	}

	public static double divideNumbers(int num1, int num2)
	{
		return num1/num2;
	}

	public static int findRemainder(int num1, int num2)
	{
		return num1%num2;
	}
}
