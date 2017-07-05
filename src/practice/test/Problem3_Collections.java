package practice.test;

import java.util.*;

public class Problem3_Collections {

        public void collectionFun() {
            //Requirements: Generate 100 random numbers between 1-1000.
            //	Put the numbers into a Map.  Then move them to a Set.
            //  Then move the numbers into a List.  Then sort the numbers.
            //	Finally output the numbers, with one number on every row

            Map<Integer,Double> map = new HashMap<>();

            for (int i =1;i<=100;i++){
                map.put(i,(Math.random()*1000)%1000);
            }

            System.out.println("Total numbers" + map.size());

            Set<Integer> keySet = map.keySet();

            Set<Double> set =new HashSet<>();
            List<Double> list = new ArrayList<>();

            for (Integer key: keySet){
                set.add(map.get(key));
                list.add(map.get(key));
            }

            Collections.sort(list);

            for (Double listItem : list){
                System.out.println(listItem);

            }
        }


    public static void main(String[] args) {
        Problem3_Collections pr = new Problem3_Collections();
        pr.collectionFun();
    }

}
