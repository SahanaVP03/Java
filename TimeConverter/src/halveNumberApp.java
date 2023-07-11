import java.util.*;
public class halveNumberApp
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double n=sc.nextDouble();
		double res=halveTheNumber(n);
		System.out.printf("%.2f\n",res);
	}
	public static double halveTheNumber(double num)
	{
		return num/2;
	}
}
