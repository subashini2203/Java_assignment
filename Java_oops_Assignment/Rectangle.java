public class Rectangle {
    int width;
    int length;
    // Default constructor
    Rectangle() {
        width = 1;
        length = 1;
    }
    Rectangle(int num1,int num2){
        width=num1;
        length=num2;
 }

 public double calculatearea(){
    double area=width*length;
    return area;

 }

public static void main(String[] args){

    Rectangle r1=new Rectangle();
    
    double r1area1=r1.calculatearea();
    System.out.println("Area of rectangle r1: " + r1area1);

    



    Rectangle r=new Rectangle(5,10);
   
    double rarea=r.calculatearea();
    System.out.println("Area of rectangle r:"+ rarea);

    
}

}
