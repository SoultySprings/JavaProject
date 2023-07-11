
public class TestRodent {
	public static void main(String []args) {
		Rodent r[] = new Rodent[3];
		r[0] = new Mouse();
		r[1] = new Hamster();
		r[2] = new Gerbil();

		r[0].eat();
		r[0].run();

		r[1].eat();
		r[1].run();

		r[2].eat();
		r[2].run();
	}
}
