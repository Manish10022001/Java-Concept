package oops.constructor;

//If there is no constructor in a class, compiler automatically creates 
//a default constructor.

//default constructor which displays the default values  
class Student{
    int id;
    String name;
    //method to display the value of id and name  
    public void display(){ //no constructor in this class, so compiler automatically create default constructor
        System.out.println("ID: "+id+"\n"+"Name: "+name+"\n");
        
    }
}

//Without default values and with constructor
class Teacher{
    public Teacher(){
        System.out.println("Class is Over");
    }
}
public class MainOne{
    public static void main(String[] args){
        //creating objects   
        Student s1 = new Student();
        Student s2 = new Student();

        Teacher t1 = new Teacher(); 
        //displaying values of the object    
        s1.display();
        s2.display();
    }
}