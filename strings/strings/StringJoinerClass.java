package strings;

import java.util.StringJoiner;

public class StringJoinerClass {
    public static void main(String args[]){

        //String joiner with delimiter
        StringJoiner sj = new StringJoiner(",");
        sj.add("Manish");
        sj.add("Ajinkya");
        sj.add("Om");
        System.out.println(sj.toString());

        //string joiner with prefix and suffix
        StringJoiner sj2 = new StringJoiner(",","[","]");
        sj2.add("Manish");
        sj2.add("om");
        sj2.add("Jay");
        System.out.println(sj2.toString());
    }
}
