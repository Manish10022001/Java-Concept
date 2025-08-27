package strings;

public class OneStringCreation {
    public static void main(String args[]){
        //string can be created in two ways
        //1. using string literal
        String s1 = "ABC";
        String s2 = "123";

        //2. using new operator
        String s3 = new String("Manish");
        String s4 = new String("Shirsat");
        
        System.out.println("s1: "+s1+ "\ns2: "+s2+"\ns3: "+s3+"\ns4: "+s4);
    }

    @Override
    public String toString() {
        return "OneStringCreation []";
    }
}
