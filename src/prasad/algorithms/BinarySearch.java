package prasad.algorithms;

public class BinarySearch {

    int[] inputValues = {23, 32, 56, 72, 82, 98, 109, 190};

    public int search(int findIt) {
        int lowIdx = 0;
        int highIdx = inputValues.length-1;
        int middleIdx=0;

        boolean notFound=true;
        while (notFound){
            middleIdx = (lowIdx+highIdx)/2;
            int middleOne = inputValues[middleIdx];
            if(findIt == middleOne){return middleIdx;}
            else if(middleOne > findIt){
                highIdx = middleIdx;
            }else {
                lowIdx = middleIdx;
            }
        }
        return middleIdx;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(32));
    }

}

