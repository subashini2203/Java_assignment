abstract class Shape {
  
 abstract void draw(); // abstract method

    void info() { // concrete method (default)
        System.out.println("This is a shape.");
    }

    static void staticInfo() { // static method
        System.out.println("Static method in abstract class.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}


    

