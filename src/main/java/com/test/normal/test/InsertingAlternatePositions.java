package com.test.normal.test;



public class InsertingAlternatePositions {
	
	public static void main(String args[])
	{
		LinkedList test=new LinkedList();
		test.insertLast(4);
		test.insertLast(6);
		test.insertLast(8);
		test.insertLast(10);
	
		
		test.insertLast1(5);
		test.insertLast1(7);
		test.insertLast1(9);
		
		/*test.insertLast1(6);
		test.insertLast1(6);*/
		test.insertAlternatePosition();
	
		//test.printLinkedList();
		
	}
	}
class Node {
	public int data;
	public Node next;
}




class LinkedList {
	public Node head;
	public Node head1;
	public Node head2;
	LinkedList()
	{
		head=null;
		head1=null;
		head2=null;
	}
public void insertAlternatePosition() {
		insertAlternate(head,head1);
		
	}
	private void insertAlternate(Node head2, Node head12) {
	
		Node test=head2;
		int i=1;
		while(test!=null&&test.data!=0)
		{
			if(i%2==0)
			{
				Node newNode=new Node();
				while(head12!=null&&head12.data!=0)
				{
					Node next=null;
					Node previous=null;
					int j=i;
					Node gg=head;
					while(j>1)
					{
						j--;
						previous=gg;
						//head=head.next;
						gg=gg.next;
						
						
					}
					newNode.data=head12.data;
					newNode.next=gg;
					previous.next=newNode;
					//head=test11;
					head12=head12.next;
					test=head;
					break;
					
				}
			}
			test=test.next;
			i++;
		}
		StringBuilder b = new StringBuilder();
		Node current = head;
		while (current != null) {
			// current.displayNodeData();
			b.append(current.data).append(" -> ");
			current = current.next;
		}
		b.append("null");
		System.out.println(b.toString());
		
		//1->2->3->4->5   //6->8->7
	}
	// used to insert a node at the start of linked list
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
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
			currentNode.next = newNode1;
		}
	}

	public void insertLast1(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (head1 == null) {
			head1 = newNode;
		} else {
			Node currentNode = head1;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			Node newNode1 = new Node();
			newNode1.data = data;
			newNode1.next = null;
			currentNode.next = newNode1;
		}
	}
	
	public void insertLast2(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (head2 == null) {
			head2 = newNode;
		} else {
			newNode.next = head2;
			// newNode.next=head2.next; head2.next contains null then
			// newnode.next contains null
			head2 = newNode;
		}
	}

	public void printLinkedList() {
		System.out.println("Printing LinkedList (head --> last) ");
		StringBuilder b = new StringBuilder();
		Node current = head2;
		while (current != null) {
			// current.displayNodeData();
			b.append(current.data).append(" -> ");
			current = current.next;
		}
		b.append("null");
		System.out.println(b.toString());
	}

	
	
}

	


