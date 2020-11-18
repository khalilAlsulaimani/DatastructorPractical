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
public class LinkList2App {

    public static void main(String[] args) {
        LinkList theList = new LinkList();  // make list

        theList.insertFirst(22);      // insert 4 items
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);
        theList.display();              // display list

        Node f = theList.find(88);          // find item
        if (f != null) {
            System.out.println("Found link with key " + f.getData());
        } else {
            System.out.println("Can't find link");
        }

        Node d = theList.delete(66);        // delete item
        if (d != null) {
            System.out.println("Deleted link with key " + d.getData());
        } else {
            System.out.println("Can't delete link");
        }

        theList.display();              // display list
        theList.deleteLast();
        theList.display();
        theList.deleteFirst();
        theList.display();
        theList.insertLast(33);
        theList.display();
        theList.insertLast(80);
        theList.display();

        LinkList theList2 = new LinkList();

        theList2.insertFirst("one");      // insert 4 items
        theList2.insertFirst("string");
        theList2.insertFirst("names");
        theList2.insertFirst("hello ");
        theList2.display();              // display list
        
    }  // end main()
}  // end class LinkList2App
////////////////////////////////////////////////////////////////

