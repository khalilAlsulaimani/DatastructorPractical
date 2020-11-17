/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 * @(#) FirstLastLinkedList.java
 */
import java.lang.IndexOutOfBoundsException;

/**
 * Implements a Double Ended List ADT Using a Dynamic LinkedList Implementation.
 * Being double ended means inserting, updating and retrieving elements at end
 * of list can be implemented more efficiently.
 *
 *
 */
public class FirstLastLinkList extends LinkList {

    protected Node tail;	// reference to tail node

    /**
     * Constructor to create new empty List
     *
     */
    public FirstLastLinkList() {
        // call superclass constructor and initialise tail.
        tail = null;
    }

    /**
     * Insert element at index position in list where (list is indexed from 0).
     *
     * @param index position in list
     * @param e element to insert
     * @exception IndexOutOfBoundsException if index out of bounds
     */
    public void insert(int index, Object e) throws IndexOutOfBoundsException {
        // provide implementation of insert which can utilise tail
        // if element is to be inserted at end of list
        
        int count = 0;// used to count till the index
        
        Node current = first;// teno node to get to the needed node 
        
        Node temp = new Node(e);// new node temp with our new object parameter  
        
        if (index > length) {// if index out of bounds enter
            throw new IndexOutOfBoundsException("invalid index ");
        }

        if (index == 0 && length == 0) {// if first element set tail and first with e 
            temp.setNext(first);
            first=temp;
            tail=temp;
           
        } else if (index == length) {// if it is the last place set only tail
            tail.setNext(temp);
            tail=temp;
        } 
        
        length++;

    }

    /**
     * Remove element from specified position in list. tail node no use here as
     * we need to locate the node prior to that being deleted.
     *
     * @param index position in list where item is to be removed
     * @exception IndexOutOfBoundsException thrown if index out of bounds
     */
    public void remove(int index) throws IndexOutOfBoundsException {
        // provide implementation of remove which can utilise tail
        // if element is to be removed from end of list
    }

    /**
     * update element at specified position in list with new element
     *
     * @param index position of element to update
     * @param e new element
     * @exception IndexOutOfBoundsException thrown if index out of bounds
     */
    public void update(int index, Object e) throws IndexOutOfBoundsException {
        // provide implementation of update which can utilise tail
        // if element to be updated is at end of list
    }

    /**
     * Return element at specified position in list.
     *
     * @param index postion in list
     * @return element at postion specified by index
     * @exception IndexOutOfBoundsException thrown if index out of bounds
     */
    public Object retrieve(int index) throws IndexOutOfBoundsException {
        // provide implementation of retrieve which can utilise tail
        // if element is to be retrieved from end of list
    }

}
