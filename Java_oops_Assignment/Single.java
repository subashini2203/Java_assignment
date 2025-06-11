class Person {
    String name;
    int age;
Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person {
    int employeeId;
    double salary;

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age); 
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary     : ₹" + salary);
    }
}
public class Single {
    public static void main(String[] args) {
       
        Employee emp = new Employee("Arun", 30, 101, 55000.50);

        emp.displayDetails();
    }
}

