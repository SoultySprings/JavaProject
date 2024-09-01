import java.util.*;

public class Paint {
	
	public float coverage;
	public float amount;
	public float Amount(float Area) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the coverage of the paint : ");
		coverage = sc.nextFloat();
		
		amount = Area/coverage;
		System.out.println("The amount of paint required is : " + amount);
		return amount;
	}
}