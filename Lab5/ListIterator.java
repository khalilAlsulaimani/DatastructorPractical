/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author alsul
 */
public class ListIterator <T>{

    private Node current;          // current link
    private Node previous;         // previous link
    private LinkList ourList;      // our linked list
//--------------------------------------------------------------

    public ListIterator(LinkList list) {// constructor
        ourList = list;
        reset();
    }
//--------------------------------------------------------------

    public void reset() {          // start at 'first'
        current = ourList.getFirst();
        previous = null;
    }
//--------------------------------------------------------------

    public boolean atEnd() // true if last link
    {
        return (current.getNext() == null);
    }
//--------------------------------------------------------------

    public void nextLink() {        // go to next link
        previous = current;
        current.setNext(current.getNext());
    }
//--------------------------------------------------------------

    public Node getCurrent() // get current link
    {
        return current;
    }
//--------------------------------------------------------------

    public void insertAfter(T dd) // insert after
    {                                 // current link
        Node newLink = new Node(dd);

        if (ourList.isEmpty()) // empty list
        {
            ourList.setFirst(newLink);
            current = newLink;
        } else // not empty
        {
            newLink.setNext( current.getNext());
            current.setNext(newLink);
            nextLink();              // point to new link
        }
    }
//--------------------------------------------------------------

    public void insertBefore(T dd) // insert before
    {                                 // current link
        Node newLink = new Node(dd);

        if (previous == null) // beginning of list
        {                        // (or empty list)
            newLink.setNext(ourList.getFirst());
            ourList.setFirst(newLink);
            reset();
        } else // not beginning
        {
            newLink.setNext(previous.getNext());
            previous.setNext( newLink);
            current = newLink;
        }
    }
//--------------------------------------------------------------

    public T deleteCurrent() // delete item at current
    {
        T value = (T) current.getData();
        if (previous == null) // beginning of list
        {
            ourList.setFirst(current.getNext());
            reset();
        } else // not beginning
        {
            previous.setNext(current.getNext());
            if (atEnd()) {
                reset();
            } else {
                current.setNext(current.getNext());
            }
        }
        return value;
    }
//--------------------------------------------------------------
}  // end class ListIterator


