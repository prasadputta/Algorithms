package prasad.algorithms;

/**
 * 0 1 1 2 3 5 8 13 21 34 .....
 */
public class Fibonnacci {

    //recursive version
    public int fib(int count){

        if(count <= 1) {
            return count;
        }
        int retVal = fib(count -1 ) + fib(count -2);
        return retVal;
    }

    //Non recirsive version
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

    public static void main(String args[]){
      //  System.out.println(new Fibonnacci().fib(45));
        System.out.println(new Fibonnacci().fibNonrecursive(90));

    }

}
