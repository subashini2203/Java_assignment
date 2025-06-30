class Vehicle{
     void start(){
         System.out.println("Vehicle is starting");
     }
}
    class Car extends Vehicle{
        void start(){
            System.out.println("Car is starting");
        }
    }
        class Bike extends Vehicle{
            void start(){
                System.out.println("Bike is starting");
            }
        }
public class Hierarchical {
    public static void main(String [] args){
        Car mycar=new Car();
        Bike mybike=new Bike();
        mycar.start(); 
        mybike.start();
        
        Vehicle myVehicle=new Vehicle();
        myVehicle.start();
        Object myObject=new Bike();
        

    }
    
}
    

    