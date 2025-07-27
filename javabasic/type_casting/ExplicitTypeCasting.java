package javabasic.type_casting;
//explicity type casting, narrowing conversion, downcasting
public class ExplicitTypeCasting {
   static short methodOne(long l){
    int i = (int) l; //long is explicitly narrowed to int
    return (short) i; // int is explicitly narrowed to short
   }

   public static void main(String args[]){
    double d = 10.22;
    float f = (float) d;//double is explicity narrowed to float
    byte b = (byte) methodOne((long) f); //float is explictly narrowed to long, then passed as methodOne(long), which return short, then short is explicttly narrowred to byte
    System.out.println(b);
   }
}
