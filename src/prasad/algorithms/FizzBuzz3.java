package prasad.algorithms;

/**
 * "Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz”
 * instead of the number and for the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz”."
 */


public class FizzBuzz3 {

    @FunctionalInterface
    interface FizzBuzz{
        void solve99(int max);

    }

    static void solve99(int max){

        for(int i=1;i<=100;i++){
            if(i%15==0){
                System.out.println("fizzbizz");
                //fizzbuzz
            }else if(i%5==0){
                System.out.println("buzz");
                //buzz
            }else if(i%3==0){
                System.out.println("fizz");
                //fizz
            }else {
                System.out.println(i);
            }
        }

    }



    static void solve2(int max){
        long startTime = System.currentTimeMillis();

        for(int i=1;i<=max;i++) {

            String result = "";
            if (i % 3 == 0) {
                result = "Fizz";
            }
            if (i % 5 == 0) {
                result = result + "Buzz";
            }
            System.out.println(i+"--"+result);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken: "+(endTime-startTime));
    }

    static void solve(int max){
        if(max <=0) return;
        long startTime = System.currentTimeMillis();

        for(int i=1;i<=max;i++){
            if(i%15 == 0){
                System.out.println(i+ "  FizzBuzz");
            }else if(i%5 == 0){
                System.out.println(i+ " Buzz");
            }else if(i%3 == 0){
                System.out.println(i+ " Fizz");
            }else{
                System.out.println(i);
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken: "+(endTime-startTime));
    }


    public static void main(String[] args) {
       // solve(100);
//solve2(100);

        FizzBuzz fizzBuzzFunction = max -> {
            long startTime = System.currentTimeMillis();
            if(max <=0) return;

            for(int i=1;i<=max;i++){
                if(i%15 == 0){
                    System.out.println(i+ "  FizzBuzz");
                }else if(i%5 == 0){
                    System.out.println(i+ " Buzz");
                }else if(i%3 == 0){
                    System.out.println(i+ " Fizz");
                }else{
                    System.out.println(i);
                }
            }
            long endTime = System.currentTimeMillis();

            System.out.println("Time taken: "+(endTime-startTime));
        };

       // fizzBuzzFunction.solve(10000);

    }


}
