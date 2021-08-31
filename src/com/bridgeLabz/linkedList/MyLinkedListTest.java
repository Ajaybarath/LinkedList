package com.bridgeLabz.linkedList;

import org.junit.Test;
import org.junit.Assert;

public class MyLinkedListTest {

	@Test
	public void createSimpleLinkedListTest() {
		
		INode<Integer> node1 = new MyNode<>(56);
		INode<Integer> node2 = new MyNode<>(30);
		INode<Integer> node3 = new MyNode<>(70);
		
		node1.setNext(node2);
		node2.setNext(node3);
		
		boolean result = node1.getNext().equals(node2) && node2.getNext().equals(node3);
		
		Assert.assertTrue(result);
		
	}
	
	@Test
	public void addToLinkedListTest() {
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
		
		INode<Integer> node1 = new MyNode<>(56);
		INode<Integer> node2 = new MyNode<>(30);
		INode<Integer> node3 = new MyNode<>(70);
		
		myLinkedList.add(node3);
		myLinkedList.add(node2);
		myLinkedList.add(node1);
		
		boolean result = myLinkedList.head.equals(node1) && myLinkedList.head.getNext().equals(node2) && myLinkedList.head.getNext().getNext().equals(node3);
		
		Assert.assertTrue(result);
		
	}
	
	@Test
	public void appendToLinkedListTest() {
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
		
		INode<Integer> node1 = new MyNode<>(56);
		INode<Integer> node2 = new MyNode<>(30);
		INode<Integer> node3 = new MyNode<>(70);
		
		myLinkedList.append(node1);
		myLinkedList.append(node2);
		myLinkedList.append(node3);
		
		boolean result = myLinkedList.head.equals(node1) && myLinkedList.head.getNext().equals(node2) && myLinkedList.head.getNext().getNext().equals(node3);
		
		Assert.assertTrue(result);
		
	}
}
