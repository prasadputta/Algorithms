package prasad.algorithms;

import java.util.Stack;

/**
 * Created by pputta on 10/26/17.
 */
public class Parentheses {

    //start at the opening parenthesis
    //look at each char for a matching closing
    //for any opening parenthesis, add to stack
    //for any closing parenthesis, remove from stack (if not empty)
    //when stack is empty, you found the MATCH
    //O(n) time,O(n) space
    public int locateClosingParentheses(String inputString, int openingParenthesisLocation) {
        if (null == inputString || inputString.length() == 0 ||
                openingParenthesisLocation > inputString.length() ||
                openingParenthesisLocation < 0 ||
                inputString.charAt(openingParenthesisLocation - 1) != '(') {
            return -1;//Invalid input
        }

        Stack stack = new Stack();

        for (int i = openingParenthesisLocation; i < inputString.length(); i++) {

            char c = inputString.charAt(i);
            if (c == '(') stack.push(c);
            if (c == ')') {
                if (stack.empty()) {
                    return (i + 1);
                }
                stack.pop();
            }
        }
        return 0;//NOT FOUND

    }

    //O(n) time,O(1) space
    public int locateClosingParentheses2(String inputString, int openingParenthesisLocation) {

        if (null == inputString || inputString.length() == 0 ||
                openingParenthesisLocation > inputString.length() ||
                openingParenthesisLocation < 0 ||
                inputString.charAt(openingParenthesisLocation - 1) != '(') {
            return -1;//Invalid input
        }

        int position = openingParenthesisLocation;
        int count = 0;

        while(inputString.length() > position) {
            char inputChar = inputString.charAt(position++);
            if (inputChar == '(')
                count++;
            else if (inputChar == ')') {
                if (count == 0) return position;//found it
                count--;
            }
        }

      return 0;//NOT FOUND

    }



    public static void main(String[] args) {

        Parentheses p = new Parentheses();
        long startTime = System.currentTimeMillis();

        int i = p.locateClosingParentheses2("(123(123((123456))123)123)", 1);
//                                           12345678901234567890123456
        switch(i){
            case -1:
                System.out.println("Invalid Input!");
            case 0:
                System.out.println("Not found!");
            default:
                System.out.println("Found the closing! at " + i);
        }

        System.out.println("Time taken: "+(System.currentTimeMillis() - startTime));

    }
}
