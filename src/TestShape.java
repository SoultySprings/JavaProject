
public class TestShape {
   public static void main(String[] args) {
      Shape s1 = new Circle("red", 4);  // Upcast
      System.out.println(s1);  // Run Rectangle's toString()
      //Rectangle[length=4,width=5,Shape[color=red]]
      System.out.println("Area is " + s1.getArea() + " and Perimeter " + s1.getPerimeter()) ;  // Run Rectangle's getArea()
      //Area is 50.2400016784668
      //Perimeter is 25.1200008392334

      Shape s2 = new Rectangle("blue", 4, 5);  // Upcast
      System.out.println(s2);  // Run Triangle's toString()
      //Triangle[base=4,height=5,Shape[color=blue]]
      System.out.println("Area is " + s2.getArea() + " and Perimeter " + s2.getPerimeter());  // Run Square's getArea()
      //Area is 20.0
      //Perimeter is 18.0
      
      Shape s3 = new Square("green", 6);  // Upcast
      System.out.println(s2);  // Run Triangle's toString()
      //Triangle[base=4,height=5,Shape[color=blue]]
      System.out.println("Area is " + s3.getArea() + " and Perimeter " + s3.getPerimeter());  // Run Triangle's getArea()
      //Area is 36.0
      //Perimeter is 24.0

   }
}