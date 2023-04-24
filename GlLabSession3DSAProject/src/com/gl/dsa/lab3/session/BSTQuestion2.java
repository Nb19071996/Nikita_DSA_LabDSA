package com.gl.dsa.lab3.session;

import java.util.HashSet;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class BSTQuestion2 {
	
	static Node root;

    public BSTQuestion2(Node root) {
        this.root = root;
    }
    
    
    static boolean isPairRescur(Node root, int sum, HashSet<Integer> set){
      if (root == null) return false;

      if (isPairRescur(root.left, sum, set)) return true;

      if (set.contains(sum - root.data)){
    	  System.out.println("Sum = "+sum);
          System.out.println("Pair is (" + (sum - root.data) + "," + root.data + ")");
          return true;
      }
      else set.add(root.data);

      return isPairRescur(root.right, sum, set);
    }

	  static void findPair(Node root, int sum){
	      HashSet<Integer> set = new HashSet<Integer>();
	      if (!isPairRescur(root, sum, set))
	          System.out.print("nodes are not found.");
	  }

	public static void main(String[] args) {
		BSTQuestion2 bts = new BSTQuestion2(new Node(40));
	        Node left = new Node(20);
	        Node right = new Node(60);
	        bts.root.left = left;
	        bts.root.right = right;
	        left.left = new Node(10);
	        left.right = new Node(30);
	        right.left = new Node(50);
	        right.right = new Node(70);
	        int sum = 130;
	        findPair(root, sum);
		
	}
	

}
