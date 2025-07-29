package javabasic.variable;

public class SchoolStaticVariable {
    static String schoolName = "ABCD High School";

    String name;
    int grade;

    public SchoolStaticVariable(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    public void showDetails(){
        System.out.println("Name: "+name+" "+"Grade: "+grade+" "+schoolName);
    }

    public static void displaySchool(){
        System.out.println("School Name : "+schoolName);
    }

    public static void main(String args[]){
        SchoolStaticVariable s1 = new SchoolStaticVariable("Manish",9);
        SchoolStaticVariable s2 = new SchoolStaticVariable("Raj",8);

        s1.showDetails();
        s2.showDetails();

        SchoolStaticVariable.schoolName="PQRS High School";

        s1.showDetails();
        s2.showDetails();

        displaySchool();
    }
}
