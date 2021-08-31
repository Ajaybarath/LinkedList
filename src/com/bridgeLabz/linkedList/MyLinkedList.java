package com.bridgeLabz.linkedList;

public class MyLinkedList<K> {

	INode<K> head;

	public static void main(String args[]) {

		MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

		INode<Integer> node1 = new MyNode<>(56);
		INode<Integer> node2 = new MyNode<>(30);
		INode<Integer> node3 = new MyNode<>(70);

		myLinkedList.add(node3);
		myLinkedList.add(node2);
		myLinkedList.add(node1);
		
		myLinkedList.printNode();
		
	}

	public void add(INode<K> newNode) {
		
		if (head == null) {
			head = newNode;
		}
		else {			
			newNode.setNext(head);
			head = newNode;
		}
	
	}
	
	public void printNode() {
		
		INode<K> tempNode = head;
		while (tempNode.getNext() != null) {
			System.out.println(tempNode.getKey());
			tempNode = tempNode.getNext();
		}
		
		System.out.println(tempNode.getKey());

	}

}
