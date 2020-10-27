/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bounus_Labs;

import java.util.Arrays;

public class ArrayShifting {

    public static void removeZeros(int[] list) {
        int count = 0;//how many non-zero values
        for (int i = 0; i < list.length; i++) {
            if (list[i] != 0) {
                list[count] = list[i];
                count++;
            }
        }
        
        for(int i=count;i<list.length;i++){
            list[i]=0;
        }
    }

    public static void main(String[] args) {
       int[] list = {1,2,3,0,2,1,0,0};
       ArrayShifting.removeZeros(list);
       System.out.println(Arrays.toString(list));
    }
}
