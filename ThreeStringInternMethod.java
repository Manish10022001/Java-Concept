package strings;
//intern() -> places string into string constant pool , if it is not already there
public class ThreeStringInternMethod {
    public static void main(String args[]){
        String a = new String("ABC");  //heap memory
        String b = "ABC";                       //string constant pool
        System.out.println(a==b); //false bacause a is in heap memory and b is in string constant pool

        System.out.println(a.intern() == b); //true, because intern() method places string into pool, so now both a and b are in string constant pool
    }
}
