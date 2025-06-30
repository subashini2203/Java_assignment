class shape{
    void draw(){
        System.out.println("drawing a shape");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("drawing a circle");
    }
}
class square extends shape{
    void draw(){
        System.out.println("drawing a square");
    }
}
public class Polymorphism {
    public static void main(String[] args){
        shape c=new circle();
        shape s=new square();
       
        c.draw();
        s.draw();
         s=new shape();
         s.draw();
    }
    
}
