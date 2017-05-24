package prasad.algorithms;

import java.util.*;

/**
 * Created by 153608 on 4/28/2017.
 */
public class MapExamples {

    public static void testHash(){
            Map<Integer,String> hashMap = new HashMap<>();
            hashMap.put(1,"Student 1");
            hashMap.put(2,"Student 2");
            hashMap.put(3,"Student 3");
            hashMap.put(4,"Student 4");

        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"Student 1");
        linkedHashMap.put(2,"Student 2");
        linkedHashMap.put(3,"Student 3");
        linkedHashMap.put(4,"Student 4");

      /* Display content using Iterator*/
            Set entries = hashMap.entrySet();

         Set keys = hashMap.keySet();
         Iterator iter = keys.iterator();
        while(iter.hasNext()){
            System.out.println(hashMap.get(iter.next()));
        }

        for(Integer key : hashMap.keySet()){


        }

        }



    public static void main(String[] args){
        MapExamples.testHash();


    }

    }

