/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bounus_Labs;

import java.util.Arrays;

/**
 *
 * @author alsul
 */
public class ArrayTally {

    public static int[] sum5(int[] list) {
        int[] sum = new int[5];
        for (int i = 0; i < list.length; i++) {
            sum[i % 5] += list[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] list = {7,8,3,4,9,2,5,8,13,7};
        System.out.println(Arrays.toString(ArrayTally.sum5(list)));
    }

}
