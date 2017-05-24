package prasad.algorithms;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by 153608 on 3/28/2017.
 */
public class Fizzbuzz {


/*

This program plays the game "Fizzbuzz".  It counts to 100, replacing each
 * multiple of 5 with the word "fizz", each multiple of 7 with the word "buzz",
 * and each multiple of both with the word "fizzbuzz".  It uses the modulo
 * operator (%) to determine if a number is divisible by another.

 */

    public void fizzBuzz(){

        for(int i = 0;i<100;i++){
            if(i%5==0 && i%7 == 0){
                System.out.println(i + " Fizz");
            }else if(i%5 == 0){
                System.out.println(i + " Buzz");
            }else if( i%7 == 0  ){
                System.out.println(i + "FizzBuzz");

            }else{
                System.out.println(i);
            }
        }
    }


    public void fizzBuzzgeAlternative(){
        List <String> returnList = new ArrayList<>();
        String returnVal;

        for(int i = 0;i<100;i++){
            returnVal = getWord(3,i,"Fizz") + getWord(5,i,"Buzz");
            if(returnVal.length()==0){
                returnVal = String.valueOf(i);
            }
            returnList.add(returnVal);
        }

        System.out.println(returnList);
    }


    public List fizzBuzz3(int max){
        List<String> returnList = new ArrayList<>();
        String resultStr;
        for(int i=1;i<=max;i++){
           resultStr = getWord(3,i,"Fizz")+getWord(5,i,"Buzz");
            if(resultStr.equals("")){
                resultStr = String.valueOf(i);
            }
            returnList.add(resultStr);
        }
        return returnList;
    }

    public String getWord2(int divisor,int val,String word){
        return val % divisor == 0 ? word :"";
    }


    public String getWord(int divisor,int value,String word){
        return value % divisor == 0 ? word : "";
    }



    public static void main(String[] args){

        Fizzbuzz f = new Fizzbuzz();
       // f.fizzBuzz();
        f.fizzBuzzgeAlternative();
    }
}
