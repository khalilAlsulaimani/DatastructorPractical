/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 * LinkList Processing Class. These methods are declared as static. They are
 * general purpose List processing methods which are not list instance specific.
 *
 *
 */
public class ListOps {

    /**
     * Return new List Which is formed by Intersection of Two specified list
     * parameters (i.e. elements common to both lists)
     *
     * @param a LinkList
     * @param b LinkList
     * @return a new LinkedList formed by Intersection
     */
    public static LinkList intersection(LinkList a, LinkList b) {
        // Use implementation of this method as a guide for 
        //implementation of remaining methods

        // So firstly declare output list
        LinkList u = new LinkList();
        ListIterator itra = new ListIterator(a);

       
        // Then iterate through list elements.
        Node av = itra.getCurrent();

        for (int i = 0; i < a.length(); i++) {
            // retrieve element at position i in list a using retrieve(i)
            // method and check if it can be located in list b using
            // indexOf(Object) method which tests if object is in list b
            if (b.indexOf(av.getData()) != -1) {
                // insert object into output list u at position 0
                //Object t = a.retrieve(i);
                u.insertFirst(av.getData());
                
            }

            av = av.getNext();

        }
        return u;
    }

    /**
     * Return new LinkList formed by Union of two Lists specified as Parameters
     * (i.e. elements in both lists but not duplicated)
     *
     * @param a LinkList
     * @param b LinkList
     * @return new LinkList formed by Union
     */
    public static LinkList union(LinkList a, LinkList b) {
        // union is set of elements in a and b but not duplicated
        LinkList temp = new LinkList();// store union values in 

        ListIterator itra = new ListIterator(a);// iterator for list a
        ListIterator itrb = new ListIterator(b);// itrator for list b

       
        
        Node av = itra.getCurrent();// save first node of a in av
        Node bv = itrb.getCurrent();// save first node of b in bv

        for (int i = 0; i < a.length(); i++) {
           

            if (b.indexOf(av.getData()) != -1) {// if elements are the same in both lists enter and save one 
                // insert object into output list u at position 0
                temp.insertFirst(av.getData());

            } else {// if diffrent save both
                temp.insertFirst(av.getData());

                temp.insertFirst(bv.getData());

            }
            av =av.getNext();// go to next node of a 
            bv= bv.getNext(); // go to next node of b

        }

        return temp;
    }

    /**
     * Return new List Which is formed by difference of two specified list
     * parameters (i.e. elements not common to both lists)
     *
     * @param a LinkList
     * @param b LinkList
     * @return new LinkList formed by complement
     */
    public static LinkList difference(LinkList a, LinkList b) {
        // set of elements not common to a and b

        LinkList temp = new LinkList();
     
        ListIterator itra = new ListIterator(a);
        ListIterator itrb = new ListIterator(b);
        
        
        Node av=itra.getCurrent();
        Node bv=itrb.getCurrent();
        // Then iterate through list elements.	
        for (int i = 0; i < a.length(); i++) {

            if (b.indexOf(av.getData()) == -1) {
                // insert object into output list u at position 0
                temp.insertFirst(av.getData());

                temp.insertFirst(bv.getData());
              
            }
            
            av=av.getNext();
            bv=bv.getNext();
        }
        return temp;
    }
}
