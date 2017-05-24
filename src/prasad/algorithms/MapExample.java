package prasad.algorithms;

import java.util.*;

/**
 * Created by 153608 on 3/27/2017.
 */
public class MapExample {


public static void main(String[] args){

    int[] x = {1,2,3} ;
    x[2] = 10;

    List<Integer> list = new ArrayList<Integer>();
    Map<Integer,String> map = new LinkedHashMap<>();
    map.put(1,"");
    map.put(2,"2");
    map.put(2,"asdasda");

    System.out.println(map.get(2));


}



}
