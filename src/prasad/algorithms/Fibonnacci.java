package prasad.algorithms;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * 0 1 1 2 3 5 8 13 21 34 .....
 */
public class Fibonnacci {
    static Map<Integer,BigInteger> memo = new HashMap<>();
    static {
        memo.put(1,BigInteger.ONE);
        memo.put(2,BigInteger.ONE);
    }

    //recursive version
    public int fib(int count){

        if(count <= 1) {
            return count;
        }
        int retVal = fib(count -1 ) + fib(count -2);
        return retVal;
    }

    //Non recursive version
    public long fibNonrecursive(long n){
        if(n <= 2) {
            return n;
        }
        long prev = 0;
        long next = 1;
        long current=0;
        for(long i = 3;i<=n;i++){
            current = prev + next;
            prev = next;
            next = current;
        }
        return current;


    }

    void fib9(int n){

        int first;
        int second;
        if(n<1) return;
        else {
            first = 1;
            System.out.println(first);
        }
        if(n==1) return;
        else {
            second = 2;
            System.out.println(second);
        }
        int next;
        for(int i=3;i<=n;i++){
            next = first+second;
            System.out.println(next);
            first =second;
            second=next;
        }

    }
    //dynamic programming
    static BigInteger fib10(int n){
        BigInteger result;
        if(memo.containsKey(n)) return memo.get(n);

        if(n==1 || n==2){
            result = BigInteger.valueOf(1);
            return result;
        }

        result = fib10(n-1).add(fib10(n-2));
        memo.put(n,result);
        return result;

    }



    public static void main(String args[]){
      //  System.out.println(new Fibonnacci().fib(45));
        //System.out.println(new Fibonnacci().fibNonrecursive(10));
        //new Fibonnacci().fib9(10);
        System.out.println(Fibonnacci.fib4(1000));
    }


    public static BigInteger fib4(int n){
        if(n==1 || n==2){ return BigInteger.valueOf(1);}
//if it is already calculated use it other wise calculate
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        BigInteger result = fib4(n-1).add(fib4(n-2));
        memo.put(n,result);

        return result;


    }


}
