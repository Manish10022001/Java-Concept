package oops.constructor.private_constructor;

class Singleton{
    private Singleton(){
        System.out.println("In private constructor");
    }

    public static Singleton getObject(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    private static Singleton instance;
}
public class PrivateConstructor {
    public static void main(String args[]){
        Singleton inst = Singleton.getObject();
    }    
}
