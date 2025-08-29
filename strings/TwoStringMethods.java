package strings;
public class TwoStringMethods{
    public static void main(String args[]){
        String str = "Hello Java";

        //length()
        System.out.println(str.length());

        //charAt(index)
        System.out.println(str.charAt(2));

        //substring(start,end)
        System.out.println(str.substring(2,4));
        System.out.println(str.substring(3));
    }
}