package practice.morganstanley;

//LinkedList
//Insert begining
//1 -> 2 -> 3 -> 4 -> 5 -> 3
//1 -> 2 -> 3 -> 4 -> 5 -> null
//construct and detect a cycle
public class LinkedList {
	
	Node head;
	
	public void insertFront(Node node){
		node.next = head;
		head = node;
	}
	
	public static void main(String[] args) {
		LinkedList head = new LinkedList();
		
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		
		head.head = node1;
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node3;
		
		System.out.println(detectCycle(head.head));
	}

	private static boolean detectCycle(Node headNode) {
		
		Node fastPointer = headNode;
		Node slowPointer = headNode;
		boolean flag = false;
		//TODO: handle edge cases
		
		while(slowPointer != null && fastPointer != null && fastPointer.next != null){
				
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
			
				if(fastPointer == slowPointer){
					flag = true;
					break;
				}		
		}
		
		return flag;
	}

}

class Node {
	Node next;
	int data;
	
	public Node(int data) {
		super();
		this.data = data;
	}
	
	
}
