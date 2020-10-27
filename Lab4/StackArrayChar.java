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
public class StackArrayChar {
    private int capacity;        // size of stack array
    private char[] a;
    private int nElems;              // top of stack
//--------------------------------------------------------------

    public StackArrayChar(int s) {         // constructor
        capacity = s;             // set array size
        a = new char[capacity];  // create array
        nElems = 0;                // no items yet
    }
//--------------------------------------------------------------

    public void push(char j) {    // put item on top of stack
        a[nElems] = j;     // increment top, insert item
        nElems++;
    }
//--------------------------------------------------------------

    public char pop() {         // take item from top of stack
        int top = nElems - 1;
        char temp = a[top];
        nElems--;
        return temp;  // access item, decrement top
    }
//--------------------------------------------------------------

    public char peek() {         // peek at top of stack
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


    
