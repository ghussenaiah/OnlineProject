
package com.link.geekforgeek;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class InsertingAlternatePositions {
	
	public static void main(String args[])
	{
		/*LinkedList test=new LinkedList();
		test.insertLast(4);
		test.insertLast(5);
	
		
		test.insertLast1(2);
		
		test.insertLast1(6);
		test.insertLast1(6);
		test.insertAlternatePosition();
	
		//test.printLinkedList();
*/		
		
		Date testing =  new Date(System.currentTimeMillis()+30*24*60*60*1000);
		 
		 Date ttt=new Date();
		 
		String dateFormatString = "dd/MM/yyyy";
		 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 String tt =dateFormat.format(ttt);
	
		System.out.println(ttt);
		System.out.println(testing);
		 String pr =dateFormat.format(testing);
		
		int count =getWorkingDaysBetweenTwoDates(ttt,testing);
		System.out.println(count);
	}
	public static int getWorkingDaysBetweenTwoDates(Date startDate, Date endDate) {
	    Calendar startCal = Calendar.getInstance();
	    startCal.setTime(startDate);        

	    Calendar endCal = Calendar.getInstance();
	    endCal.setTime(endDate);

	    int workDays = 0;

	    //Return 0 if start and end are the same
	    if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {
	        return 0;
	    }

	    if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
	        startCal.setTime(endDate);
	        endCal.setTime(startDate);
	    }

	    do {
	       //excluding start date
	        startCal.add(Calendar.DAY_OF_MONTH, 1);
	        if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
	            ++workDays;
	        }
	    } while (startCal.getTimeInMillis() < endCal.getTimeInMillis()); //excluding end date

	    return workDays;
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
		while(test.next!=null)
		{
			if(i%2==0)
			{
				Node newNode=new Node();
				while(head12.next!=null)
				{
					newNode.data=head12.data;
					newNode.next=test.next;
					test=newNode;
					head12=head12.next;
					break;
				}
			}
			test=test.next;
			i++;
		}
		StringBuilder b = new StringBuilder();
		Node current = test;
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

	


