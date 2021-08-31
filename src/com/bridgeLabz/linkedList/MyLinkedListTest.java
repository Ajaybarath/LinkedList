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
}
