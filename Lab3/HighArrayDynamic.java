/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author alsul
 */
public class HighArrayDynamic {
    private int nElems;
   private long[] a;
   private final int INITIALSIZE = 2;
   
   public HighArrayDynamic()
   {
      a = new long[INITIALSIZE];
      nElems = 0;
   }
   public HighArrayDynamic(int capacity)
   {
      a = new long[capacity];
      nElems = 0;
   }
   /**
    * adds element to array a and if its index is bigger then the size increase it making it dynamic  
    * 
    * @param x new added value 
    */
   public void add(long x){
      // your code goes here
       if(nElems+1>a.length){// if adding this element goes bigger then the size of a enter
           
           long[] oldA=a;// saving old elemnts so we dont lose them
           
           a= new long[a.length*2];// doubling array size
           System.arraycopy(oldA, 0, a, 0, nElems);
       }
       a[nElems]=x;// storing addded element 
       nElems++;// increasing a size
   }
   /**
    * takes given number and deletes it from a and makes a smaller to save space
    * 
    * @param delNum the number to be deleted from the array
    */
   public void delete(long delNum){
       
       int index=-1;// to be used to store the index of the elemet that will be deleted 
       
       for(int i=0;i<nElems;i++){// look through a to find element
           if(a[i]==delNum){//element found
               index=i;// update index
               break;
           }   
       }
       
       if(index!=-1){// if index hasnt been changed enter 
           for(int i=index;i<nElems;i++){// start from the index of deleted element 
               a[index]=a[index+1];// move down elements to hold the deletd elemnt place
           }
           nElems--;// reduce array size by one becuse of deleted element
       }else{// if not means it dosnt exit print message
           System.out.println("element not found in array "+index);
       }
       
   }
   
   public void compact(){
       long[] oldA=a;// saving old elements so they dont get lost
       a=new long[nElems];// compacting array to the size of the elements
       System.arraycopy(oldA, 0, a, 0, nElems);//moving back the elments to a
   }

   public String toString()
   {
      String temp = "[" + a[0];
      for (int i = 1; i < nElems; i++)
      {
          temp = temp + "," + a[i];
      }
      temp = temp + "]";
      return temp;
   }
   
   public int capacity(){
       return a.length;
   }

    
}
