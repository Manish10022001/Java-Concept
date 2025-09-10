package strings;

public class FourStringIntern {
    public static void main(String args[]){
        String s1 = "manish";
        String s2 = new String("manish");
        String s3 = new String("manish").intern();

        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
