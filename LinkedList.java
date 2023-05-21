package com.code.main;

public class LinkedList {


	class Node{
		private int data;
		private Node next;

		public Node(int data){
			this.data = data;
		}
	}

	private Node first= null;;
	private Node last = null;

	public void addNode(int value){

		Node newNode = new Node(value);
		
		if(this.first == null){

			this.first = newNode;
			this.last = newNode;
		}
		else{
			this.last.next = newNode;
			this.last = this.last.next;

		}
	}

	public void printNode(){

		Node current = this.first;
		while(current !=null){

			System.out.print(current.data+",");
			current = current.next;
		}
	}

}
