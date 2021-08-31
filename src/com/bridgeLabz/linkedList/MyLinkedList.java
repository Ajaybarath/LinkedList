package com.bridgeLabz.linkedList;

public class MyLinkedList<K> {

	INode<K> head;
	INode<K> tail;
 
	public static void main(String args[]) {

		MyLinkedList<Integer> addLinkedList = new MyLinkedList<>();
		MyLinkedList<Integer> appendLinkedList = new MyLinkedList<>();

		INode<Integer> node1 = new MyNode<>(56);
		INode<Integer> node2 = new MyNode<>(30);
		INode<Integer> node3 = new MyNode<>(70);

		addLinkedList.add(node3);
		addLinkedList.add(node2);
		addLinkedList.add(node1);
		
		appendLinkedList.append(node1);
		appendLinkedList.append(node2);
		appendLinkedList.append(node3);
		
		addLinkedList.printNode();
		
		appendLinkedList.printNode();
		
	}

	public void add(INode<K> newNode) {
		
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else {			
			newNode.setNext(head);
			head = newNode;
		}
	
	}
	
	public void append(INode<K> newNode) {
		
		if (tail == null) {
			head = newNode;
			tail = newNode;
		}
		else {	
			tail.setNext(newNode);
			tail = tail.getNext();
		}
	
	}
	
	public void printNode() {
		
		INode<K> tempNode = head;
		while (tempNode.getNext() != null) {
			System.out.print(tempNode.getKey() + " -> ");
			tempNode = tempNode.getNext();
		}
		
		System.out.println(tempNode.getKey());

	}

}
