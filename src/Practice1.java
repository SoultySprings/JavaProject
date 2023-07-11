
import java.util.*;
public class Practice1 {
	int rollno[] = {1,2,3,4,5}; short sum = 0;
	String name[] = {"Norman", "Tanishq", "Raj", "John","Adam"};
	short average() {
		Scanner sc = new Scanner(System.in);
		for(byte i = 0; i<rollno.length; i++) {
			System.out.print("Marks of " + name[i] +" : ");
			byte mark = sc.nextByte();
			sum = (short)(sum + mark);
		}
		short avg = (short)(sum/rollno.length);
		for(byte j = 0; j<rollno.length; j++) {
			System.out.println("\nRoll no : " + rollno[j] + "\nName : " + name[j]);
		}
		return avg;
	}
	
}
