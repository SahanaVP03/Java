
public class SpeedCal {

	public static void main(String[] args) 
	{
		SpeedCal s=new SpeedCal();
		double d= s.calculateDistance(60.0, 1.5);
		System.out.println(d);

	}

	public double calculateDistance(double speed, double time)
	{
		return speed*time;
	}
}

