package String;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString{
    public static void duplicateWords(String inputString){

        //split inputString into words
        String[] words = inputString.split(" ");

        //create one HashMap and store words in key and its count as value
        HashMap<String,Integer> wordCount = new HashMap<String,Integer>();

        //then we check each word using for each loop
        for(String word : words){
            //then used if-else condition if it contains the word
            if(wordCount.containsKey(word.toLowerCase())){
                //if it is present , then increment its value by 1
                wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
            }
            //if not present , then set the count as 1
            else{
                wordCount.put(word.toLowerCase(), 1);
            }
        }

        //extract all keys of word count useing Set
        Set<String> wordInString = wordCount.keySet();

        //iterating through all words in wordCount
        for(String word : wordInString){
            //if wordCount greater than 1
            if(wordCount.get(word) >1 ){
                System.out.println(word + " : "+wordCount.get(word));
            }
        }
    }

    public static void main(String args[]){
        duplicateWords("Bread butter and bread");
        duplicateWords("java is java again java");
        duplicateWords("My name is Anthony Gonzalez.");
    }
}