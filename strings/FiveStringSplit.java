//Split a string in java
package strings;

import java.util.Arrays;

//split() method returns string array
public class FiveStringSplit {
    public static void main(String args[]){
        String[] str1 = "leo, rodri, sergio".split(",");
        System.out.println(Arrays.toString(str1));
    }
}
