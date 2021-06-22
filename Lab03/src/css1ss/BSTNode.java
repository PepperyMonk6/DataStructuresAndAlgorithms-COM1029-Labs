package org.com1029.lab3.css1ss;

/**
 * @author steveschneider
 * 
 * BinNode can be created with a value, and then provides getters and setters for its three fields.
 * 
 * It is used within BinaryTree.
 */

public class BSTNode {

	/**
	 * Three fields. 
	 * Nodes contain data of type int
	 * and two nodes, left and right, which are also of type BinNode.
	 */

	private int data;
	private BSTNode left;
	private BSTNode right;

	public BSTNode(int val) {
    // TODO:  set the fields with the initial values: data with val, and the other two fields with null.
		this.data = val;
		this.left = null;
		this.right = null;
	}


	public BSTNode getLeft() {
		return left;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
