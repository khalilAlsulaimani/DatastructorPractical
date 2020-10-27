/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author alsul
 */
public class HighArray {

    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    //-----------------------------------------------------------

    public HighArray(int max) // constructor
    {
        a = new long[max];                 // create the array
        nElems = 0;                        // no items yet
    }

    public boolean checkIfInBound(int index) {
        boolean bool = false;// defult value is faluse
        if (index > 0 && index < nElems) {// if the index is within array bound change its value
            bool = true;
        }// no need for else as if it is out of bounds value wont change

        return bool;

    }
    //-----------------------------------------------------------

    public boolean find(long searchKey) { // find specified value
        int j;
        for (j = 0; j < nElems; j++) // for each element,
        {
            if (a[j] == searchKey) // found item?
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

    /**
     * find an element from array and returns its index if found otherwise
     * returns -1 .
     *
     * @param foundElement Element to be found
     */
    public int findAll(int foundElement) {
        int elemntCount = 0;// to store all element occurnces 

        int returnValue = 0;// will return -1 if no occurnces are found 
        // will be updated to the number of occunces if they are found 

        for (int i = 0; i < a.length; i++) {// look through the whole array to find all the occurnces if they exist
            if (a[i] == foundElement) {// test if index i is the given element we are looking for
                returnValue++;
            }
        }
        if (returnValue == 0) {// if no elemrnts are found returnValue wont change meaning given element dosnt exist in the array
            returnValue = -1;
        }

        return returnValue;
    }

    /**
     * Delete all element occurrences from array if found otherwise do nothing.
     *
     * @param deletedElement Element to delete
     */
    public void deleteAll(int deletedElement) {
        int j;
        long[] IndexOfElement = new long[nElems];// to store all the indexs deletedElement is at 
        int count = 0;// where to store in the IndexOfElement and will increamnt every time we find a match
        int delCount = 0;
        for (j = 0; j < nElems; j++) {    // look for it
            if (deletedElement != a[j]) { // find all other elemnts other then  deletedElement it
                IndexOfElement[count] = a[j];// store index of the delented element
                count++;
            } else {
                delCount++;
            }
        }
        for (int i = 0; i < count; i++) {
            a[i] = IndexOfElement[i];// storeing the values after deletion  in a
            //System.out.println(a[i]);// for testing
        }
        for (int i = 0; i < delCount; i++) {
            nElems--;// decrese size
        }

    }

    /**
     * looks through array to find the biggest value
     *
     * @Returns the maximum value in a
     */
    public long max() {
        long max = 0;// to store the currnet max 
        for (int i = 0; i < nElems; i++) {// look thorugh eatch index
            if (a[i] > max) {// if its bigger then max go into if
                max = a[i];// change max to the new biggest value
            }
        }
        return max;
    }

    /**
     * Returns the index of the maximum value
     *
     * @Returns the maximum index value in a
     */
    public int maxIndex() {
        long max = 0;// to store the currnet max 
        int maxIndex = 0;// to store the index of the max value
        for (int i = 0; i < nElems; i++) {// look thorugh eatch index
            if (a[i] > max) {// if its bigger then max go into if
                max = a[i];// change max to the new biggest value
                maxIndex = i;// changes maxIndex to the index of the loop where the biggest value is
            }
        }
        return maxIndex;
    }

    /**
     * Returns the index of the minimum value
     *
     * @return the min value in a
     */
    public long min() {
        long min = a[0];// to store the first value
        for (int i = 0; i < nElems; i++) {// look thorugh eatch index
            if (a[i] < min) {// if its smaller then min go into if
                min = a[i];// change min to the new smallest value 
            }
        }
        return min;
    }

    /**
     * Returns the index of the minimum index value
     *
     * @return the min value index in a
     *
     */
    public int minIndex() {
        int minIndex = 0;// to store the index of the min value
        for (int i = 0; i < nElems; i++) {
            if (a[i] == min()) {// if a[i] is the nunmber min() returns enter 
                minIndex = i;// saving the smallest number index
            }
        }
        return minIndex;
    }

    /**
     * Calculates the range (max-min)
     *
     * @return range
     */
    public long range() {
        long range = 0;
        range = max() - min();// get range
        return range;
    }

    /**
     * Calculates the sum of elements of a
     *
     * @return sum
     */
    public long sum() {
        long sum = 0;
        for (int i = 0; i < nElems; i++) {//go through array and add the values up
            sum += a[i];
        }
        return sum;
    }

    /**
     * Calculates the average of a
     *
     * @return avg
     */
    public double avg() {
        double avg = 0;
        avg = sum() / nElems;// the sum devied by the length of the array

        return avg;
    }

    /**
     * Calculates the standard deviation of a
     *
     * @return std
     */
    public double std() {
        double std = 0;
        double mean = avg();
        for (int i = 0; i < nElems; i++) {
            std += Math.pow(a[i] - mean, 2);
        }
        std = Math.sqrt(std / nElems);
        return std;
    }

    /**
     * Return the ith largest element of a
     *
     * @param i
     * @return rank
     *
     */
    public long rank(int i) {
        long rank = 0;
        long[] sortedArray = a;// save a in a new arry to not effect orginal
        Arrays.sort(sortedArray, 0, nElems);// sort the array from 0 to the start of the array so the array isnt just zeros for the empty places
        if (nElems > 0) {
            rank = sortedArray[nElems - i];
        } else {
            return -1;
        }
        return rank;

    }

    /**
     * Returns true if a is ordered otherwise returns false
     *
     * @return bool
     */
    public boolean checkOrdered() {
        boolean bool = false;// return if a is sorted or not
        long[] sortedArray;//moving a to the sorted array
        sortedArray = a;
        Arrays.sort(sortedArray, 0, size());// new array of a thats sorted to test if a is sorted 
        for (int i = 0; i < size(); i++) {// look trough array

            if (sortedArray[i] != a[i]) {// if one elemnt isnt the same make bool false and break out of loop
                bool = false;
                break;
            } else {// test if it is in the same order as the sorted array
                bool = true;
            }
        }
        return bool;
    }

    /**
     * Returns true if a has unique elements
     *
     * @return bool
     */
    public boolean checkUnique() {
        boolean bool = true;
        long current;// to store current value to compare to all the loop
        for (int i = 0; i < nElems; i++) {// look through array
            current = a[i];// take a elemrnt to compre to all the array elemnts 
            for (int j = 0; j < nElems; j++) {
                if (i == j) {// if we reach the same elemnt we are tesing skip
                    continue;
                }
                if (current != a[j]) {// test if there diffrent if yes skip
                    continue;
                } else {// if there the same change bool to false 
                    bool = false;
                    break;
                }
            }
        }
        return bool;
    }

    /**
     * Removes duplicates from a
     *
     */
    public void removeDuplicates() {
        long[] temp = new long[nElems];// to store the uniqe values
        if (checkOrdered() == false) {// if array not sorted sort it
            Arrays.sort(a);
        }
        int count = 0;
        if (checkOrdered()) {// if it is sorted 
            for (int i = 0; i < nElems; i++) {
                if (a[i] != a[i + 1]) {// if the next value is the same store its 
                    temp[count] = a[i];
                    count++;

                }
            }
            //System.out.println(Arrays.toString(temp)+" "+count);// to test what will e stored in the array

            for (int i = 0; i < count; i++) {
                a[i] = temp[i];// storeing the uniqe values in a
                if (nElems != count) {//if the array isnt fully uniqe reduce size
                    nElems--;// removing the repated values
                }
                //System.out.println(a[i]);
            }
        }
    }

    /**
     * Fills a with Random numbers
     *
     *
     */
    public void fillArrayRandom() {
        for (int i = nElems + 1; i < a.length; i++) {// from the last elemntt start right after it 
            a[i] = (long) (Math.random() * 100);// fill a till its full with random numbers from 0 too 99
            nElems++;// incease size of array counter 
        }
    }

    //------------------------------------------------------------
    /**
     * shifts array a left x amount thats given
     *
     * @param indexOfShift
     */
    public void shiftLeft(int indexOfShift) {

        if (indexOfShift < nElems && indexOfShift > 0) {// if the shift is asked of a place in the array enter
            for (int i = indexOfShift; i < nElems; i++) {
                a[i] = a[i + 1];// shifting things to the lefts 
            }
            nElems--;// reduce geh size after deleting one element
        } else {// if out of array print this
            System.out.println("invalid shift index out of bounds");
        }
    }

    /**
     * shifts array a right x amount thats given
     *
     * @param indexOfShift
     */
    public void shiftRight(int indexOfShift) {
        if (checkIfInBound(indexOfShift)) {
            nElems++;// increasing size of the array to fit the shift
            for (int i = nElems - 1; i > indexOfShift; i--) {// starting from the end and moving elemnst to the right
                a[i] = a[i - 1];// to not lose any elements
            }
            a[indexOfShift] = 0;// changing the open space to 0
        } else {
            System.out.println("index out of bound");
        }
    }

    /**
     * inserts a value at a given index of the array
     *
     * @param value what value to add
     * @param index where to add it
     *
     */
    public void insertAt(long value, int index) {
        if (checkIfInBound(index)) {
            shiftRight(index);// move elements right to insert new value
            a[index] = value;// insering the new value in the new open space
        } else {
            System.out.println("index out of bound");
        }
    }

    /**
     * deletes the element at a certin index and shifts array to the left
     *
     * @param index of where to delete
     */
    public void deleteAt(int index) {
        if (checkIfInBound(index)) {
            shiftLeft(index);// shift elements left to delete this value
        } else {
            System.out.println("index out of bound");
        }
    }

    //-----------------------------------------------------------
    public void insert(long value) {  // put element into array

        a[nElems] = value;             // insert it
        nElems++;                      // increment size

    }

    /**
     * Read integers into array from named file. First element in file is a
     * count of number of integers contained in the file.
     *
     * @param fileName name of file containing integer data
     */
    void readLongFile(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));// readig passed file name
        long[] arr = new long[input.nextInt()];// using the first number to declare size of arrar
        int i = 0;
        while (input.hasNext()) {// if input has a next value enter 
            arr[i] = input.nextLong();// stroting next elemtnts in arr
            i++;// incremenint i 
        }
        nElems = i;// storing size of arr
        // printing array elments
        System.out.println("Array Contents");
        for (i = 0; i < nElems; i++) {
            System.out.println(i + "\t" + arr[i]);
        }
    }
    //-----------------------------------------------------------

