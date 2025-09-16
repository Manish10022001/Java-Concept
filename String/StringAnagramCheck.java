package String;
import java.util.Arrays;
public class StringAnagramCheck {
    
    public static boolean areAnagrams(String str1, String str2){
        // // Step 1: Check if lengths are equal
        if(str1.length() != str2.length()){
            return false;
        }

        // Step 2: Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Step 3: Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

         // Step 4: Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String args[]){
            String str1 = "car";
            String str2 = "arc";

            if(areAnagrams(str1,str2)){
                System.out.println(str1+ " and " +str2+" are anagrams");
            } else{
                System.out.println(str1 + " and "+str2+" are not anagrams");
            }
        }
}
