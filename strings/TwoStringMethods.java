package strings;
public class TwoStringMethods{
    public static void main(String args[]){
        String str = "Hello Java";
        String string = "Bye Java";
        //length()
        System.out.println(str.length());

        //charAt(index)
        System.out.println(str.charAt(2));

        //substring(start,end)
        System.out.println(str.substring(2,4));
        System.out.println(str.substring(3));

        //equals()
        System.out.println(str.equals(string));

        //contains()
        System.out.println(str.contains("ello"));

        //toUpperCase and toLowerCase
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        //replace()
        System.out.println(str.replace("Java","World"));

    }
}