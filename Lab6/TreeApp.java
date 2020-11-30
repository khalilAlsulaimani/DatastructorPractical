/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author alsul
 */
public class TreeApp {

    public static void main(String[] args) {
        int value;
        Tree theTree = new Tree();

        theTree.insert(50);
        theTree.insert(25);
        theTree.insert(75);
        theTree.insert(12);
        theTree.insert(37);
        theTree.insert(43);
        theTree.insert(30);
        theTree.insert(33);
        theTree.insert(87);
        theTree.insert(93);
        theTree.insert(97);

        loop:
        while (true) {
            System.out.print("Enter first letter of show, ");
            System.out.print("insert, find, delete, traverse , range or end : ");
            Scanner in = new Scanner(System.in);

            char choice = in.next().charAt(0);
            switch (choice) {
                case 's':
                    theTree.displayTree();
                    System.out.print("\n");

                    break;
                case 'i':
                    System.out.print("Enter value to insert: ");
                    value = in.nextInt();
                    theTree.insert(value);
                    System.out.print("\n");

                    break;
                case 'f':
                    System.out.print("Enter value to find: ");
                    value = in.nextInt();
                    TNode found = theTree.find(value);
                    if (found != null) {
                        System.out.print("Found: ");
                        found.displayNode();
                        System.out.print("\n");
                    } else {
                        System.out.print("Could not find ");
                    }
                    System.out.print(value + '\n');
                    break;
                case 'd':
                    System.out.print("Enter value to delete: ");
                    value = in.nextInt();
                    boolean didDelete = theTree.delete(value);
                    if (didDelete) {
                        System.out.print("Deleted " + value + '\n');
                    } else {
                        System.out.print("Could not delete ");
                    }
                    System.out.print(value + '\n');
                    break;
                case 't':
                    System.out.print("Enter type 1, 2, 3 or 4 : ");
                    value = in.nextInt();
                    theTree.traverse(value);
                    System.out.print("\n");
                    break;

                case 'e':
                    System.out.println("Program terminated");
                    break loop;
                    
                case 'r':
                    theTree.range();
                    break;
                default:
                    System.out.print("Invalid entry\n");
            }  // end switch
        }  // end while
    }  // end main()
}
