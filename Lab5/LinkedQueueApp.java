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
public class LinkedQueueApp {

    public static void main(String[] args) {
        LinkedQueue qu = new LinkedQueue();
        qu.enqueue(9);
        qu.enqueue(80);
        qu.enqueue(8);
        qu.enqueue(40);
        qu.enqueue(70);
        System.out.println("is queue empty " + qu.isEmpty());
        System.out.println("queue size " + qu.size());
        System.out.println(qu.front() + " is front of queue");

        try {
            while (!qu.isEmpty()) {
                int value = (int) qu.dequeue();
                System.out.print(value + " ");
            }
            System.out.println();

        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
