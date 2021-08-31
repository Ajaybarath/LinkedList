package com.bridgeLabz.linkedList;

public class MyLinkedList<K> {

	INode<K> head;
	INode<K> tail;

	public static void main(String args[]) {

		MyLinkedList<Integer> addLinkedList = new MyLinkedList<>();
		MyLinkedList<Integer> appendLinkedList = new MyLinkedList<>();
		MyLinkedList<Integer> addInBetweenLinkedList = new MyLinkedList<>();

		INode<Integer> node1 = new MyNode<>(56);
		INode<Integer> node2 = new MyNode<>(30);
		INode<Integer> node3 = new MyNode<>(70);

		addLinkedList.add(node3);
		addLinkedList.add(node2);
		addLinkedList.add(node1);

		appendLinkedList.append(node1);
		appendLinkedList.append(node2);
		appendLinkedList.append(node3);

		addInBetweenLinkedList.add(node3);
		addInBetweenLinkedList.add(node1);
		addInBetweenLinkedList.addInBetween(node2);

		addLinkedList.printNode();

		appendLinkedList.printNode();

		addInBetweenLinkedList.printNode();

	}

	public void add(INode<K> newNode) {

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}

	}

	public void append(INode<K> newNode) {

		if (tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = tail.getNext();
		}

	}

	public void addInBetween(INode<K> newNode) {
		newNode.setNext(head.getNext());
		head.setNext(newNode);
	}

	public void pop() {
		head = head.getNext();
	}

	public void popLast() {

		INode<K> tempNode = head;

		while (tempNode.getNext().getNext() != null) {
			tempNode = tempNode.getNext();
		}

		tempNode.setNext(null);

		tail = tempNode;

	}

	public boolean findNode(INode node) {

		INode<K> tempNode = head;

		while (tempNode != null) {
			
			if (tempNode.getKey().equals(node.getKey()))
				return true;
			
			tempNode = tempNode.getNext();
		}
		
		return false;
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
