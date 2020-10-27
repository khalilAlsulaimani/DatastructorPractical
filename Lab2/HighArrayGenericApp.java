/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import Lab1.Person;




/**
 *
 * @author alsul
 */
public class HighArrayGenericApp {

    public static void main(String[] args) {
        int maxsize = 30;
        HighArrayGeneric arr;
        Person p= new Person("omer",10,180);
        
        
        arr= new HighArrayGeneric(Person.class,maxsize);
        
        arr.insert( new Person("khalid",10,187));
        arr.insert( new Person("omer",10,170));
        
         
        arr.display();
        arr.insertOrdered( new Person("oe",77,160));
        arr.insertOrdered( new Person("A",18,160));
        arr.display();
        arr.insertOrdered(new Person("A",20,190));
        arr.display();


    }

}
