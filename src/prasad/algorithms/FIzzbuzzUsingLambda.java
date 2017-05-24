package prasad.algorithms;

public class FIzzbuzzUsingLambda {

    @FunctionalInterface
    interface FizzbuzzFunction {
        public void run(int count);
        default int defaultAmount(){
            return 100;
        }
    }

    public static void main(String[] args) {

        FizzbuzzFunction f = max -> {
            for (int i = 1; i <= max; i++) {
                if (i % 5 == 0 & i % 7 == 0) {
                    System.out.println(i + " Fizz");
                } else if (i % 5 == 0) {
                    System.out.println(i + " Buzz");
                } else if (i % 7 == 0) {
                    System.out.println(i + "FizzBuzz");

                }

            }
        };

        f.run(100);

    }
}