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

    private Node first;            // ref to first item on list
    
//--------------------------------------------------------------

    public LinkedStack() {         // constructor
        first = null;
    }
//--------------------------------------------------------------

    public void push(T j) {// put item on top of stack
        Node newLink = new Node(j);                           // make new link
        newLink.setNext(first);       // newLink --> old first
        first = newLink;            // first --> newLink
        
    }
//--------------------------------------------------------------

    public T pop() throws EmptyStackException {// take item from top of stack
        
        if (isEmpty()) {// enter if stack is empty
            throw new EmptyStackException();// throw exepeption if stack is empty and someone wants to pop a item
        }
        
        Node current =first;
        Node temp=first;
        while(current.getNext()!= null){
            current.setNext(current.getNext());
        }
        temp.setNext(current);
        current.setNext(null);
        return (T) temp.getData();
        
    }
//--------------------------------------------------------------

    public T peek() {         // peek at top of stack
        Node current=first;
        while(current.getNext()!=null){
            current.setNext(current.getNext());
        }
        return (T) current.getData();
    }
//--------------------------------------------------------------

    public boolean isEmpty() {    // true if stack is empty
       return (first==null);
    }
//--------------------------------------------------------------

    

///////////////////////////////////////////////////////////////
}
