/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author alsul
 * @param <T>
 */
public class Tree<T extends Comparable<T>> {

    private TNode root;             // first node of tree

// -------------------------------------------------------------
    public Tree() // constructor
    {
        root = null;
    }            // no nodes in tree yet
// -------------------------------------------------------------

    public TNode find(T key) // find node with given key
    {                           // (assumes non-empty tree)
        TNode current = root;               // start at root
        while (current.getiData() != key) // while no match,
        {

            if (key.compareTo((T) current.getiData()) == -1) // go left?
            {
                current = current.getLeftChild();
            } else // or go right?
            {
                current = current.getRightChild();
            }
            if (current == null) // if no child,
            {
                return null;                 // didn't find it
            }
        }
        return current;                    // found it
    }  // end find()
// -------------------------------------------------------------

    public void insert(T id) {
        TNode newNode = new TNode();    // make new node
        newNode.setiData(id);           // insert data
        if (root == null) // no node in root
        {
            root = newNode;
        } else // root occupied
        {
            TNode current = root;       // start at root
            TNode parent;
            while (true) // (exits internally)
            {
                parent = current;
                if (id.compareTo((T) current.getiData()) == -1) // go left?
                {
                    current = current.getLeftChild();
                    if (current == null) // if end of the line,
                    {                 // insert on left
                        parent.setLeftChild(newNode);
                        return;
                    }
                } // end if go left
                else // or go right?
                {
                    current = current.getRightChild();
                    if (current == null) // if end of the line
                    {                 // insert on right
                        parent.setRightChild(newNode);
                        return;
                    }
                }  // end else go right
            }  // end while
        }  // end else not root
    }  // end insert()
// -------------------------------------------------------------

    public boolean delete(T key) // delete node with given key
    {                           // (assumes non-empty list)
        TNode current = root;
        TNode parent = root;
        boolean isLeftChild = true;

        while (current.getiData() != key) // search for node
        {
            parent = current;
            if (key.compareTo((T) current.getiData()) == -1) // go left?
            {
                isLeftChild = true;
                current = current.getLeftChild();
            } else // or go right?
            {
                isLeftChild = false;
                current = current.getRightChild();
            }
            if (current == null) // end of the line,
            {
                return false;                // didn't find it
            }
        }  // end while
        // found node to delete

        // if no children, simply delete it
        if (current.getLeftChild() == null && current.getRightChild() == null) {
            if (current == root) // if root,
            {
                root = null;                 // tree is empty
            } else if (isLeftChild) {
                parent.setLeftChild(null);     // disconnect
            } else // from parent
            {
                parent.setRightChild(null);
            }
        } // if no right child, replace with left subtree
        else if (current.getRightChild() == null) {
            if (current == root) {
                root = current.getLeftChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getLeftChild());
            } else {
                parent.setRightChild(current.getLeftChild());
            }
        } // if no left child, replace with right subtree
        else if (current.getLeftChild() == null) {
            if (current == root) {
                root = current.getRightChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getRightChild());
            } else {
                parent.setRightChild(current.getRightChild());
            }
        } else // two children, so replace with inorder successor
        {
            // get successor of node to delete (current)
            TNode successor = getSuccessor(current);

            // connect parent of current to successor instead
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.setLeftChild(successor);
            } else {
                parent.setRightChild(successor);
            }

            // connect successor to current's left child
            successor.setLeftChild(current.getLeftChild());
        }  // end else two children
        // (successor cannot have a left child)
        return true;                                // success
    }  // end delete()
// -------------------------------------------------------------
    // returns node with next-highest value after delNode
    // goes to right child, then right child's left descendents

    private TNode getSuccessor(TNode delNode) {
        TNode successorParent = delNode;
        TNode successor = delNode;
        TNode current = delNode.getRightChild();   // go to right child
        while (current != null) // until no more
        {                                 // left children,
            successorParent = successor;
            successor = current;
            current = current.getLeftChild();      // go to left child
        }
        // if successor not
        if (successor != delNode.getRightChild()) // right child,
        {                                 // make connections
            successorParent.setLeftChild(successor.getRightChild());
            successor.setRightChild(delNode.getRightChild());
        }
        return successor;
    }
// -------------------------------------------------------------

    public void traverse(int traverseType) {
        switch (traverseType) {
            case 1:
                System.out.print("\nPreorder traversal: ");
                preOrder(root);
                break;
            case 2:
                System.out.print("\nInorder traversal:  ");
                inOrder(root);
                break;
            case 3:
                System.out.print("\nPostorder traversal: ");
                postOrder(root);
                break;
            case 4:
                System.out.print("\nlevelorder traversal: ");
                levelOrder(root);

                break;

        }
        System.out.println();
    }
// -------------------------------------------------------------

    private void preOrder(TNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getiData() + " ");
            preOrder(localRoot.getLeftChild());
            preOrder(localRoot.getRightChild());
        }

    }
// -------------------------------------------------------------

    private void inOrder(TNode localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.getLeftChild());
            System.out.print(localRoot.getiData() + " ");
            inOrder(localRoot.getRightChild());
        }
    }
// -------------------------------------------------------------

    private void postOrder(TNode localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.getLeftChild());
            postOrder(localRoot.getRightChild());
            System.out.print(localRoot.getiData() + " ");
        }
    }

//--------------------------------------------------------------
    /**
     * print from left to right in level order using linked list queue
     *
     * @param localRoot
     */
    private void levelOrder(TNode localRoot) {
        int h = height(localRoot);
        int i;
        for (i = 0; i <= h; i++) {
            PrintGivenLevel(localRoot, i);
        }

    }

    //function for computing height
    int height(TNode root) {
        if (root == null) {
            return 0;
        } else {
            int Leftheight = height(root.getLeftChild());
            int Rightheight = height(root.getRightChild());
            //larger one
            if (Leftheight > Rightheight) {
                return (Leftheight + 1);
            } else {
                return (Rightheight + 1);
            }
        }
    }

    /* Print nodes at the given level */
    void PrintGivenLevel(TNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.getiData() + " ");
        } else if (level > 1) {
            PrintGivenLevel(root.getLeftChild(), level - 1);
            PrintGivenLevel(root.getRightChild(), level - 1);
        }
    }

//-------------------------------------------------------------
    public void range() {
        System.out.println("the max is " + findMax(root));
        System.out.println("the min is " + findMin(root));
    }

//---------------------------------------------------------------
    T max ;

    public T findMax(TNode localRoot) {

        if (localRoot.getRightChild() != null) {
            max = (T) localRoot.getRightChild().getiData();
            findMax(localRoot.getRightChild());
        }

        return max;

    }

//--------------------------------------------------------------
    T min ;

    public T findMin(TNode localRoot) {

        if (localRoot.getLeftChild() != null) {
            min = (T) localRoot.getLeftChild().getiData();
            findMin(localRoot.getLeftChild());
        }
        return min;

    }

// -------------------------------------------------------------
    public void displayTree() {
        inOrder(root);
    }  // end displayTree()
// -------------------------------------------------------------

}  // end class Tree

