package prasad.algorithms;

public class LambdaTest {



    MathOperation addition = (a,b) -> a+b;
    MathOperation multiply = (a,b) -> {return a*b;};

    @FunctionalInterface
    interface MathOperation {
        int operation(int a, int b);
    }

    public int operateMath(int a, int b,MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
public static void main(String[] args){

    LambdaTest lt = new LambdaTest();
    System.out.println("Adding numbers"+lt.operateMath(2,3,lt.addition));

}

}
