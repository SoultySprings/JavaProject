
public class MethodOverloading {

	MethodOverloading(){
		System.out.println("this is a constructor!");
	}
	void Add(byte a, byte b) {
		System.out.println(a+b);
	}
	void Add(short a, short b) {
		System.out.println(a+b);
	}
	void Add(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		/* This particular snippet of code executes the three different Add fns
		 * obj.Add(120, 120); //This one is for byte
		 * obj.Add(1220, 1220); //This one is for short
		 * obj.Add(12222220, 122222220); //This one is for int
		*/
		
		/* This particular snippet of code executes only byte Add fn
		 * obj.Add(120, 120);
		 * obj.Add(60, 50);
		 * obj.Add(75, 80);
		*/
		/* Similarly, this particular snippet of code executes only short and not byte Add fn
		 * obj.Add(1220, 1220);
		 * obj.Add(6000, 5000);
		 * obj.Add(7545, 8021);
		*/
	}

}
