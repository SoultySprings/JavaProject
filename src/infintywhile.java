//Type of infinity loops

import java.util.*;
public class infintywhile {
	int i = 0;
	char a = 'a';
	String text = "Tauba", text2;
	boolean bool = true;
	
	void InfCheck() {
		Scanner sc = new Scanner(System.in);
				while(i==0) {
					System.out.print("Hello? Should I stay? Type Yes or No : ");
					text2 = sc.nextLine().toLowerCase();
					System.out.println("\nHere we go again...");
					i++;
				};
				while(i>-1) {
					System.out.print("Hello? Should I stay? Type Yes or No : ");
					if(text2=="Yes") {
						System.out.println("\nHere we go again...");
					} else if (text2=="No"){
						break;
					}
				};
				while(text=="Tauba") {
					System.out.print("Hello? Should I stay? Type Yes or No : ");
					if(text2=="Yes") {
						System.out.println("\nHere we go again...");
					} else if (text2=="No"){
						break;
					}
				};
				while(a=='a') {
					System.out.print("Hello? Should I stay? Type Yes or No : ");
					if(text2=="Yes") {
						System.out.println("\nHere we go again...");
					} else if (text2=="No"){
						break;
					}
				};
				while(bool==true) {
					System.out.print("Hello? Should I stay? Type Yes or No : ");
					if(text2=="Yes") {
						System.out.println("\nHere we go again...");
					} else if (text2=="No"){
						break;
					}
				};
	}

	public static void main(String[] args) {
		infintywhile obj = new infintywhile();
		obj.InfCheck();
	}
}
