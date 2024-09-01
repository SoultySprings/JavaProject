package sts302p;

import java.util.*;
public class evenoddnodes {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	void segEvenOdd() {
		Node evenStart = null;
		Node evenEnd = null;
		Node oddStart = null;
		Node oddEnd = null;
		Node currentNode = head;
		while(currentNode!=null) {
			int element = currentNode.data;
			if(element%2==0) {
				if(evenStart==null) {
					evenStart=currentNode;
					evenEnd=evenStart;
				} else {
					evenEnd.next = currentNode;
					evenEnd = evenEnd.next;
				}
			}else{
				if(oddStart == null) {
					oddStart = currentNode;
					oddEnd = oddStart;
				} else {
					oddEnd.next = currentNode;
					oddEnd = oddEnd.next;
				}
			}
			currentNode = currentNode.next;
		}
		if(oddStart == null || evenStart == null) {
			return;
		}
		evenEnd.next = oddStart;
		oddEnd.next = null;
		head = evenStart;
	}
	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head  = new_node;
	}
	void printlist() {
		Node temp = head;
		System.out.println("Array :");
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		evenoddnodes eveodd = new evenoddnodes();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			int m = sc.nextInt();
			eveodd.push(m);
		}
		eveodd.segEvenOdd();
		eveodd.printlist();
	}
}
