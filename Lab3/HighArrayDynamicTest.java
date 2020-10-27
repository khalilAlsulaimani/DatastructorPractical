/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author alsul
 */
public class HighArrayDynamicTest {
    
   public static void main(String[] args)
   {
      HighArrayDynamic ae = new HighArrayDynamic(40);
      System.out.println(ae);
      ae.add(5);
      ae.add(8);
      System.out.println(ae);
      ae.add(2);
      ae.add(7);  
      ae.add(6);
      ae.add(13);
      ae.add(20);
      ae.add(25);  
      System.out.println(ae);
      ae.add(88);
      System.out.println(ae);
      ae.delete(88);// deleted element
      System.out.println(ae);
      System.out.println(ae.capacity());
      ae.delete(1000);// deleted elemtn that dosnt exist
      ae.compact();// compating after deletion of element
      System.out.println(ae);
      System.out.println(ae.capacity());

      
   }
}

    
