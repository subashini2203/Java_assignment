public class Rectangle {
    int width;
    int length;
    Rectangle(int num1,int num2){
        width=num1;
        length=num2;
 }

public static void main(String[] args){
    Rectangle r=new Rectangle(1,1);
    System.out.println(r.width);
    System.out.println(r.length);
}

}
