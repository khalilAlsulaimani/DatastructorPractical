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
public class CircularDoubleLinkedApp {
    public static void main(String[] args){
        CircularDoubleLinked list = new CircularDoubleLinked();
        
        list.insert(0, "first");
        list.insert(1,"string");
        
        String str = (String) list.retrieve(0);
        System.out.println(str);
        
        
    }
}
