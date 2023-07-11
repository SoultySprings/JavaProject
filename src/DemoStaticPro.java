/*
 * Here we see that the value of age increases but mark doesn't which means 
 * that its value changes only when mark is called by an object
 * as static here means that the variable is shared between objects
 * so when we declare a new object it considers static variables as a separate variable
 * and increases its value but for non static keyword it doesn't and just considers its
 * increment once
 */
public class DemoStaticPro {

	public static void main(String[] args) {
		StaticPro obj = new StaticPro();
		System.out.println(StaticPro.Print() + " : " + obj.Prey());
		StaticPro obj2 = new StaticPro();
		System.out.println(StaticPro.Print() + " : " + obj2.Prey());
		StaticPro obj3 = new StaticPro();
		System.out.println(StaticPro.Print() + " : " + obj3.Prey());
		StaticPro obj4 = new StaticPro();
		System.out.println(StaticPro.Print() + " : " + obj4.Prey());
	}

}
