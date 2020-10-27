/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author alsul
 */
public class HighArrayAppSorting {
    public static void main(String[] args){
        HighArray arr = new HighArray(100);
        arr.insert(1);
        arr.insert(10);
        arr.insert(129);
        arr.insert(0);
        arr.insert(89);
        arr.insert(98);
        
        arr.display();
        //arr.bubbleSort();
        //arr.selectionSort();
        arr.insertionSort();
        arr.display();
        
        
    }
    
}
