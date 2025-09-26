package String;
//  Write a Java program to count the total number of occurrences of a given character in a string without using any loop?
public class CountCharacterOccurrence {
    public static void main(String args[]){
        String s = "Java is java again java";
        char c = 'a';
        int count = s.length() - s.replace("a","").length();

        System.out.println("Number of occurrence os 'a' in "+s+" = "+count);
    }
}
