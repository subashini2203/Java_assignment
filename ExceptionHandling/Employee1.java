class Employee {
    // non-static fields
    int employeeid;
    String employeename;
    // static field
    static String companyname;
    // static block
    static{
    companyname="TechSoft";
    System.out.println("Static block executed. Company name initialized.");
    }
    // instance block
    {
        System.out.println("Instance block executed. Employee object created.");
    }
    // constructor
    Employee(int id, String name) {
        employeeid = id;
        employeename = name;
    }
    // non-static method
    void display() {
        System.out.println("Employee ID: " + employeeid);
        System.out.println("Employee Name: " + employeename);
        System.out.println("Company Name: " + companyname);
    }
    // static method
    static void changeCompanyName(String newName) {
        companyname = newName;
        System.out.println("Company name changed to: " + companyname);
    }
}

    public class Employee1 {
        public static void main(String[] args) {
            // Creating Employee objects
            Employee emp1 = new Employee(101, "john");
            Employee emp2 = new Employee(102, "jo");
            // non-static method call
            emp1.display();
            emp2.display();
            // static method call
            Employee.changeCompanyName("TechSolutions");
            System.out.println("After changing company name:");
            emp1.display();
            emp2.display();
        }
    }
    

