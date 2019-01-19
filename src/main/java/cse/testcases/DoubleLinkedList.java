package cse.testcases;

import java.io.IOException;
import java.util.Scanner;

class DNode {
	public int data;
	public DNode previous;
	public DNode next;
}


class DoubleLinked {
	private DNode head;
	/*public boolean isEmpty() {
		return (head == null);
	}*/
	DoubleLinked()
	{
		head=null;
	}
	
	public void insertFirst(int data) {
		DNode node = new DNode();
		if (head == null) {
			node.data = data;
			head = node;
		} else {
			node.data = data;
			node.next = head;					//Node Next
			node.previous = null;               //Node previous
			head.previous = node;              	//Head previous
			head = node;						//Head Next
		}
	}
	public void insertLast(int data) {
		DNode node = new DNode();
		DNode CurrentNode=head;
		while(CurrentNode.next != null) {
			CurrentNode=CurrentNode.next;
		} 
			node.data = data;               
			node.next = null;               //Node Next
			node.previous = CurrentNode;    //Node previous
			CurrentNode.next = node;        //Current Next
		
	}
	
	public void insertMiddle(int data,int actual) {
		
		DNode currentNode = head;
		while (currentNode.next != null) {
			if (currentNode.data == data) {
				DNode newNode = new DNode();
				newNode.data = actual;
				newNode.next = currentNode.next;        //Node Next
				newNode.previous=currentNode;	       	//Node Previous
				DNode currentNod= currentNode.next ;   	//Get next Node
				currentNod.previous=newNode;            //put new node to left of that Node
				currentNode.next = newNode;             //Current Next
				
				break;
			}
			currentNode = currentNode.next;
		}
		
	}
	public void deleteAtFirst() {
	
		head=head.next;
		head.previous=null;
		
	}
	public void deleteAtLast() {
		
		DNode currentNode = head;
		DNode previousNode = null;
		while (currentNode.next != null) {
			previousNode=currentNode;
			currentNode = currentNode.next;
		}
		previousNode.next=null;
		currentNode.previous=null;
		
	}
	
	public void deleteAtMiddle(int data) {
		
		DNode currentNode = head;
		DNode previousNode = null;

		while (currentNode.next != null) {
			previousNode = currentNode;
			if (currentNode.next.data == data) {
				previousNode.next = currentNode.next.next;
				DNode referenecNode = currentNode.next;
				referenecNode.previous=previousNode;
				break;
			}
			currentNode = currentNode.next;
		}
		
	}
	 public void printLinkedList() {
		  System.out.println("Printing LinkedList (head --> last) ");
		  StringBuilder b=new StringBuilder();
		  StringBuilder c=new StringBuilder();
		  DNode current = head;
		  while (current.next!=null) {
		  // current.displayNodeData();
			 
			 b.append(current.data).append(" -> ");
		   current = current.next;
		  }
		  b.append(current.data).append(" -> ");
		 b.append("null");
		  System.out.println(b.toString());
		  System.out.println("Printing LinkedList (last --> head) ");
		  
		  while (current.previous!=null) {
			  // current.displayNodeData();
				 
				 c.append(current.data).append(" -> ");
			   current = current.previous;
			  }
		  c.append(current.data).append(" -> ");
		  c.append("null");
		  System.out.println(c.toString());
		 }
	
}

public class DoubleLinkedList {
	
	public static void main(String args[]){

	DoubleLinked myLinkedlist = new DoubleLinked();
	myLinkedlist.insertFirst(100);
	myLinkedlist.insertFirst(101);
	myLinkedlist.insertFirst(102);
	myLinkedlist.insertFirst(103);
	myLinkedlist.insertFirst(104);
	myLinkedlist.insertFirst(105);
	
	myLinkedlist.insertLast(200);
	
	
	myLinkedlist.insertMiddle(102,1000);
	myLinkedlist.insertMiddle(1000,2000);
	myLinkedlist.insertMiddle(103,999);
	
	/*
	myLinkedlist.deleteAtFirst();
	myLinkedlist.deleteAtFirst();
	myLinkedlist.deleteAtFirst();*/
	
	/*myLinkedlist.deleteAtLast();
	myLinkedlist.deleteAtLast();
	myLinkedlist.deleteAtLast();
	*/
	
	/*myLinkedlist.deleteAtMiddle(1000);
	myLinkedlist.deleteAtMiddle(999);
	myLinkedlist.deleteAtMiddle(102);*/
	/*myLinkedlist.deleteAtMiddle();
	myLinkedlist.deleteAtMiddle();
	*/
	
	myLinkedlist.printLinkedList();
				//Scanner kbEntry = new Scanner(System.in);
	 
	         //  Menu();
	
	   /*   
		char menuOptions;

		do {

			System.out.println("'1' - insertFirst ");

			System.out.println("'2' - insertmiddle");

			System.out.println("'3' - insertLast");

			System.out.println("'4' - deleteAtFirst");

			System.out.println("'5' - deleteAtMiddle ");

			System.out.println("'6' - deleteAtLast ");

			System.out.println("'q' - Quit:\n");

			String input = kbEntry.next();

			menuOptions = input.charAt(0);

			switch (menuOptions) {

			case '1':

				// Picture aPicture;

				System.out.println("Enter the value of node: ");

				int x = kbEntry.nextInt();

				myLinkedlist.insertFirst(x);
				myLinkedlist.printLinkedList();

				break;

			case '2':

				System.out.println("Enter the value of position: ");
				System.out.println("Enter the value of node value: ");

				int y = kbEntry.nextInt();
				int c = kbEntry.nextInt();

				myLinkedlist.insertMiddle(y, c);
				myLinkedlist.printLinkedList();

				break;

			case '3':

				System.out.println("Enter the value of node: ");

				int m = kbEntry.nextInt();

				myLinkedlist.insertLast(m);
				myLinkedlist.printLinkedList();

				break;

			case '4':

				myLinkedlist.deleteAtFirst();
				myLinkedlist.printLinkedList();

				break;

			case '5':
				System.out.println("Enter the value of node to delete: ");

				int d = kbEntry.nextInt();

				myLinkedlist.deleteAtMiddle(d);
				myLinkedlist.printLinkedList();

				break;

			case '6':

				myLinkedlist.deleteAtLast();
				myLinkedlist.printLinkedList();

				break;

			case 'q':

				break;

			default:
				System.out.println("You Entered wrong menuOption");

			}

		} while (menuOptions != 'q');*/
	
	
	}
}
