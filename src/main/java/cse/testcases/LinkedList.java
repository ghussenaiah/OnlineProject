package cse.testcases;

class Node {
	public int data;
	public Node next;
}

public class LinkedList {
	private Node head;

	public boolean isEmpty() {
		return (head == null);
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		// newNode.next =head.next; is wrong statement why bcoz here
		// newNode.next (Node Object) it will expect complete object to assign
		newNode.next = head; // (right)
		head = newNode; // object to object assign
	}
 // used to insert a node at the start of linked list
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		// newNode.next = head;
		if (head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			Node newNode1 = new Node();
			newNode1.data = data;
			newNode1.next = null;
			currentNode.next = newNode1; // comple object to assign
											// currentNode.next is object type

		}
	}
 
	public void deleteFirst() {

		Node currentNode = head;
		head = currentNode.next;
		// head=head.next;

	}
	
	public void insertMiddle(int data, int actual) {

		Node currentNode = head;
		while (currentNode.next != null) {
			if (currentNode.data == data) {
				Node newNode = new Node();
				newNode.data = actual;
				newNode.next = currentNode.next;
				currentNode.next = newNode;
				break;
			}
			currentNode = currentNode.next;
		}
	}

 
	public void deleteAtMiddle(int actual) {

		Node currentNode = head;
		Node previousNode = null;

		while (currentNode.next != null) {
			previousNode = currentNode;
			if (currentNode.next.data == actual) {
				previousNode.next = currentNode.next.next;
				break;
			}
			currentNode = currentNode.next;
		}
	}

	public void deleteLast() {

		Node currentNode = head;
		Node previousNode = null;

		while (currentNode.next != null) {
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		if (currentNode.next == null) {
			previousNode.next = null;
		}

	}

 // For printing Linked List
 public void printLinkedList() {
  System.out.println("Printing LinkedList (head --> last) ");
  StringBuilder b=new StringBuilder();
  Node current = head;
  while (current != null) {
  // current.displayNodeData();
	 
	 b.append(current.data).append(" -> ");
   current = current.next;
  }
b.append("null");
  System.out.println(b.toString());
 }
}
