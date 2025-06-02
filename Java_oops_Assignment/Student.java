public class Student {
    String name;
    int Rollno;
   void display1(){
    System.out.println("Student1 details:");
    System.out.println("Name: " + "John");
    System.out.println("Rollno:"+78);
}
   void display2(){
    System.out.println("Student2 details:");
    System.out.println("Name:" + "hello");
    System.out.println("Rollno:"+89);
   }
   public static void main(String[] args){
   Student obj1=new Student();
   Student obj2=new Student();
   obj1.display1();
   obj2.display2();
  
   }
}