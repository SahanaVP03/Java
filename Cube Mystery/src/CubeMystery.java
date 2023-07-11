import java.util.Scanner;

public class CubeMystery {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        Cube c=new Cube();
        System.out.println(Cube.cubeNumber(num));
	}

}
;