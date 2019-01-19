package cse.testcases;

public class SumOfTwoLinkedLists {
	
	public static void main(String args[])
	{
		LinkedList31 test=new LinkedList31();
		test.insertLast(4);
		test.insertLast(5);
		test.insertLast(8);
		test.insertLast(7);
		
		test.insertLast1(2);
		
		test.insertLast1(6);
		test.insertLast1(6);
		
		test.addingTwoLists();
		test.printLinkedList();
		
	}
	}
class Node12 {
	public int data;
	public Node12 next;
}




class LinkedList31 {
	public Node12 head;
	public Node12 head1;
	public Node12 head2;
	public Node12 head3;
	
	int carry=0;
	int sum=0;
	int i=2;
	int diff=0;
	int tt=1;
	
	LinkedList31()
	{
		head=null;
		head1=null;
	}
// used to insert a node at the start of linked list
	public void insertLast(int data) {
		Node12 newNode = new Node12();
		newNode.data = data;
		if (head == null) {
			head = newNode;
		} else {
			Node12 currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			Node12 newNode1 = new Node12();
			newNode1.data = data;
			newNode1.next = null;
			currentNode.next = newNode1;
		}
	}

	public void insertLast1(int data) {
		Node12 newNode = new Node12();
		newNode.data = data;
		if (head1 == null) {
			head1 = newNode;
		} else {
			Node12 currentNode = head1;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			Node12 newNode1 = new Node12();
			newNode1.data = data;
			newNode1.next = null;
			currentNode.next = newNode1;
		}
	}
	
	public void insertLast2(int data) {
		Node12 newNode = new Node12();
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
		Node12 current = head2;
		while (current != null) {
			// current.displayNodeData();
			b.append(current.data).append(" -> ");
			current = current.next;
		}
		b.append("null");
		System.out.println(b.toString());
	}

	public void addingTwoLists() {
		
		int first=checkTwoListHaveingSameSize(head);
		int second=checkTwoListHaveingSameSize(head1);
		if(first==second){
		add(head, head1);
		}
		else{
			if(first<second)
			{
			int diff1=second-first;
			 diff=second-first;
			 while(diff1>0)
			 {
				 diff1--;
				 head3=head1.next;
				 head3=head3.next;
			 }
			 add(head3.next,head);
			addsingleHeader(head1);
				
			}
			else
			{
				int diff1=first-second;
				diff=first-second;
				 while(diff1>0)
				 {
					 diff1--;
					 head3=head.next;
					 head3=head3.next;
					 
				 }
				 add(head3.next,head1);
				 addsingleHeader(head);
					
			}
		}
		if (carry != 0) {
			insertLast2(carry);
		}
		
		

	}

	private void addsingleHeader(Node12 headd) {
	
		if(diff>1){
			diff--;
			
		addsingleHeader(headd.next);}
		sum=headd.data+carry;
		carry = sum / 10;
		sum = sum % 10;
		insertLast2(sum);
	}
	private int checkTwoListHaveingSameSize(Node12 test) {
	    tt=1;
		while(test.next!=null)
		{
			tt++;
			test=test.next;
			
		}
		return tt;
	}
	private void add(Node12 head, Node12 head1) {

		if (head.next != null && head1.next != null) {
			add(head.next, head1.next);
		}
		sum = head.data + head1.data + carry;
		carry = sum / 10;
		sum = sum % 10;
		insertLast2(sum);

	}
}

	

