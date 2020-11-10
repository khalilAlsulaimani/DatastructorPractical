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
public class Node <T> {

    private T iData;              // data item (key)
    private Node next;              // next link in list
// -------------------------------------------------------------

    public Node(T id) { // constructor
        iData = id;
    }
// -------------------------------------------------------------

    public void displayLink() {// display ourself
        System.out.print("{" + iData + "} ");
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setNext( Node next){
        this.next=next;
    }
    
    public T getData(){
        return iData;
    }
    
    public void setData(T data){
        iData=data;
    }
}  // end class Node


