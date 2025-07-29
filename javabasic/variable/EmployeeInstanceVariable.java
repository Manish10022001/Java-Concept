package javabasic.variable;

public class EmployeeInstanceVariable {
    // Instance variables (object-specific)
    String name;
    int age;

    // Constructor to initialize instance variables
    public EmployeeInstanceVariable(String name, int age){
        this.name = name;
        this.age = age;
        //System.out.println("Name : "+name+"Age: "+age);
    }

    // Instance method to display employee information
    public void displayInfo(){
        System.out.println("Name : "+name +"\n"+ "Age : "+age);
    }

    // Static method accessing instance variables using object reference
    public static void printInfo(EmployeeInstanceVariable emp){
        System.out.println("\nName : "+emp.name+ "\n"+ "Age : "+emp.age);
    }

    public static void main(String args[]){
        // Creating two Employee objects with different data
        EmployeeInstanceVariable e1 = new EmployeeInstanceVariable("Manish",24);
        EmployeeInstanceVariable e2 = new EmployeeInstanceVariable("Ajinkya",23);

        // Calling instance method
        e1.displayInfo();
        e2.displayInfo();

        // Accessing instance variables from static method
        printInfo(e1);
        printInfo(e2);
    }
}
