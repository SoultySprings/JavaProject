//Program to show methods usage, with interface

interface A {
	public void meth1();
	public void meth2();
	
}
public class NotMy_Class implements A{	
	public void meth1() {
		System.out.println("Method 1 is implemented.");
	}
	public void meth2() {
		System.out.println("Method 2 is implemented.");
	}
}