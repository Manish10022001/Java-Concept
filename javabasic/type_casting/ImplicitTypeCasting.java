package javabasic.type_casting;
// implicit type casting, widening conversion, upcasting
public class ImplicitTypeCasting {
    static float methodOne(int i){
        long l = i; // int is auto widened to long
        return l;  // long l is auto widened to float
    }
    
    public static void main(String args[]){
        byte a = 10;
        short b = a;//byte is auto widened to short
        double d = (methodOne(b)); // short is auto widened to int as methodOne(int i) and 
                                    //int is auto widened to double;
        System.out.println(a);
        System.out.println(b);
         System.out.println(d);
    }
}
