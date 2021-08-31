package com.bridgeLabz.linkedList;

public class MyLinkedList {
	
	public static void main(String args[]) {

		INode node1 = new MyNode(56);
		INode node2 = new MyNode(30);
		INode node3 = new MyNode(70);
		
		node1.setNext(node2);
		node2.setNext(node3);
	}
	
}
