package prasad.algorithms;

public class FIzzbuzzUsingLambda {

    @FunctionalInterface
    interface FizzbuzzFunction {
        public void run(int count);

    }

    public static void main(String[] args) {

        FizzbuzzFunction f = (int max) -> {

            if(max < 0) return;

            for (int i = 1; i <= max; i++) {
                if (i % 5 == 0 & i % 7 == 0) {
                    System.out.println(i + " FizzBuzz");
                } else if (i % 5 == 0) {
                    System.out.println(i + " Fizz");
                } else if (i % 7 == 0) {
                    System.out.println(i + " Buzz");
                }
            }
        };

        f.run(100);

    }
}