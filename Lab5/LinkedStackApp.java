/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.EmptyStackException;

/**
 *
 * @author alsul
 */
public class LinkedStackApp {

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        try {
            // pushing elements to the stack
            stack.push(90);
            stack.push(900);
            stack.push(908);
            stack.push(70);
            stack.push(0);
            stack.push(7);
            
            while(!stack.isEmpty()){// dispalying and popping stack values 
                int value = (int) stack.pop();
                System.out.print(value+" ");
            }
            
            System.out.println();
        } catch (EmptyStackException e) {// expetion handeler
            System.out.println("\ncannot pop empty stack");
        }

    }

}
