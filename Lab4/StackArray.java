/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.lang.reflect.Array;
import java.util.EmptyStackException;

/**
 *
 * @author alsul
 */
public class StackArray< T> {

    private int capacity;        // size of stack array
    private T[] a;
    private int nElems;              // top of stack
//--------------------------------------------------------------

    public StackArray(Class<T> cl, int s) {         // constructor
        capacity = s;             // set array size
        a = (T[]) Array.newInstance(cl, capacity);  // create array
        nElems = 0;                // no items yet
    }
//--------------------------------------------------------------

    public void push(T j) {// put item on top of stack
        if (!isFull()) {// enter if stack not full
            a[nElems] = j;     // increment top, insert item
            nElems++;
        } else {
            System.out.println("stack is full cannot push " + j);// if stack full and user pushes more show messge
        }
    }
//--------------------------------------------------------------

    public T pop() throws EmptyStackException{
        // take item from top of stack
        if (isEmpty()) {// enter if stack is empty
            throw new EmptyStackException();// throw exepeption if stack is empty and someone wants to pop a item
        }
        int top = nElems - 1;
            T temp = a[top];
            nElems--;
            return temp;  // access item, decrement top
    }
//--------------------------------------------------------------

    public T peek() {         // peek at top of stack
        int top = nElems - 1;
        return a[top];
    }
//--------------------------------------------------------------

    public boolean isEmpty() {    // true if stack is empty
        if (nElems == 0) {
            return true;
        } else {
            return false;
        }
    }
//--------------------------------------------------------------

    public boolean isFull() {    // true if stack is full
        return (nElems == capacity);
    }
//--------------------------------------------------------------
}  // end class StackX
////////////////////////////////////////////////////////////////

