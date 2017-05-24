package prasad.algorithms;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorTest {

    public static void main(String[] args){
        BinaryOperator<Integer> binaryOperator = (a,b)-> a * b;
        Function <Integer,Integer> func = n -> n*2;
        System.out.println(binaryOperator.apply(2,3));
        System.out.println(binaryOperator.andThen(func).apply(2,3));

    }

}
