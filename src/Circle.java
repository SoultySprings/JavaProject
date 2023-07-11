
public class Circle extends Shape {
   // Private member variables
   private int radius;
   private float pi = 3.14f;
   
   /** Constructs a Rectangle instance with the given color, length and width */
   public Circle(String color, int radius) {
      super(color);
      this.radius = radius;
   }

   /** Returns a self-descriptive string */   
   @Override
   public String toString() {
      return "Circle[radius=" + radius + super.toString() + "]";
   }
   
   /** Override the inherited getArea() to provide the proper implementation for rectangle */
   @Override
   public double getArea() {
      return pi*(radius*radius);
   }
   public double getPerimeter() {
	   return 2*pi*radius;
	   
   }
}