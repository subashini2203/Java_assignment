public class Main {
   
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();        // Output: Drawing Circle
        s.info();        // Output: This is a shape.
        Shape.staticInfo(); // Output: Static method in abstract class.
    }
    
}
