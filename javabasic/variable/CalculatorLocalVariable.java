package javabasic.variable;

public class CalculatorLocalVariable {
    public void addNumbers(int a, int b){
        int sum = a+b;
        System.out.println("Sum : "+sum);
    }

    public void showLoop(){
        for(int i = 1; i<=3; i++){
            System.out.println("Loop Counter: "+i);
        }
    }
    
    public static void main(String args[]){
        CalculatorLocalVariable calc = new CalculatorLocalVariable();

        calc.addNumbers(20,30);
        calc.showLoop();
    }
}
