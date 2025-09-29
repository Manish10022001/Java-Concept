package String;
// Write a java program to reverse a string?
public class ReverseTheString {
    public static void main(String args[]){
        String str = "my Java";
        //using StringBuffer
        StringBuffer sbf = new StringBuffer(str);
        System.out.println(sbf.reverse());
    }

    
}
