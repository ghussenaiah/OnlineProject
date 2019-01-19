package ExcelTest;

public class DetectAndRemove {

	public static void main(String args[])
	{
		LinkedListTest test=new LinkedListTest();
		test.insertLast(4);
		test.insertLast(6);
		test.insertLast(8);
		test.insertLast(10);
		test.insertLast(11);
		test.insertLast(12);
		test.lastcheck();
		NodeNode findNode=test.detectLoop();
		if(findNode!=null){
			
		}
	
		
	}
}


class NodeNode {
	public int data;
	public NodeNode next;
}




class LinkedListTest {
	public NodeNode head;
	
	LinkedListTest()
	{
		head=null;
	
	}

	public NodeNode detectLoop() {
		
		NodeNode first=head;
		NodeNode second=head;
		while(first!=null && second!=null && second.next!=null)
		{
			if(first==second)
				return first;
			else{
			first=first.next;
			second=second.next.next;
			}
			}
			return null;
		
	}

	public void lastcheck() {
		
		NodeNode currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = head.next.next;
	}

	public void insertLast(int data) {
		NodeNode newNode = new NodeNode();
		newNode.data = data;
		if (head == null) {
			head = newNode;
		} else {
			NodeNode currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			NodeNode newNode1 = new NodeNode();
			newNode1.data = data;
			newNode1.next = null;
			currentNode.next = newNode1;
		}
	}


	
	

	public void printLinkedList() {
		System.out.println("Printing LinkedList (head --> last) ");
		StringBuilder b = new StringBuilder();
		NodeNode current = head;
		while (current != null) {
			// current.displayNodeData();
			b.append(current.data).append(" -> ");
			current = current.next;
		}
		b.append("null");
		System.out.println(b.toString());
	}

	
	
}

	