package strings;

public class StringIntegerConversion {
    public static void main(String args[]){
        //String to integer
        int num = Integer.parseInt("22");
        System.out.println("String converted to integer: "+num);

        String str = Integer.toString(num);
        System.out.println("Integer converted to String: "+str);
    }
}
