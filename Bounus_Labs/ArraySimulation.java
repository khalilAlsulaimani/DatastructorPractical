/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bounus_Labs;


public class ArraySimulation {
    public static void mystery(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]= arr[i]+arr[i-1];
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args){
        int[] arr = {7,3,2,0,5};
     ArraySimulation.mystery(arr);
    }
}
