/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author alsul
 */
public class StackApp {

    public static void main(String[] args) {
        StackArray theStack = new StackArray(Long.class, 3);  // make new stack
        theStack.push(new Long(20));               // push items onto stack
        theStack.push(new Long(40));
        theStack.push(new Long(60));
        theStack.push(new Long(80));
        
        try {
            while (!theStack.isEmpty()) {     // until it's empty,
                long value = (long) theStack.pop(); // delete item from stack                                      
                System.out.print(value);      // display it
                System.out.print(" ");
            }  // end while
        } catch (Exception e) {
            System.out.println("invalid pop stack is empty ");
        }
        System.out.println("");
    }  // end main()
}  // end class StackApp
////////////////////////////////////////////////////////////////

