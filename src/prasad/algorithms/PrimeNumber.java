package prasad.algorithms;

public class PrimeNumber {

    public static void checkPrime(int n){

        for(int i = 2;i< n;i++){
            if(n % i == 0){
                System.out.println(n + " is NOT a prime!!");
                return;
            }
        }
        System.out.println(n + " is a PRIME!!");

    }

    public static  void printPrimes(int n){

        for (int i = 2;i<=n;i++) {
                checkPrime(i);
        }
    }


    public static void main(String[] args) {

       // checkPrime(17);
        printPrimes(15);

    }

}
