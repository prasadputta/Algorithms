package prasad.algorithms;

import java.util.Arrays;
import java.util.function.BinaryOperator;


    public class MergeSort implements BinaryOperator<int[]> {

        @Override
        public int[] apply(int[] t, int[] u) {

            int[] result = new int[t.length + u.length];

            for (int i = 0, j = 0, k = 0; i < result.length; i++){

                if( j == t.length){
                    result[i] = u[k++];
                } else if (k == u.length) {
                    result[i] = t[j++];
                } else {
                    result[i] = t[j] < u [k] ? t[j++] : u[k++];
                }

            }

            return result;
        }
        BinaryOperator<int[]> mergeNew = (t,u) -> {
            int[] result = new int[t.length + u.length];
            for (int i = 0, j = 0, k = 0; i < result.length; i++){
                if( j == t.length){
                    result[i] = u[k++];
                } else if (k == u.length) {
                    result[i] = t[j++];
                } else {
                    result[i] = t[j] < u [k] ? t[j++] : u[k++];
                }
            }
            return result;
        };

        public static void main(String[] args) {

            int values1[] = {3,12,6,7,2,1,23,4,5,7,8,4,2,5,365};
            int values2[] = {3,12,33,7,2,1,23,4,554,7,8,4,2,5,365};

            MergeSort mergeSort = new MergeSort();

            System.out.println(Arrays.toString(mergeSort.apply(values1,values2)));
        }


    }
