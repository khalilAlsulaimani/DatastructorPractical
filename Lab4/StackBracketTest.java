/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Implement a Symbol Balancer. Which tests and expression containing brackets
 * [](){} and determines if brackets are balanced. Implementation uses a
 * StackArray.
 *
 * @version 1.0 08
 * @author
 */
public class StackBracketTest {

    private String input;

    /**
     * Default Constructor
     *
     */
    public StackBracketTest() {
        input = null;
    }

    /**
     * Alternate Constructor Sets Expression to be evaluated
     *
     * @param in string containing expression to be balanced
     */
    public StackBracketTest(String in) {
        // complete this constructor
        input = in;
    }

    /**
     * Set string containing expression to be evaluated
     *
     * @param in string containing expression to be balanced
     */
    public void setExpression(String in) {
        input = in;
    }

    /**
     * Evaluate expression and determine correctness
     *
     */
    public void check() {
        int stackSize = input.length();
        StackArray theStack = new StackArray(Character.class, stackSize);

        outerLoop:
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);

            // complete the following switch statement. 
            switch (ch) {
                // if char is an opening bracket i.e. [({ then push onto stack 
                case ('{'):
                case ('('):
                case ('['):

                    theStack.push(ch);// push to the stack
                    break;
                // if char is a closing bracket i.e. ])} then remove top 
                case ('}'):
                case (')'):
                case (']'):

                    if (!theStack.isEmpty()) {// element off stack (checking that stack is not empty) 
                        char test = (char) theStack.pop();//pop and save element to compre to

                        if ((ch == '}' && test != '{') || (ch == ']' && test != '[') || (ch == ')' && test != '(')) {// and check that it is not matching opening bracket for {
                            System.out.println("Error: " + ch + " at " + j);// print to the user that the breackts are wrong at postion j
                        }
                    } else {// if it is emoty from the start
                        System.out.println("Error: " + ch + " at " + j);
                        break;
                    }

                default:// if no breaks exist
                    break;
            }

            // Test that the stack is empty. If not the expression is invalid
        }
        if (!theStack.isEmpty()) {
            System.out.println("Error: missing right delimiter");
        }

    }

    /**
     * This main method implements a little interactive test program which when
     * executed repeatedly prompts the user for an expression and tests the
     * expression.
     *
     * @param args
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        // Declare a variable of type StackBracketTest and create
        String input = null;
         StackBracketTest test = new StackBracketTest();

        // and assign to it and instance of StackBracketTest class. 
        // Which would be the most appropriate constructor to use here?
        // note this is a do while loop which is different to a while
        // loop in that it will always execute at least once. 
        // Can you determine what condition causes the loop to terminate? 
        do {
            System.out.print("Enter string containing delimiters: ");
            input = scan.nextLine();
       
            // can you determine what this if statement is doing?  
            if (!input.equals("")) {
                test.setExpression(input);
                test.check();
            }
            // pass the string to the StackBracketTest object created
            // above using the most appropriate method.
            // Call the StackBracketTest check method.
            // Test result of check method and display result in form of
            // a message to the user e.g. “This statement is valid” 
        } while (!input.equals(""));
    }
}
