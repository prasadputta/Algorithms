package prasad.algorithms;

public class PrimeNumber {

    public static boolean checkPrime(int n){
        if(n < 0){
            System.out.println("Invalid Number");
            return false;
        }

        if(n%2==0){
           return false;
       }

        for(int i = 2;i< Math.sqrt(n);i+=2){
            if(n % i == 0){
                System.out.println(n + " is NOT a prime!!");
                return false;
            }
        }

        System.out.println(n + " is a PRIME!!");
        return true;
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
