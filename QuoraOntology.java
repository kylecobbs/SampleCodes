package com.practice.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class QuoraOntology<T> {
	public  void main(String[] args){
		Scanner in =  new Scanner(System.in);
		int nodes = in.nextInt();
		in.nextLine();
		String nodeLine = in.nextLine();
		System.out.println(nodeLine);
		Tree ts = new Tree<String>(nodeLine);
		HashMap<String, ArrayList<String>> questMap = new HashMap<String, ArrayList<String>>();
		String[] array = nodeLine.split(" ");
		for(String a : array){
			System.out.println(a);
			if(a == "("){
				ts.addData(a);
			} else if (a == ")"){
				
			} else {
				ts.addData(a);
			}
			
		}
		int max = in.nextInt();
		
		in.nextLine();
		for(int i=0;i<max;i++){
			String nL = in.nextLine();
			String[] query = nL.split(": ");
			if(questMap.get(query[0]) != null){
				questMap.get(query[0]).add(query[1]);
			} else {
				ArrayList<String> st = new ArrayList<String>();
				st.add(query[1]);
				questMap.put(query[0],st);
			}
			//in.nextLine();
		}
		
		/*for(String a : array){
			System.out.println(a);
			if(a == "("){
				ts.add(a);
			} else if (a == ")"){
				
			} else {
				ts.add(a);
			}
			
		}*/
		String t = "Pigeons Where in";
		String[] iS = t.split(" ");
		int count = 0;
		String check = "";
		for(int j=1;j<iS.length;j++){
			check=check+iS[j]+" ";
		}
		for(String op : questMap.get(iS[0])){
			System.out.println(" OP "+op+" check "+check);
			if(op.startsWith(check)){
				count++;
			}
		}
		//System.out.println(ts.tailSet("A") + "ArrayList size " + questMap.size());
		System.out.println("For " + iS[0] + ", number of outcomes: " + count );
		
		
	}
	public class Tree<T> {
	

	    public  class Node<T> {
	        private Node<T> root;

		   /* public Tree(T rootData) {
		        root = new Node<T>();
		        root.data = rootData;
		        root.children = new ArrayList<Node<T>>();
		    }*/
		    
		    public void addData (T data){
		    	this.data = data;
		    }
		    
		    public void addChild(Node node){
		    	this.children.add(node);
		    }
		    
		    public List<Node<T>> returnChild(Node node){
		    	return this.children;
		    }
		    
	        private T data;
	        private Node<T> parent;
	        private List<Node<T>> children;
	    }
	    
	   
	    
	}

}


