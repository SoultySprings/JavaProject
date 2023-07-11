
public class Square extends Shape {
   // Private member variables
   private int side;
   
   /** Constructs a Rectangle instance with the given color, length and width */
   public Square(String color, int side) {
      super(color);
      this.side = side;
   }

   /** Returns a self-descriptive string */   
   @Override
   public String toString() {
      return "Square[side=" + side + "," + super.toString() + "]";
   }
   
   /** Override the inherited getArea() to provide the proper implementation for rectangle */
   @Override
   public double getArea() {
      return side*side;
   }
   public double getPerimeter() {
	   return 4*side;
	   
   }
}