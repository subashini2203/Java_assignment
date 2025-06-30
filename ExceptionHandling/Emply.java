public class Emply {

    // Static variable: 
    public static String collegeName = "ABC College";

    // Non-static variables:
    String studentName;
    int studentId;

    // Static block:
    static {
        System.out.println("Static block: Student class loaded.");
    }

    // Instance block:
    {
        System.out.println("Instance block: New student object created.");
    }
    Emply(){
        studentName="";
        studentId=0;

    }
    // Constructor
    Emply(String name, int id) {
        studentName = name;
        studentId = id;
    }

    // Non-static method
    void displayDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("College: " + collegeName);
    }

    // Static method
     void changeCollegeName(String newName) {
        collegeName = newName;
    }

    // Main method
    public static void main(String[] args) {
 Emply emp;
 emp=new Emply();
emp.changeCollegeName("XYZ University");
       
        // Emply.changeCollegeName("AbC University");

        // Create first student object
        Emply s1 = new Emply("john", 101);
        s1.displayDetails();

        Emply s2 = new Emply("Meena", 102);
        s2.displayDetails();
        System.out.println(s1.collegeName);
    }
}