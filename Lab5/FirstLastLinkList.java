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
        // if element is to be inserted at end of listpp

        Node current = first;// teno node to get to the needed node 

        Node temp = new Node(e);// new node temp with our new object parameter  

        if (index > length || index < 0) {// if index out of bounds enter
            throw new IndexOutOfBoundsException("invalid index ");
        }

        if (index == 0 && length == 0) {// if first element set tail and first with e 
            temp.setNext(first);// point to first 
            first = temp;// set first tp temp
            tail = temp;// set tail to temp

        } else if (index == length) {// if it is the last place set only tail
            tail.setNext(temp);// set tail to point to temp
            tail = temp;// change tail to temp
        }

        length++;// incremnet length

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

        Node current = first;// set to first node to triverse the list
        int count = 0;

        if (index > length || index < 0) {
            throw new IndexOutOfBoundsException("invalid index");
        }

        if (index == length - 1) {//if last element use the tail
            Node prev= tail.getPrev();
            tail=prev;
            tail.setNext(null);
            

        } else if (index == 0) {// delete first element
            Node tempF = first;          // save reference to link
            first = first.getNext();         // delete it: first-->old next
            tempF.setNext(null);

        } else {
            Node prev = first;
            
            while (current != null) {
                if (count==index) {
                    prev.setNext(current.getNext());
                    current.setNext(null);
                   
                }
                prev = current;
                current = current.getNext();
                count++;
            }

            length--; // decremnent length
        }
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
        
        int count=0;
        if (index > length || index < 0) {
            throw new IndexOutOfBoundsException("invalid index");
        }
        
        if(index==length-1){
            tail.setData(e);
        }else if(index ==0){
            first.setData(e);
        }else{
            Node current=first;
            while(current!=null && count<=index){
                current=current.getNext();
                count++;
            }
            current.setData(e);
        }
        
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
