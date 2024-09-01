class PaintThings{
	public static void main (String args []){
		Paint p = new Paint();
		Sphere bigBall = new Sphere();
		Rectangle deck = new Rectangle();
		Cylinder tank = new Cylinder();
		bigBall.area(15);p.Amount(bigBall.area);
		deck.area(20, 35);p.Amount(deck.area);
		tank.area(10, 30);p.Amount(tank.area);
		}
	}