package prasad.algorithms;

public class Factorial {

// f(n) = n* f(n-1)
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

    public static void main(String[] args){
        System.out.print(factorial(20));
    }

}
