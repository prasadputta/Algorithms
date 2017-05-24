package prasad.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by 153608 on 5/16/2017.
 */
public class BestProfitTrade {

    int findBestProfit(List<Integer> list){

        List<Integer>  profitList = new ArrayList<>();
        int profit =0;
        //--Repeat the following
        for(int i=0;i<list.size();i++) {
            //find the min
            int min = Collections.min(list);
            int minLoc = list.indexOf(min);

            //compare with the max from the list after the min
            profit = Collections.max(list.subList(minLoc, list.size())) - min;
            profitList.add(profit);
            //remove min
            list.remove(minLoc);
        }
        //---
        return Collections.max(profitList);

    }




    public static void main(String[] args){
        List<Integer> stockPrices = new ArrayList<>(Arrays.asList(10,7,5,2));

        BestProfitTrade bpt = new BestProfitTrade();
        System.out.println(bpt.findBestProfit(stockPrices));

    }

}
