package javabasic.for_each;
public class NestedForEachLoop {
    public static void main(String args[]){
        int [][] twoDArray = {{1,2,3,4},{1,2,3,4}};

        for(int [] oneDArray : twoDArray){
            System.out.print("[");

            for(int i: oneDArray){
                System.out.print(i+"\t");
            }
            System.out.print("]");
        }
    }
}
