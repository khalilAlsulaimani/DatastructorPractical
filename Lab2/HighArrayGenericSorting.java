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
public class HighArrayGenericSorting {

    public static void main(String[] args) {
        int maxsize = 30;
        HighArrayGeneric arr;
        arr = new HighArrayGeneric(Long.class, maxsize);

        arr.insert(new Long(10));
        arr.insert(new Long(9));
        arr.insert(new Long(90));
        arr.insert(new Long(80));
        arr.insert(new Long(70));
        arr.insert(new Long(19));
        
        arr.display();
        //arr.bubbleSort();
        //arr.selectionSort();
        arr.insertionSort();
        
        arr.display();

    }

}
