package prasad.algorithms;

import java.util.*;
/*
You have an integer array of length n.
Each element in the array can only take on the values of [0, n-1].
Try to find all integer values that are duplicated in the array.

 */

public class Problem6_FindDups {
    static Integer[] numArray = {1, 2, 3, 3, 4, 5, 6, 7, 8, 5, 4, 1, 1, 0, 2, 9, 13, 15, 6, 16};

    //INSTRUCTIONS: Write an algorithm which operates in O(n), which prints out all duplicate values in the array

    public static void printOutDups2() {

        Set<Integer> set = new HashSet<>();
        Set<Integer> dups = new HashSet<>();
        for (Integer item:numArray) {
            if(set.add(item)==false){
                dups.add(item);
            }
        }
       // Arrays.sort(numArray);
        System.out.println("Original Array-->"+Arrays.toString(numArray));
   System.out.println("Dups in the array-->"+dups);

    }

    public static void printDups3(){
        long start = System.currentTimeMillis();
        boolean [] flags = new boolean[numArray.length];
        for (int i=0;i<numArray.length;i++){
            if (flags[numArray[i]]==true){
                System.out.println("dup"+numArray[i]);
            }else{
                flags[numArray[i]]=true;
            }
        }
        long duration = System.currentTimeMillis()-start;

        System.out.println(duration);
    }


    public static void printDups4(){
        for(int i=0;i<numArray.length;i++){
            int val =Math.abs(numArray[i]);
            if(numArray[val] >=0){
                numArray[val]=-1*numArray[val];
            }else{
                //dup
                System.out.println("Dup-->"+val);
            }
        }

    }

    public static void printDups5(){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i < numArray.length; i++) {
            int num = numArray[i];
            if(map.containsKey(num)) {
                map.put(num, 1 + map.get(num));
            } else {
                map.put(num, 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer,Integer> entry:entries){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " occured "+ entry.getValue() +" times");
            }

        }
    }


    public static void main(String[] args) {
       // Problem6_FindDups.printDups3();
        //Problem6_FindDups.printDups4();
       // Problem6_FindDups.printDups5();

        Problem6_FindDups.findDups();


    }

  /*
You have an integer array of length n.
Each element in the array can only take on the values of [0, n-1].
Try to find all integer values that are duplicated in the array.

 */

 public static void findDups(){
     int[] inputArray = {1,3,3,23,43,44,2323,23};

     Set<Integer> set = new HashSet<>();

     List<Integer> dups = new ArrayList<>();

     for(int i :inputArray){
         if(!set.add(i)){
             dups.add(i);
         }
     }

     System.out.println(dups);

 }






}