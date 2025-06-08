class Animal{
    void eat(){
        System.out.println("This animal eats");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("mammal is walking");
    }
}
class Dog extends Mammal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
public class Multilevel {
    public static void main(String[] args){
        Dog obj=new Dog();
        obj.bark();
        obj.walk();
        obj.eat();
    }
    
}
