package oops.constructor.parameterized_constructor;
class Student{
    int id;
    String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println("ID: "+id +"\n"+"NAME: "+name);
    }
}
public class Main {
    public static void main(String args[]){
        Student s1 = new Student(1, "Manish");
        s1.display();
    }
}
