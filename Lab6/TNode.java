/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author alsul
 * @param <T>
 */
public class TNode<T>  {

    private T iData;              // data item (key)
    private TNode leftChild;         // this node's left child
    private TNode rightChild;        // this node's right child

    public TNode() {
        iData = null;
        leftChild = null;
        rightChild = null;
    }

    public TNode(T data, TNode left, TNode right) {
        iData = data;
        leftChild = left;
        rightChild = right;
    }

    public void setiData(T data) {
        iData = data;
    }

    public void setRightChild(TNode right) {
        rightChild = right;
    }

    public void setLeftChild(TNode left) {
        leftChild = left;
    }

    public T getiData() {
        return iData;
    }

    public TNode getLeftChild() {
        return leftChild;
    }

    public TNode getRightChild() {
        return rightChild;
    }
    
    

    public void displayNode() // display ourself
    {
        System.out.print('{');
        System.out.print(iData);
        System.out.print("} ");
    }

 

 

}
