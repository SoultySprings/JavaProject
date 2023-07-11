//Program to show inheritance of interfaces
package randomprograms;
interface add {
	public void add(int x, int y);
}
interface sum {
	public void sum(int x, int y);
}
interface a1 extends add, sum{
	public void result(int result);
}
public class A1 implements a1 {
	public void add(int x, int y) {
		int result = x+y;
		result(result);
	}
	public void sum(int x, int y) {
		int result = x+y;
		result(result);		
	}
	public void result(int result) {
		System.out.println("The required result is : " + result);
	}

	public static void main(String[] args) {
		A1 obj = new A1();
		obj.add(2, 5);
		obj.sum(8, 9);

	}

}
