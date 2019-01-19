package cse.testcases;


class Node1 {
	public int data;
	public Node1 next;
}

class AddingTwoList {
	private Node1 head;
	private Node1 head1;

	

 // used to insert a node at the start of linked list
	public void insertLast(int data) {
		Node1 newNode = new Node1();
		newNode.data = data;
		// newNode.next = head;
		if (head == null) {
			head = newNode;
		} else {
			Node1 currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			Node1 newNode1 = new Node1();
			newNode1.data = data;
			newNode1.next = null;
			currentNode.next = newNode1; // comple object to assign
											// currentNode.next is object type

		}
	}
	public void insertLast1(int data) {
		Node1 newNode = new Node1();
		newNode.data = data;
		// newNode.next = head;
		if (head1 == null) {
			head1 = newNode;
		} else {
			Node1 currentNode = head1;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			Node1 newNode1 = new Node1();
			newNode1.data = data;
			newNode1.next = null;
			currentNode.next = newNode1; // comple object to assign
											// currentNode.next is object type

		}
	}
 
	// For printing Linked List
	public void printLinkedList() {
		System.out.println("Printing LinkedList (head --> last) ");
		StringBuilder b=new StringBuilder();
		Node1 current = head;
		while (current != null) {
			// current.displayNodeData();
			b.append(current.data).append(" -> ");
			current = current.next;
		}
		b.append("null");
		System.out.println(b.toString());
	}
		public void addingTwoNumbers() {
			
			while(head!=null && head1!=null)
			{
				
			}
		
			
	}
		


}
public class AddTwoLists{
	public static void main(String args[])
	{
		AddingTwoList tt=new AddingTwoList();
		tt.insertLast(100);
		tt.insertLast(80);
		tt.insertLast(120);
		
		
		tt.insertLast1(5);
		tt.insertLast1(6);
		tt.insertLast1(7);
		
		
		tt.addingTwoNumbers();
		
	}

	
}


