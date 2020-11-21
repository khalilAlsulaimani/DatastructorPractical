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
public class ListOpsApp {

    public static void main(String[] args) {
        LinkList list = new LinkList();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);

        

        LinkList list2 = new LinkList();

        list2.insertFirst(1);
        list2.insertFirst(0);
        list2.insertFirst(3);
        list2.insertFirst(4);
        list2.insertFirst(5);
        list2.insertFirst(7);
        
        

        LinkList temp = ListOps.union(list, list2);
        LinkList temp2 = ListOps.difference(list, list2);
        LinkList temp3 = ListOps.intersection(list, list2);
        
        System.out.println("list number one ");
        list.display();
        
        System.out.println("list number two ");
        list2.display();
        
        System.out.println();
        
        System.out.println("Union test ");
        temp.display();
        System.out.println("Difference test ");
        temp2.display();
        System.out.println("Interstion test ");
        temp3.display();

    }

}
