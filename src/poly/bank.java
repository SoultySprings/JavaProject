package poly;

public class bank {
	int getInterest() {
		return 0;
	}
	public static void main(String[] args) {
		bank a = new bank_a();// This is an object of bank with properties of bank_a
		bank b = new bank_b();// This is an object of bank with properties of bank_b
		bank c = new bank_c();// This is an object of bank with properties of bank_c
		bank_a aa = new bank_a();// This is an object of bank_a with properties of bank_a
		bank_b bb = new bank_b();// This is an object of bank_b with properties of bank_b
		bank_c cc = new bank_c();// This is an object of bank_c with properties of bank_c
		/*
		 * This program also shows Method Overriding
		 * Method overriding is when u have same fns of same args in a superclass and
		 * subclass. In MO, the method of the subclass fn, overwrites the
		 * fn of the superclass
		 */
		System.out.println(a.getInterest());
		System.out.println(b.getInterest());
		System.out.println(c.getInterest()+"\n");
		System.out.println(aa.getInterest());
		System.out.println(bb.getInterest());
		System.out.println(cc.getInterest());
		
	}

}