    public void insertOrdered(long value) // put element into array
    {
        //double start=System.nanoTime();
        int j;
        for (j = 0; j < nElems; j++) // find where it goes
        {
            if (a[j] > value) // (linear search)
            {
                break;
            }
        }
        for (int k = nElems; k > j; k--) // move bigger ones up
        {
            a[k] = a[k = 1];
        }
        a[j] = value;                  // insert it
        nElems++;                      // increment size

        //double end = System.nanoTime();
        // System.out.println(end-start);
    }  // end insert()
    //-----------------------------------------------------------

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) {        // look for it
            if (value == a[j]) {
                break;
            }
        }
        if (j == nElems) {                  // can't find it
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

    public int binarySearch(int searchKey) {
        int left = 0, right = nElems - 1;

        while (left <= right) {
            int pivot = (left + right) / 2;
            System.out.println("left " + left + " right " + right + " pivot " + pivot);
            if (a[pivot] == searchKey) {
                return pivot;       // found
            } else {
                if (a[pivot] < searchKey) {
                    left = pivot + 1;  // search right
                } else {
                    right = pivot - 1;  // search left
                }
            }
        }
        return -1;
    }

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
                if (a[i] > a[i + 1]) {
                    // Swap list[i] with list[i + 1]
                    long temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }

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
            long currentElement = a[i];
            int k;
            for (k = i - 1; k >= 0 && a[k] > currentElement; k--) {
                a[k + 1] = a[k];
            }

            // Insert the current element into list[k+1]
            a[k + 1] = currentElement;
        }
    }
     /**
     * selectionSort algorithm to sort array a
     *
     */

    public void selectionSort() {
        for (int i = 0; i < nElems - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            long currentMin = a[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < nElems; j++) {
                if (currentMin > a[j]) {
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

    public int size() {
        return nElems;
    }

}  // end class HighArray    
