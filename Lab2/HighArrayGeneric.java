/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author alsul
 * @param <T>
 */
import java.lang.reflect.Array;

/**
 *
 * @author alsul
 * @param <T>
 */
public class HighArrayGeneric<T extends Comparable<T>> {

    private final T[] a;                 // ref to array a
    private int nElems;               // number of data items
    //-----------------------------------------------------------

    public HighArrayGeneric(Class<T> c, int max) // constructor
    {
        this.a = (T[]) Array.newInstance(c, max);    // create the array
        nElems = 0;                        // no items yet
    }

    //-----------------------------------------------------------
    public boolean find(T searchKey) {                              // find specified value
        int j;
        for (j = 0; j < nElems; j++) // for each element,
        {
            if (a[j].equals(searchKey)) // found item?
            {
                break;                       // exit loop before end
            }
        }
        if (j == nElems) // gone to end?
        {
            return false;                   // yes, can't find it
        } else {
            return true;                    // no, found it
        }
    }  // end find()
    //-----------------------------------------------------------

    public void insert(T value) // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }
    //-----------------------------------------------------------

    public void insertOrdered(T value) // put element into array
    {
        int j;
        for (j = 0; j < nElems; j++) // find where it goes
        {
            if (a[j].compareTo(value) == 1) // (linear search)
            {
                break;
            }
        }
        for (int k = nElems; k > j; k--) // move bigger ones up
        {
            a[k] = a[k - 1];
        }
        a[j] = value;                  // insert it
        nElems++;                      // increment size
    }  // end insert()
    //-----------------------------------------------------------

    public boolean delete(T value) {
        int j;
        for (j = 0; j < nElems; j++) // look for it
        {
            if (value.equals(a[j])) {
                break;
            }
        }
        if (j == nElems) // can't find it
        {
            return false;
        } else // found it
        {
            for (int k = j; k < nElems; k++) // move higher ones down
            {
                a[k] = a[k + 1];
            }
            nElems--;                   // decrement size
            return true;
        }
    }  // end delete()
    //-----------------------------------------------------------

    public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) // for each element,
        {
            System.out.print(a[j] + " ");  // display it
        }
        System.out.println("");
    }
    //-----------------------------------------------------------

    public int binarySearch(T searchKey) {
        int left = 0, right = nElems - 1;

        while (left <= right) {
            int pivot = (left + right) / 2;
            if (a[pivot].equals(searchKey)) {
                return pivot;       // found
            } else {
                if (a[pivot].compareTo(searchKey) == -1) {
                    left = pivot + 1;  // search right
                } else {
                    right = pivot - 1;  // search left
                }
            }
        }
        return -1;
    }
    //------------------------------------------------------------
    /**
     * bubble sort algorithm to sort array a
     *
     */
    public void bubbleSort() {
        boolean needNextPass = true;

        for (int k = 1; k < nElems && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < nElems - k; i++) {
                if (a[i].compareTo(  a[i + 1])==1) {
                    // Swap list[i] with list[i + 1]
                    T temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }
    
    //----------------------------------------------------------------\
     /**
     * insertionSort algorithm to sort array a
     *
     */
    public void insertionSort() {
        for (int i = 1; i < nElems; i++) {
            /**
             * insert list[i] into a sorted sublist list[0..i-1] so that
             * list[0..i] is sorted.
             */
            T currentElement = a[i];
            int k;
            for (k = i - 1; k >= 0 && a[k].compareTo(currentElement)==1; k--) {
                a[k + 1] = a[k];
            }

            // Insert the current element into list[k+1]
            a[k + 1] = currentElement;
        }
    }
    //--------------------------------------------------------------------
    /**
     * selectionSort algorithm to sort array a
     *
     */

    public void selectionSort() {
        for (int i = 0; i < nElems - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            T currentMin = a[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < nElems; j++) {
                if (currentMin.compareTo( a[j])==1) {
                    currentMin = a[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                a[currentMinIndex] = a[i];
                a[i] = currentMin;
            }
        }
    }
    //--------------------------------------------------------------------
    
    public int size() {
        return nElems;
    }

    public int compareTo(T t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return this.compareTo(t);    }
}  // end class HighArray


///////////////////////////////////////////////////////////////‎Thank you for your business! We look forward to working with you again.
