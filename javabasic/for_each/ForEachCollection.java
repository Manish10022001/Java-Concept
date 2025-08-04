package javabasic.for_each;

import java.util.ArrayList;

public class ForEachCollection {
    public static void main(String args[]){

        ArrayList<String> str = new ArrayList<String>();

        str.add("First");
        str.add("Second");
        str.add("Third");
        str.add("Fourth");
        str.add("Fifth");

        for(String s : str){
            System.out.println(s);
        }
    }
}
