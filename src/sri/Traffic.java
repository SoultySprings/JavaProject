package sri;

import java.util.*;
public class Traffic {
	
	static void Signal() {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Kindly enter your choice : ");
		String text = sc.next();
		System.out.println("");
		switch(text) {
		case "Red" : 
			System.out.println("Stop!");
			break;
		case "Yellow" : 
			System.out.println("Ready!");
			break;
		case "Green" : 
			System.out.println("Go!");
			break;
		default: 
			System.out.println("Invalid!");
			break;
			}
	}

	public static void main(String[] args) {
		Traffic obj = new Traffic();
		obj.Signal();
		}
	}

