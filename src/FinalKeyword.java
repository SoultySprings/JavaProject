/*
 * The final keyword basically means that its final value has been initialized
 * its uses are : 
 * 1. a 'final class' cannot be subclasses
 * 2. a 'final method' cannot be overridden by subclasses
 * 3. a 'final variable' cannot be initialized again
 */
public final class FinalKeyword {

	final int Print() {
		int a = 5;
		return a;
	}
	int Print(int a) {
		int b = a;
		return b;
	}
	public static void main(String[] args) {
		FinalKeyword obj = new FinalKeyword();
		obj.Print(5);
		}

}

