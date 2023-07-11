package randomprograms;
// class name should start with upper case and follows camelCase like the program below
public class RulesToFollow {
	// every time you add an open bracket, you should indent the following lines by 2 white spaces
	public static void main(String[] args) { // brackets should be on the same line as the code before it 
	  	for (short num = 2; num<=1000; num++) {
	  		
	  		// variable name should start with lower case and follows camelCase like isPrime below
	  		boolean isPrime = true;
	  		
	  		for (short i = 2; i<=Math.sqrt(num); i++) {
	  			// there should be a space between operations and equal signs as the example below 
	  			// such as: num % i == 0
	  			if (num % i == 0) {
	  				isPrime = false;
	  				break;
	  			}
	  		}
	  		// there shouldn't be spaces between the open parenthesis ( and the variable that follows it 
	  		// there shouldn't be spaces between the closed parenthesis ) and the variable that precedes it 
	  		if (isPrime == true) {
	  			System.out.println(num);
	  		}	// closing brackets should be on a separate line like here and below
	  	}
	}
}
