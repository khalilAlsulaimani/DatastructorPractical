/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author alsul
 */
public class TestPerson {
    public static void main(String[] args){
        // testing empty constructor 
        Person p1= new Person();
        System.out.println(p1.toString());
        p1.setAge(10);
        p1.setName("MIKE");
        p1.setHight(160);
        System.out.println(p1.toString());
        //testing modified constructor
        Person khalil = new Person("Khalil",20,186);
        System.out.println(khalil.toString());
        
    }
}
