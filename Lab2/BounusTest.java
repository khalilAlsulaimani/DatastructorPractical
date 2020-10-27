/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author alsul
 */
public class BounusTest {

    public static void main(String[] args) {
        int max = 100;
        HighArray arr = new HighArray(max);
        arr.fillArrayRandom();

//        arr.shiftLeft(-2);
//        arr.shiftRight(1);
          //arr.insertAt(100, 1);
          arr.deleteAt(1);
          double start= System.nanoTime();
          //arr.find(100);
          //arr.insertOrdered(90);
          //arr.insert(90);
          arr.binarySearch(max);
          double end = System.nanoTime();
          System.out.println(end-start);
    }

}
