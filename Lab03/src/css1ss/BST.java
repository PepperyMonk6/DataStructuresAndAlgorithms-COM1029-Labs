package org.com1029.lab3.css1ss;

/**
 * @author css1ss. A Binary Tree class for integers
 */

import java.util.*;

public class BST {

	/**
	 * The Binary tree has a single item of data: the reference to the root of the tree.  
	 * This is either null (for an empty tree) or a BinNode.
	 */

	private BSTNode root = null; // the field for tree's root node

	public BST() {
		root = null;// set the root initially to be null;
	}

	public BSTNode getRoot() {
		return root;
	}

	public void setRoot(BSTNode node){
		root = node;
	}


	/*************************************************************************************
	 * The size of a tree is the number of nodes that it contains
	 * 
	 * This can be defined by defining a recursive definition of size on BinNodes.
	 * The size of the tree is then just the size method applied to the root node
	 * 
	 * @return
	 */

	public int treeSize(){
		return this.size(root);// Replace with your code
	}

	/**
	 * size on a node bn is the number of nodes in the tree from bn.  It is defined recursively.
	 * 
	 * @param bn
	 * @return
	 */

	public int size(BSTNode bn){
		if (bn == null){
			return 0;// Replace with your code
		}
		else{
			return 1 + size(bn.getLeft()) + size(bn.getRight());// Replace with your code
		}
	}


	/*****************************************************************
	 * treeHeight returns the height of a tree.
	 * 
	 * it uses the recursively defined method height on BinNode
	 * 
	 * @return
	 */

	public int treeHeight(){
		return this.height(root);// COMPLETE this definition ;
	}

	public int height(BSTNode bn){
		if (bn == null){
			return 0;// COMPLETE this definition ;
		}	else if(bn.getLeft() == null && bn.getRight() == null) {
			return 0;
		}	else {
			return 1 + Math.max(height(bn.getLeft()), height(bn.getRight()));// COMPLETE this definition ;
		}
	}






	/****************************************************************
	 * addValue inserts the parameter 'value' into the tree
	 * 
	 * @param value
	 */

	public void addValueToTree(int value){
		// if the tree is null then you must create a new node with value and set that to be the root
		// if the tree is not null then you need to call add(value, root)
		//    making use of the add method on nodes to be defined below
		if(this.root == null) {
			this.root = new BSTNode(value);
		}	else {
			this.add(value, root);
		}
	} 


	/** 
	 * Method add creates a new node of type BinNode with the
	 * parameter value. This new node is then added to the tree below bn.
	 * 
	 * @param value
	 * @param bn
	 */

	public void add(int value, BSTNode bn){
		if (value < bn.getData()){
			if (bn.getLeft() == null){
				bn.setLeft(new BSTNode(value));
			}
			else{
				add(value, bn.getLeft());
			}
		}
		else{
			// Add your code here 
			if(value > bn.getData()) {
				if(bn.getRight() == null) {
					bn.setRight(new BSTNode(value));
				}
				else {
					add(value, bn.getRight());
				}
			}
		}	    
	}

	/**
	 * The traverseTree method calls a recursive method inOrder that 
	 * prints out the contents of the tree from the smallest value to 
	 * the highest value
	 */

	public void traverseInOrder(){
		inOrder(root);
	}

	/**
	 * traverseFromNode outputs the contents of the tree below the node 'start' passed as the parameter
	 * 	
	 * @param node
	 */

	public void inOrder(BSTNode node) {
		if (node != null) {
			inOrder(node.getLeft());
			System.out.print(node.getData() + "  ");
			inOrder(node.getRight());
		}
	}

	public void traverseInOrderBackward(){
		// Add your code here
		this.inOrderBackward(root);
	}

	public void inOrderBackward(BSTNode start) {
		// Add your code here
		if(start != null) {
			this.inOrderBackward(start.getRight());
			System.out.print(start.getData() + "  ");
			this.inOrderBackward(start.getLeft());
		}
	}

	public void traversePreOrder(){
		// Add your code here
		this.preOrder(root);
	}

	public void preOrder(BSTNode start) {
		// Add your code here
		if(start != null) {
			System.out.println(start.getData());
			this.preOrder(start.getLeft());
			this.preOrder(start.getRight());
		}
	}

	public int treeSum(){
		return this.sum(root); // Replace with your code here
	}

	public int sum(BSTNode bn){
		// Replace with your code
		int result = 0;
		if(bn != null) {
			result += bn.getData();
			result += this.sum(bn.getLeft());
			result += this.sum(bn.getRight());
		}
		return result;
	}

	/*
	 *     Extension exercises
	 *   
	 */



	public boolean balanced(){
		
		return this.balanceChecker(this.root); // Replace with your code  
	}
	
	private boolean balanceChecker(BSTNode node) {
		int left = 0;
		int right = 0;
		left += this.size(node.getLeft());
		right += this.size(node.getRight());
		if(right == left || right + 1 == left || left + 1 == right) {
			return true;
		}	else {
			return false;
		}
	}


	//least value in the tree  

	public int min(){
		return this.minChecker(this.root); // Replace with your code  
	}
	
	private int minChecker(BSTNode node) {
		int result = 0;
		if(node != null) {
			if(node.getLeft() == null) {
				result += node.getData();
			}
			result += this.minChecker(node.getLeft());
		}
		return result;
	}

	// greatest value in the tree  

	public int max(){
		return this.maxChecker(root); // Replace with your code   
	}
	
	private int maxChecker(BSTNode node) {
		int result = 0;
		if(node != null) {
			if(node.getRight() == null) {
				result += node.getData();
			}
			result += this.maxChecker(node.getRight());
		}
		return result;
	}


	// outputs a sorted list of the elements in the tree

	public List<Integer> toSortedList() {
		//this.inOrder(root); // Replace with your code   
		return this.listSorter(root);
	}
	
	private List<Integer> listSorter(BSTNode node) {
		List<Integer> integers = new ArrayList<Integer>();
		
		/*if (node != null) {
			inOrder(node.getLeft());
			integers.add(node.getData());
			//System.out.print(node.getData() + "  ");
			inOrder(node.getRight());
		}*/
		return integers;
	}


	// Convert from a sorted array into a balanced binary tree  

	public static BST arrayToBST(int[] arr){
		int value = 0;
		int k = (arr.length - 1)/2;
		BST n = new BST();
		n.addValueToTree(arr[k]);
		for(int i = 0; i < arr.length; i++) {
			if(i == k) {
				continue;
			}
			value = arr[i];
			n.addValueToTree(value);
		}
		return n; // Replace with your code   
	}

}

