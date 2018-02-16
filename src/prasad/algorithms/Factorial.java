package prasad.algorithms;

import java.math.BigInteger;

public class Factorial {

// f(n) = n* f(n-1)
    public static BigInteger factorial3(int n){
        //f(n) = n*f(n-1)
        //f(5) = 5*4*3*2*1
        //f(1)=1

        if(n==1){
            return BigInteger.ONE;
        }
        return  factorial3(n-1).multiply(BigInteger.valueOf(n));
    }

    public static long factorial(int n){

        if(n <= 0){
            return 0;
        }

        long result = 1;
        for (int i =1;i<=n;i++){
            result = result * i;
        }
        return result;
    }

    static int fact9(int n){
        //3*2*1
       //if(n<1) ;
        if(n==1){return n;}
        return n*fact9(n-1);

    }


    public static void main(String[] args){
       // System.out.println(factorial(10));
        System.out.println(factorial3(10));
        System.out.println(fact9(10));


    }

}
