package prasad.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 153608 on 5/16/2017.
 */
public class ProductOfOtherNumbers {

    void getProductsOfAllIntsExceptAtIndex(List<Integer> list){

        List<Integer> resultList =new ArrayList<>();
        //for each item in the list
        for(int i=0;i<list.size();i++) {
            //multiply all the items except the one at idx
            int result =1;
            for(int j=0;j<list.size();j++){
                if(i==j) continue;
                result = result * list.get(j);
            }
            resultList.add(i,result);
        }

        System.out.println(resultList);

    }


    void getProductsOfAllIntsExceptAtIndex2(List<Integer> list){

        List<Integer> resultList =new ArrayList<>();
        //for each item in the list
        int result =1;
        for(int i=1;i<list.size();i++) {
            //multiply all previous items
            result = resultList.get(i-1) * list.get(i);
            resultList.add(i-1,result);
        }

        System.out.println(resultList);

    }



    public static void main(String[] args){

        List<Integer> list = new ArrayList<>(Arrays.asList(1,7,3,4));

        ProductOfOtherNumbers pn = new ProductOfOtherNumbers();
        pn.getProductsOfAllIntsExceptAtIndex(list);
    }
}
