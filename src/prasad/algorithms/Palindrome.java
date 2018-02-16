package prasad.algorithms;

/**
 * Created by pputta on 1/27/18.
 */
public class Palindrome {

static boolean checkPalindrome(String str){
    return (str.equals(reverse(str)));

}


static String reverse(String str){

    if(str.length()==1){
        return str;
    }
    return reverse(str.substring(1)) + str.charAt(0);

}

    public static void main(String[] args) {
        System.out.println(checkPalindrome("hello"));

    }

}
