/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.NoSuchElementException;

/**
 *
 * @author alsul
 */
public class LinkedQueue<T> {
    private Node top;
    private Node front;
    private Node rear;
    private int length;
    
    public LinkedQueue(){
        top=null;
        front=null;
        rear=null;
        length=0;
    }
    
    public void enqueue(T value) {
        Node temp = new Node(value);
        if(isEmpty()){// setting the front when first element is enqueued
            front=temp;
        }else{// if it isnt the first element move the next pointer to the new node
            rear.setNext(temp);
        }
        rear=temp;// moving the rear
        length++;// increment size of queue
        
        
    }
    
    public T dequeue()throws NoSuchElementException {
        if(isEmpty()){
            throw new NoSuchElementException("\nqueue is empty cannot dequeue elements ");
        }
        T value =(T) front.getData();  //storing front value 
        front=front.getNext();  // moving pointer to the new front value 
        length--;// decremneting length
        
        return value;// returning the value
    }
    
    public T front(){
        return (T) front.getData();
    }
    
    public boolean isEmpty() {
        return (length==0);
    }
    
    public int size() {
        return length;
    }
}
