//Program to showcase switch in switch 

package randomprograms;

public class SwitchInSwitch {

	public static void main(String[] args) {
		byte x = 4;
		char y = 'c';
		switch (y) {
		case 'a' : 
		}
		switch(x) {
		case 1 :
			System.out.println("The number is : " + x);
			switch(y) {
			case 'a':
				System.out.println("The character is : " + y);
				break;
			case 'b':
				System.out.println("The character is : " + y);
				break;
			case 'c':
				System.out.println("The character is : " + y);
				break;
				default : 
					System.out.println("Got the character?");
					break;
			}
			break;
		case 2 :
			System.out.println("The number is : " + x);	
			switch(y) {
			case 'a':
				System.out.println("The character is : " + y);
				break;
			case 'b':
				System.out.println("The character is : " + y);
				break;
			case 'c':
				System.out.println("The character is : " + y);
				break;
				default : 
					System.out.println("Got the character?");
					break;
			}
			break;
		case 3 :
			System.out.println("The number is : " + x);
			switch(y) {
			case 'a':
				System.out.println("The character is : " + y);
				break;
			case 'b':
				System.out.println("The character is : " + y);
				break;
			case 'c':
				System.out.println("The character is : " + y);
				break;
				default : 
					System.out.println("Got the character?");
					break;
			}
			break;
		case 4 :
			System.out.println("The number is : " + x);
			switch(y) {
			case 'a':
				System.out.println("The character is : " + y);
				break;
			case 'b':
				System.out.println("The character is : " + y);
				break;
			case 'c':
				System.out.println("The character is : " + y);
				break;
				default : 
					System.out.println("Got the character?");
					break;
			}
			break;
			default : 
				System.out.println("Got the number?");
				
				break;
		}
		}
		
		
		/* All of the below codes will show error as they are not supported
		 * switch(long y) {
		 * }
		 * switch(boolean bool){
		 * }
		 * switch(double do1){}
		 * switch(float do1){}
		 * */
}
