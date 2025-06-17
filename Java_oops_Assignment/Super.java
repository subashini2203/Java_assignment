class Base{
     int value=100;
    Base(){
        System.out.println("Base class constructor called");
    }
    void show(){
        System.out.println("Base class value: " + value);
    }
}
class Derived extends Base{
    int value=200;
   

    Derived(){
        super();
        
        System.out.println("Derived class constructor");
    }
    void Display(){
        System.out.println("Derived class value: " + this.value);
        System.out.println("Base class value from Derived: " + super.value);
        super.show();
    }
}



public class Super {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.Display();
    }
    
}
