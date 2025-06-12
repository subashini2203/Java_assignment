abstract class Appliance{
    abstract void turnon();
}
class fan extends Appliance{
    void turnon(){
        System.out.println("fan is turnon");
    }
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

    }

    
}
