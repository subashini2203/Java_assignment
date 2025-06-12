class calculator{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class Method {
    public static void main(String[] args){
        calculator c=new calculator();
        System.out.println(c.add(4,3));
        System.out.println(c.add(2.5,3.6));
        System.out.println(c.add(2,3,5));
    }
    
}
