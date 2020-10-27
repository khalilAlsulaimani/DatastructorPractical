/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author alsul
 */
public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter file name");
        String s = scan.nextLine();
        Scanner input = new Scanner(new File(s));
        int[] arr = new int[100];
        int i = 0;
        while (input.hasNextInt()) {
            int next = input.nextInt();
            arr[i] = next;
            i++;
        }// end while
        int nElems = i;
// Print the array contents
        System.out.println("Array Contents");
        for (i = 0; i < nElems; i++) {
            System.out.println(i + "\t" + arr[i]);
        }// end for 
    }// end main
}
