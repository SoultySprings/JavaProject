//Program to show inheritance of interfaces

interface add {
	public void Add(int x, int y);
}
interface sum {
	public void Sum(int x, int y);
}
interface A extends add, sum{
	public void result(int result);
}
public class A1 implements A {
	public void Add(int x, int y) {
		int result = x+y;
		result(result);
	}
	public void Sum(int x, int y) {
		int result = x+y;
		result(result);		
	}
	public void result(int result) {
		System.out.println("The required result is : " + result);
	}

	public static void main(String[] args) {
		A1 obj = new A1();
		obj.Add(2, 5);
		obj.Sum(8, 9);

	}

}
