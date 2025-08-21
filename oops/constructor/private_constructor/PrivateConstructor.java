package oops.constructor.private_constructor;

class Singleton{
    //Create a private static instance of the class
    private static Singleton instance;

    //Private constructor prevents instantiation from other classes
    private Singleton(){
        System.out.println("In private constructor");
    }

    //Public static method to provide access to the instance
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    
}
public class PrivateConstructor {
    public static void main(String args[]){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);
    }    
}
