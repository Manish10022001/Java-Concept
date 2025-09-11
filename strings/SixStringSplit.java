package strings;

public class SixStringSplit {
    public static void main(String args[]){
        String str = "Java is awesome";
        String[] words = str.split(" ");
        for(String word : words){
            System.out.println(word);
        }

        String str2 = "apple, orange, banana";
        String[] words2 = str2.split(",");
        for(String word2 : words2){
            System.out.println(word2);
        }
    }
}
