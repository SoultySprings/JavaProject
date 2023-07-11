/*Static keyword means that anything termed static belongs to the class and not
 * to any specific instance
 * 
 * In general static can also mean that if it is static means its like original integral part of
 * the class and does not belong to any copy of the class
 * however it can be still accessed by an object, but will give error that the following 
 * variable has to be accessed in a static way.
 * where object is a copy of the class.
 */
public class WhatIsStatic {

	static void Message() {
		System.out.println("shillong!");
	}
	void MessageElse() {
		System.out.println("2 shillong!");
	}
	public static void main(String[] args) {
		WhatIsStatic obj = new WhatIsStatic();
		WhatIsStatic.Message();//This is a static fn so it can be used by the class only not by an instance
		obj.MessageElse();//This is a non static fn so it can be used by both class and object

	}

}
