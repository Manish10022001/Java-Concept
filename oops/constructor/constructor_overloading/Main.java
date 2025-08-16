package oops.constructor.constructor_overloading;
class Student{
    public int id;
    public String name;
    public int age;
    public Student(int i, String s){
         id = i ;
         name = s;
    }

    public Student(int i, String s, int a){
         id = i;
         name = s;
         age = a;
    }

    public void display(){
        System.out.println("ID: "+id+" "+"Name: "+name+" "+"Age: "+age);
    }
}
public class Main {
    public static void main(String args[]){
        Student s1 = new Student(1,"Manish");
        Student s2 = new Student(2,"Ajinkya",23);

        s1.display();
        s2.display();
    }
}
