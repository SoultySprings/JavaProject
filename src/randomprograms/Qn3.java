
package randomprograms;

abstract class A {
	 void call();
	}
class B extends A {
	void call(){
		System.out.println("Call me from B!");
		}
}
public class Qn3{
	public static void main(String[] args){
		B b = new B();
		b.call();
		}
	}
