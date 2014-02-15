package org.giddap.dreamfactory.fundamentals.datastructure;

/**
 * Created with IntelliJ IDEA.
 * User: peng
 * Date: 2/12/13
 * Time: 9:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class BinarySearchTree<Key extends Comparable<Key>, Value> {
    private class Node {
        private Key key;
        private Value value;
        private Node left;
        private Node right;
        private int n;

        public Node(Key key, Value value, int n) {
		this.key = key;
		this.value = value;	
	}
    }

    private Node root;
    
    public int size() {
	    return 0;
    }
}
