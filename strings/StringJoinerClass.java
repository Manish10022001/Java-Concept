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

        
    }
}
