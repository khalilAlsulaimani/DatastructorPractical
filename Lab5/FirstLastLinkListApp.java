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
public class FirstLastLinkListApp {
    public static void main(String[] args){
        FirstLastLinkList list = new FirstLastLinkList();
        list.insert(0,1);
        list.insert(1,3);
        list.insert(2,100);
        list.insert(3,9);
        list.insert(4,8);
        list.display();
       
        list.update(0,4);
        list.update(3, 0);
        list.remove(4);
        list.display();
       int value = (int)list.retrieve(1);
       System.out.println("value is "+value );
       
       FirstLastLinkList list2 = new FirstLastLinkList();
       
       list2.insert(0,"khalil");
       list2.insert(1,"maike");
       list2.display();
    }
    
}
