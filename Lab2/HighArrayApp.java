/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 *
 * @author alsul
 */
public class HighArrayApp {
    public static void main(String[] args) throws FileNotFoundException{
      int maxSize = 100;            // array size
      HighArray arr;                // reference to array
      arr = new HighArray(maxSize); // create the array
      HighArray arr2= new HighArray(0);

      arr.insert(77);               // insert 10 items
      arr.insert(99);
      arr.insert(44);
      arr.insert(55);
      arr.insert(22);
      arr.insert(88);
      arr.insert(11);
      arr.insert(00);
      arr.insert(66);
      arr.insert(33);
      System.out.println("is the array a sorted : "+arr.checkOrdered());// print check if orderd method
      
      arr2.readLongFile("D:\\Test files\\TestReadLong.txt");
      
      int find=44; 
      System.out.println(find +" has occurred "+arr.findAll(find)+" times");// find all test
      
      int deleteAllValue=44;
      arr.deleteAll(deleteAllValue);// delete all occurnces of 44
      arr.display();
      
      int searchKey = 0;           // search for item
      if( arr.find(searchKey) ){
         System.out.println("Found " + searchKey);
      }else{
         System.out.println("Can't find " + searchKey);
      }
      System.out.println("the biggest value is "+ arr.max());// print the max value
      
      System.out.println("the biggest value index is "+ arr.maxIndex());// print the max index value
      
      System.out.println("the smallest value is "+ arr.min());// print the min value
      
      System.out.println("the smallest value index is "+ arr.minIndex());// print the min index value
      
      System.out.println("the range is "+arr.range());// prins range
    

      System.out.println("the sum is "+arr.sum());// print sum 
      
      System.out.println("the sum is "+arr.avg());// print avg
      
      System.out.printf("the std is %.2f %n",arr.std());// print std
      
      int rank=3;
      System.out.println("the rank "+rank+" is "+arr.rank(rank));// print rank of rank
     
      System.out.println("is the array a sorted : "+arr.checkOrdered());// print check if orderd method
      
      System.out.println("is the array made up of uniqe elements  : "+arr.checkUnique());//print checkUnique
      
      arr.removeDuplicates();
      
      //arr.fillArrayRandom();// filling array with random elemnts
      
//      arr.delete(00);               // delete 3 items
//      arr.delete(55);
//      arr.delete(99);
//      System.out.print("the array after the values have been deleted : ");

     arr.insertOrdered(1000);
     System.out.println(arr.binarySearch(220));
//      
      arr.display();                // display items again
      }  // end main()
   }  // end class HighArrayApp
    

