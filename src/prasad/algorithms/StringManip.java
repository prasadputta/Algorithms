package prasad.algorithms;

import java.util.*;

public class StringManip {

    /**
     * Replace the first occurance of the token
     */
    public void subtractString(String str1,String str2){

        StringTokenizer st = new StringTokenizer(str2);
        while (st.hasMoreTokens()){
            String nextToken = st.nextToken();
            System.out.println("next token"+nextToken);
            str1= str1.replaceFirst(nextToken,"");
        }
        System.out.println("The new string is -->"+ str1);
    }

    public void subtractString3(String str1,String str2){


        StringTokenizer st = new StringTokenizer(str2);

        while(st.hasMoreTokens()){
            str1.replaceFirst(st.nextToken(),"");
        }

        System.out.println("The new string is -->"+ str1);
    }



    /**
     * Replace the first occurance of the token
     */
    public void subtractString2(String str1,String str2){

        for (String word : str2.split(" ")){
            str1 = str1.replaceFirst(word,"");
        }
        System.out.println("The reversed string is -->"+  new StringBuffer(str1).reverse().toString());
        System.out.println("The new string is -->"+ str1);

    }


    //Rotate an array of n elements to the right by k steps.
    public void rotate(int[] inputArray, int shiftBy){
        int[] newArray = new int[inputArray.length];

        for(int i = 0; i<inputArray.length;i++){
            int newIdx = (i+shiftBy) % inputArray.length;
            newArray[i] = inputArray[newIdx];
        }
        System.out.println("original array is -->"+Arrays.toString(inputArray));
        System.out.println("new array is shifted by "+ shiftBy + " -->"+ Arrays.toString(newArray));

    }


    public String reverseWords(String inputString){
        String[] inputArray = inputString.split(" ");
        StringBuffer newString = new StringBuffer();
        for(int i = inputArray.length-1;i >= 0; i--){
            newString.append(inputArray[i]).append(" ");
        }
        return newString.toString();
    }


    /**
     * Print all chars and no of times it appeared
     *
     */
    public void countChars(String str){

        Map<String,Integer> countMap = new HashMap();
        for(String c : str.split("")){
            if(countMap.get(c) == null){
                countMap.put(c,0);
            }
            countMap.put(c,countMap.get(c)+1);
        }

        for(String key :countMap.keySet()){
            System.out.println(key + "-->"+countMap.get(key));
        }
    }

    public void countChars2(String str){

        Map<Character,Integer> countMap = new HashMap();
        for(char c : str.toCharArray()){
            if(countMap.get(c) == null){
                countMap.put(c,0);
            }
            countMap.put(c,countMap.get(c)+1);
        }

        for(Character key :countMap.keySet()){
            System.out.println(key + "-->"+countMap.get(key));
        }

    }

public String reverseInplace(String inputStr){

    StringBuilder sb = new StringBuilder(inputStr);

    for (int i=0;i< (sb.length()/2);i++){
        char frontChar = sb.charAt(i);
        int otherEnd = (sb.length()- 1) - i;
        sb.setCharAt(i,sb.charAt(otherEnd));
        sb.setCharAt(otherEnd,frontChar);
    }

    return sb.toString();

}
    public boolean palindromeCheck(String inputStr){

        StringBuilder sb = new StringBuilder(inputStr.toLowerCase().trim());

        for (int i=0;i< (sb.length()/2);i++){

            int otherEnd = (sb.length()- 1) - i;
            if(sb.charAt(i)==sb.charAt(otherEnd)){
                continue;
            }else return false;

        }

        return true;

    }


    public static void main(String[] args){
        StringManip sm = new StringManip();
        sm.subtractString("A statement is a statement","statement a");
        sm.subtractString2("A statement is a statement","statement a");
        sm.countChars("Hello world");
        sm.countChars2("Hello world");

        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        sm.rotate(inputArray,5);
        System.out.println(sm.reverseWords("Hello my world!"));

        System.out.println(sm.reverseInplace("Hello World"));
        System.out.println(sm.palindromeCheck("topspot"));
    }

}
