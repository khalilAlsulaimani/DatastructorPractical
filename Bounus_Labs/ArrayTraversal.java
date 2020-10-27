/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bounus_Labs;

/**
 *
 * @author alsul
 */
public class ArrayTraversal {

    public static int numUnique(int[] list) {
        int count=1;
        if (list.length == 0) {
            return 0;
        } else {
            
            for (int i = 1; i < list.length; i++) {
                if(list[i]!=list[i-1]){
                    count++;
                }
            }
        }
      
        return count;
    }
    
    public static void main(String[] args){
        int[] list ={1 ,1,2,2,3,3};
        System.out.println("the number of unique numbers is "+ArrayTraversal.numUnique(list));
    }
}
