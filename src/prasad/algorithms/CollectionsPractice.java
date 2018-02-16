package prasad.algorithms;

import java.util.*;

public class CollectionsPractice {

        public void collectionFun() {
            //Requirements: Generate 100 random numbers between 1-1000.
            //	Put the numbers into a Map.  Then move them to a Set.
            //  Then move the numbers into a List.  Then sort the numbers.
            //	Finally output the numbers, with one number on every row

            Map<Integer,Long> map = new HashMap<>();

            int i=1;
             while(map.size() <100) {
                 long randomVal=Math.round(Math.random()*1000);
                 if(!map.containsValue(randomVal))
                        map.put(i++,(randomVal));

            }

            System.out.println("Total numbers" + map.size());

            Set<Integer> keySet = map.keySet();

            Set<Long> set =new HashSet<>();
            List<Long> list = new ArrayList<>();

            for (Integer key: keySet){
                set.add(map.get(key));
                list.add(map.get(key));
            }

            System.out.println("Total numbers" + set.size());

            Collections.sort(list);

            for (Long listItem : list){
                System.out.println(listItem);

            }
        }


    public static void collectionsFun(){

        //Requirements: Generate 100 random numbers between 1-1000.
        //	Put the numbers into a Map.  Then move them to a Set.
        //  Then move the numbers into a List.  Then sort the numbers.
        //	Finally output the numbers, with one number on every row


        Map<Integer,Integer> map  = new HashMap<>();

        while (map.size() <100){
            int randVal = (int)Math.round(Math.random()*1000);
            if(!map.containsValue(randVal))
                map.put(map.size(),randVal);
        }

        Set <Integer> set= new HashSet<>();
        set.addAll(map.values());
        List<Integer> list = new ArrayList<>();
        list.addAll(set);
        Collections.sort(list);
        System.out.println(list.size());
        for(int i: list){
            System.out.println(i);
        }



    }



    public static void main(String[] args) {
        CollectionsPractice pr = new CollectionsPractice();
        pr.collectionsFun();
    }

}
