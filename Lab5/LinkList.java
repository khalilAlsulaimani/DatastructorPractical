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

    protected Node first;            // ref to first item on list
    protected int length = 0;

    public Node getFirst() { // get value of first

        return first;
    }

    public void setFirst(Node f) { // set first to new link

        first = f;
        length++;
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
        length++;
    }

    public void insertLast(T dd) {// insert at start of list
        Node newLink = new Node(dd);                            // make new link
        Node current = first;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        length++;
    }// end insertLast

    public T deleteFirst() {      // delete first item (assumes list not empty)
        Node temp = first;          // save reference to link
        first = first.getNext();         // delete it: first-->old next
        temp.setNext(null);
        length--;
        return (T) temp.getData();          // return deleted link
    }

    // -------------------------------------------------------------
    public ListIterator getIterator() { // return iterator
        return new ListIterator(this);  // initialized with
    }                               //    this list
// -------------------------------------------------------------

    public void display() {
        Node current = first;       // start at beginning of list
        while (current != null) {     // until end of list,
            current.display();   // print data
            current = current.getNext();  // move to next link
        }
        System.out.println("");
    }
// -------------------------------------------------------------

    public Node find(T key) {
        Node current = first;
        while (current != null) {
            if (current.getData().equals(key)) {
                return current;
            }//if
            current = current.getNext();
        }// while
        return null;
    }

    public Node delete(T key) {
        Node prev = first;
        Node current = first;
        while (current != null) {
            if (current.getData().equals(key)) {
                prev.setNext(current.getNext());
                current.setNext(null);
                return current;
            }//if
            prev = current;
            current = current.getNext();

        }// while
        length--;
        return null;
    }

    public Node deleteLast() {
        Node current = first;
        Node prev = first;
        Node temp = null;
        while (current.getNext() != null) {
            prev = current;
            current=current.getNext();
        }// end while
        temp = current;
        prev.setNext(null);
        length--;
        return temp;
    }// end deleteLast
    
    public int length(){
        return length;
    }
    
    
    public Object retrieve(int index) throws IndexOutOfBoundsException {
        // provide implementation of retrieve which can utilise tail
        // if element is to be retrieved from end of list
        int count = 0;

        if (index > length || index < 0) {
            throw new IndexOutOfBoundsException("invalid index");
        }

        if (index == 0) {

            return first;
        } 
        
        Node current = first;
        while (current != null && count <= index) {
            current = current.getNext();
            count++;
        }
        return current.getData();

    }

// -------------------------------------------------------------

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
            

        } else {
            
        }

        length++;// incremnet length

    }
}  // end class LinkList
