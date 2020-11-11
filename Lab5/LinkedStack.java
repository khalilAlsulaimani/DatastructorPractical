/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.EmptyStackException;

/**
 *
 * @author alsul
 */
public class LinkedStack<T> {
    int length; // indicates length of the list
    Node top;    // refernces top of stack
    
    
//--------------------------------------------------------------

    public LinkedStack() {         // constructor
       length=0;
       top=null;
    }
//--------------------------------------------------------------

    public void push(T j) {// put item on top of stack
        Node temp = new Node(j);    // making a new node ans stroting the new value inisde it
        temp.setNext(top);          // making the new nodes next the top node
        top=temp;                   // moving node top to the top of the stack
        length++;                   // increasing 
        
    }
//--------------------------------------------------------------

    public T pop() throws EmptyStackException {// take item from top of stack
        
        if (isEmpty()) {// enter if stack is empty
            throw new EmptyStackException();// throw exepeption if stack is empty and someone wants to pop a item
        }
        T value = (T) top.getData();    // storing value of the top of stack 
        top=top.getNext();              // changing pointer 
        length--;                       // making the stack smaller
       
        return value;                   // returning value
    }
//--------------------------------------------------------------

    public T peek() {         // peek at top of stack
        return (T) top.getData();// returning peek of top element 
    }
//--------------------------------------------------------------

    public boolean isEmpty() {    // true if stack is empty
       return (length==0);
    }
    
    public int getLength(){
        return length;
    }
//--------------------------------------------------------------

    

///////////////////////////////////////////////////////////////
}
