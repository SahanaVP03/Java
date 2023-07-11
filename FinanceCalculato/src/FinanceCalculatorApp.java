
public class FinanceCalculatorApp {

	public static void main(String[] args)
	{
		FinanceCalculato calculator = new FinanceCalculato();

		System.out.printf("%.2f",calculator.calculateSimpleInterest(1000.0, 0.05, 2.0));
	}

}
