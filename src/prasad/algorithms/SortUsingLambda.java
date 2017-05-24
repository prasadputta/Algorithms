package prasad.algorithms;

import java.util.Arrays;

public class SortUsingLambda {
    @FunctionalInterface
    interface SortingType{
        int[] sort(int[] inputValues);
    }



    public static void main(String[] args){

        SortingType bubbleSort = inputValues -> {
            for (int i = 0; i <inputValues.length-1; i++){
                for(int j = 0;j < inputValues.length-1;j++) {
                    if (inputValues[j] < inputValues[j + 1]) {
                        int temp = inputValues[j];
                        inputValues[j] = inputValues[j + 1];
                        inputValues[j + 1] = temp;
                    }
                }
            }
            return inputValues;
        };


        //sort using bubble sort
        int[] inputValues = {23,32,33,1,65,62,9,90};
        System.out.println(Arrays.toString(bubbleSort.sort(inputValues)));


    }

}
