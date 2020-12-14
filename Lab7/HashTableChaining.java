/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

import java.util.LinkedList;

/**
 *
 * @author alsul
 */
/**
 * @(#) HashTableChaining.java
 *
 * Implements a Chaining HashTable Implementation.
 *
 */
// import linked list package here
public class HashTableChaining {

    private LinkedList[] hashArray;	// Array of Lists 
    private int nElems;			// number of elements in hashtable 

    /**
     * Default Constructor Creates a Hash Table capable of holding 11 items
     */
    public HashTableChaining() {
        this(11);
    }

    /**
     * Constructor creates HashTable of Specified size
     *
     * @param size size of hashtable to create
     */
    public HashTableChaining(int size) {
        nElems = 0;
        hashArray = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            hashArray[i] = new LinkedList();
        }
    }

    /**
     * Hash function generates hash value from key
     *
     * @param key key to hash
     * @param tableSize size of table key is generated for
     * @return hash value
     */
    public int hashFunc(String key, int tableSize) {
        int i, sum = 0;
        for (i = 0; i < key.length(); i++) {
            sum = sum + (int) key.charAt(i);
        }
        return sum % tableSize;
    }

    /**
     * Provide printable representation of a hashtable
     *
     * @return String representation
     */
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();

        for (LinkedList hashArray1 : hashArray) {
            StringBuilder append;
            append = buffer.append(hashArray1).append("\n");
        }
        return buffer.toString();
    }

    /**
     * Display Elements in HashTable
     *
     */
    public void print() {
        System.out.println(this.toString());
    }

    /**
     * Insert a DataItem into the hash table
     *
     * @param item DataItem to insert
     */
    public void insert(DataItem item) {
        int hashVal = hashFunc(item.getKey(), hashArray.length);  // hash the key

        // COMPLETE THIS METHOD, add element to list identified by the hash 
        hashArray[hashVal].add(item);

        // increment number of elements 
        nElems++;
    }

    /**
     * Delete DataItem from HashTable identified by specified key
     *
     * @param key key identifying DataItem to delete
     * @return copy of deleted data item if found, otherwise null
     */
    public DataItem delete(String key) {
        int hashVal = hashFunc(key, hashArray.length);  // hash the key
        DataItem d = null;

        // COMPLETE THIS METHOD – locate element in list identified by hash
        DataItem elem=find(key);
        // take copy of the element, delete it from the list
        // and return the copy. If its not found return null
        if(elem==null){
            return null;
        }
        hashArray[hashVal]=null;
        return elem;
    }

    /**
     * Search hash table for DataItem identifed by specifed key
     *
     * @param key key identifying DataItem to locate
     * @return DataItem if found otherwise null
     */
    public DataItem find(String key) {
        int hashVal = hashFunc(key, hashArray.length);  // hash the key

        // COMPLETE THIS METHOD, locate element in list identified by hash,
        DataItem element=(DataItem)  hashArray[hashVal].element();
        // if found return element as method result, otherwise return null
        if(element==null){
            return null;
        }
        return element;
    }

}
