/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author alsul
 * @param <T>
 */
public class LinkList<T> {

    private Node first;            // ref to first item on list

    public Node getFirst() { // get value of first

        return first;
    }

    public void setFirst(Node f) { // set first to new link

        first = f;
    }

    public LinkList() { // constructor

        first = null;
    }           // no items on list yet

    public boolean isEmpty() { // true if list is empty

        return (first == null);
    }

    public void insertFirst(T dd) { // insert at start of list
        Node newLink = new Node(dd);                           // make new link
        newLink.setNext(first);       // newLink --> old first
        first = newLink;            // first --> newLink
    }

    public void insertLast(T dd) {// insert at start of list
        Node newLink = new Node(dd);                            // make new link
        Node current = first;
        while (current.getNext() != null) {
            current = current.getNext();
        }
    }// end insertLast

    public T deleteFirst() {      // delete first item (assumes list not empty)
        Node temp = first;          // save reference to link
        first = first.getNext();         // delete it: first-->old next
        temp.setNext(null);
        return (T) temp.getData();          // return deleted link
    }

    // -------------------------------------------------------------
    public ListIterator getIterator() { // return iterator
        return new ListIterator(this);  // initialized with
    }                               //    this list
// -------------------------------------------------------------

    public void displayList() {
        Node current = first;       // start at beginning of list
        while (current != null) {     // until end of list,
            current.displayLink();   // print data
            current = current.getNext();  // move to next link
        }
        System.out.println("");
    }
// -------------------------------------------------------------

    public Node find(int key) {
        Node current = first;
        while (current != null) {
            if (current.getData().equals(key)) {
                return current;
            }//if
            current = current.getNext();
        }// while
        return null;
    }

    public Node delete(int key) {
        Node prev = first;
        Node current = first;
        while (current != null) {
            if (current.getData().equals(key)) {
                prev.setNext(current.getNext());
                current.setNext( null);
                return current;
            }//if
            prev = current;
            current = current.getNext();

        }// while
        return null;
    }

    public Node deleteLast() {
        Node current = first;
        Node prev = first;
        Node temp = null;
        while (current.getNext() != null) {
            prev = current;
            current.setNext(current.getNext());
        }// end while
        temp = current;
        prev.setNext(null);
        return temp;
    }// end deleteLast
// -------------------------------------------------------------
}  // end class LinkList

