package prasad.algorithms;

import java.util.*;
import java.util.stream.Collectors;

/**
 * We have an array of integers, where:

 The integers are in the range 1..n1..n
 The array has a length of n+1n+1
 It follows that our array has at least one integer which appears at least twice. But it may have several duplicates, and each duplicate may appear more than twice.

 Write a function which finds an integer that appears more than once in our array. (If there are multiple duplicates, you only need to find one of them.)

 We're going to run this function on our new, super-hip Macbook Pro With Retina Display™. Thing is, the damn thing came with the RAM soldered right to the motherboard, so we can't upgrade our RAM. So we need to optimize for space!

 */
 public  class FindDups {
    static void find(){
      List<Integer> list = new ArrayList<>();
        
      list = Arrays.asList(new Integer[]{33,22,4,44,33,23434,44,34,3,33,22,6,77,87,56,54,33,45});

      Set<Integer> uniques = new HashSet<>();
      System.out.println(list.stream().filter(integer -> !uniques.add(integer)).collect(Collectors.toSet()));

  }




    public static void main(String[] args) {
    find();

    }
}
