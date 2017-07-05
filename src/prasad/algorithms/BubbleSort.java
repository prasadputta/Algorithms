package prasad.algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int crunchifyArry[] = { 15, 3, 9, 7, 19, 8, 1, 5 };
        log("Let's get started on Bubble Sort implementation in Java \n");
        log("============ Ascending Order result:" + Arrays.toString(CrunchifyBubbleSortAsceMethod(crunchifyArry)) + "\n");
        log("============ Descending Order result:" + Arrays.toString(CrunchifyBubbleSortDescMethod(crunchifyArry)) + "\n");
    }

    // Bubble Sort Algorithm in Ascending Order
    public static int[] CrunchifyBubbleSortAsceMethod(int[] crunchifyArr) {
        int temp;
        for (int i = 0; i < crunchifyArr.length - 1; i++) {

            for (int j = 1; j < crunchifyArr.length - i; j++) {
                if (crunchifyArr[j - 1] > crunchifyArr[j]) {
                    temp = crunchifyArr[j - 1];
                    crunchifyArr[j - 1] = crunchifyArr[j];
                    crunchifyArr[j] = temp;
                }
            }
            log("Iteration " + (i + 1) + ": " + Arrays.toString(crunchifyArr));
        }
        return crunchifyArr;
    }

    // Bubble Sort Algorithm in Descending Order
    public static int[] CrunchifyBubbleSortDescMethod(int[] crunchifyArr) {
        int temp;
        for (int i = 0; i < crunchifyArr.length - 1; i++) {

            for (int j = 1; j < crunchifyArr.length - i; j++) {
                if (crunchifyArr[j - 1] < crunchifyArr[j]) {
                    temp = crunchifyArr[j - 1];
                    crunchifyArr[j - 1] = crunchifyArr[j];
                    crunchifyArr[j] = temp;
                }
            }
            log("Iteration " + (i + 1) + ": " + Arrays.toString(crunchifyArr));
        }
        return crunchifyArr;
    }

    // Simple log util
    private static void log(String result) {
        System.out.println(result);

    }


    public static void BubbleSort2( int [ ] num )
    {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        while ( flag )
        {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                if ( num[ j ] < num[j+1] )   // change to > for ascending sort
                {
                    temp = num[ j ];                //swap elements
                    num[ j ] = num[ j+1 ];
                    num[ j+1 ] = temp;
                    flag = true;              //shows a swap occurred
                }
            }
        }
    }

}
