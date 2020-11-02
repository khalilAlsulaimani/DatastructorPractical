/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

/**
 *
 * @author alsul
 */
public class QueueArrayGeneric <T>{
     int capacity;
    int front = 0;
    int rear = -1;
    int nElems = 0;
    T[] a;

    public QueueArrayGeneric(Class<T> c,int s) {
        capacity = s;
        front = 0;
        rear = -1;
        nElems = 0;
        a = (T[]) Array.newInstance(c,capacity);
    }

    public void enqueue(T value) {
        if (!isFull()) {// enter if not full
            rear = (rear + 1) % a.length;
            a[rear] = value;
            nElems++;
        }else{// if full print messge 
            System.out.println("queue is full cant enter value "+value);
        }
    }

    public T dequeue()throws NoSuchElementException {
        if(isEmpty()){// if user asks to dequeue when itEmpty is true enter to prevent error
            throw new NoSuchElementException(" queue is empty cannot dequeue more elements ");
        }
        T temp = a[front];
        front = (front + 1) % a.length;
        nElems--;
        return temp;
    }

    public boolean isEmpty() {
        return (nElems == 0);
    }

    public boolean isFull() {
        return (nElems == a.length);
    }

    public int size() {
        return nElems;
    }
}

    

