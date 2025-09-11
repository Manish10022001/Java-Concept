package strings;

public class SixStringSplit {
    public static void main(String args[]){
        String str = "Java is awesome";
        String[] words = str.split(" ");
        for(String word : words){
            System.out.println(word);
        }
    }
}
