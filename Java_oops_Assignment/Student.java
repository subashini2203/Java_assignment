public class Student {
    String name;
    int Rollno;
   void display(){
    System.out.println("Student1 details:");
    System.out.println("Name: " + this.name);
    System.out.println("Rollno:"+this.Rollno);
}

   public static void main(String[] args){
   Student obj1=new Student();
   Student obj2=new Student();

   obj1.name="john";
    obj1.Rollno=101;

    obj2.name="jane";
    obj2.Rollno=102;
    
   obj1.display();
   obj2.display();
   }
}