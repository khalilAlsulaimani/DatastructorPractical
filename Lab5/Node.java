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
public class Node<T> {

    private T data;
    private Node next;
    private Node prev;

    public Node(T d) {
        data = d;
    }

    @Override
    public String toString() {
        return "Node :" + data;
    }
    
    public void display() {// display ourself
        System.out.print("{" + data + "} ");
    }

    public void setData(T d) {
        data = d;
    }

    public T getData() {
        return data;
    }

    public void setNext(Node n) {
        next = n;
    }

    public Node getNext() {
        return next;
    }

    public void setPrev(Node n) {
        prev = n;
    }

    public Node getPrev() {
        return prev;
    } 

} // end class Node
