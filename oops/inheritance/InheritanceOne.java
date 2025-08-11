package oops.inheritance;
class A{
    public void showDataOfA(){
        System.out.println("Super Class");
    }
}

class B extends A{
    public void showDataOfB(){
        System.out.println("Sub Class");
    }
}
public class InheritanceOne{
    public static void main(String args[]){
        B b = new B();
        b.showDataOfA();
        b.showDataOfB();
    }
}