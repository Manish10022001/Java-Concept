package String;
// Write a java program to reverse a string?
public class ReverseTheString {
    public static void main(String args[]){
        String str = "my Java";
        //using StringBuffer
        StringBuffer sbf = new StringBuffer(str);
        System.out.println(sbf.reverse());

        //Using iterative method: In this method, first we convert given string to char array using charArray() method. And then we iterate that array in the reverse order.
        char[] strArray = str.toCharArray();
        for(int i = strArray.length -1; i>=0; i--){
            System.out.print(strArray[i]);
        }
        System.out.println();

        //using recursive method
        System.out.println(recursiveMethod(str));
    }
    //using recursive method to reverse a string
    static String recursiveMethod(String str){
        //check if str is null or less than or equal to 1, if yes then return string
        if((null == str) || str.length()<=1){
            return str;
        }
        return recursiveMethod(str.substring(1))+ str.charAt(0);
    }
    
}
