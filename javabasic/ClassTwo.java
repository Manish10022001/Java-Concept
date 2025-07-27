package javabasic;
/* 
class ClassOne {
    public static void main(String args[]){
        ClassTwo.methodOfClassTwo();
    }
}

class ClassTwo{
    static void methodOfClassTwo(){
        System.out.println("From Class Two");
    }
}
*/

//now declaring classOne as public, now in javac classOne can only be used to compile
/*
  public class ClassOne{
    public static void main(String args[]){
        ClassTwo.methodOfClassTwo();
    }
}
class ClassTwo{
    static void methodOfClassTwo(){
        System.out.println("Method of class two");
    }
}

 */

//classOne as default and classTwo as public => now have to save file with name classTwo otherwise it will give error wile compiling
//and while running error name : main method not found in classTwo
/* 
class ClassOne{
    public static void main(String args[]){
        ClassTwo.methodOfClassTwo();
    }
}
public class ClassTwo{
    static void methodOfClassTwo(){
        System.out.println("Method f class two");
    }
}
    */

//declare both classOne and classTwo as public, will get error while compiling any of the two class as 
//as one file should contain one or zero public class.
/* 
public class ClassOne{
    public static void main(String args[]){
        ClassTwo.methodOfClassTwo();
    }
}
public class ClassTwo{
    static void methodOfClassTwo(){
        System.out.println("Method f class two");
    }
}
    */

//both class have main method and are not public, can compile any class and will get result as it contain main method and no file is public
class ClassOne{
    public static void main(String args[]){
        System.out.println("Class one");
    }
}
class ClassTwo{
    public static void main(String args[]){
        System.out.println("Class Two");
    }
}