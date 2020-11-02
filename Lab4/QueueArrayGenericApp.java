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
public class QueueArrayGenericApp {
     public static void main(String[] args) {
        QueueArrayGeneric theQueue = new QueueArrayGeneric(Long.class,4);  // make new stack
        theQueue.enqueue(new Long(20));               // push items onto stack
        theQueue.enqueue(new Long(40));
        theQueue.enqueue(new Long(60));
        theQueue.enqueue(new Long(80));
        try{
        while (!theQueue.isEmpty()) {     // until it's empty,
            long value =(long) theQueue.dequeue(); // delete item from stack                                      
            System.out.print(value);      // display it     
            System.out.print(" ");
        }  // end while
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("");
    }  // end main()
    
}
