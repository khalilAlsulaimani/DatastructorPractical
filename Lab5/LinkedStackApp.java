/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author alsul
 */
public class LinkedStackApp {
    public static void main(String[] args){
        LinkedStack stack= new LinkedStack();
        
        stack.push(9);
        System.out.println("peek "+stack.peek());
        int num=(int) stack.pop();
        System.out.println("pop "+num);
        num=(int) stack.pop();
        System.out.println("pop "+num);
        
        
    }
    
}

