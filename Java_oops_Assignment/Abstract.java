abstract class Appliance{
    void turnon()
    {
        System.out.println("Appliance is turned on");
    }
     void turnoff(){
        System.out.println("Appliance is turned off");
     }
}
class fan extends Appliance{
    // void turnon(){
    //     System.out.println("fan is turnon");
    // }
}
class light extends Appliance{
    void turnon(){
        System.out.println("light is turnon");
    }
}
public class Abstract {
    public static void main(String[] args){
        
        Appliance fan=new fan();
        Appliance light=new light();
       
        fan.turnon();
        light.turnon();
        fan.turnoff();

    }

    
}
