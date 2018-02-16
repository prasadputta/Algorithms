package prasad.algorithms;

/**
 * Created by 153608 on 6/1/2017.
 */
public class RecursionPractice {

        public static String reverseString(String inputStr) {
            //Requirements: reverse the input string by using recursion.
            if(inputStr.length()==0) {
                return inputStr;
            }
                return reverseString(inputStr.substring(1))+inputStr.charAt(0);

        }

    static String r2(String r){
        //terminal
        if(r == null || r.length()==1){
            return r;
        }
        return r2(r.substring(1))+ r.charAt(0);

    }

    public static String reverse3(String input){

        if(input==null || input.length()==1){
            return input;
        }
        //abc --> c ab --> cb a --> cba
        //return input.charAt(input.length()-1)+reverse3(input.substring(0,input.length()-1));

        //abc --> bc a --> c ba--> cba
        return reverse3(input.substring(1))+input.charAt(0);

    }


    public static void main(String[] args) {
        System.out.println(reverse3("Hello myworld!"));

    }

    }



