package linkedlists;

/**
 * Delete any middle node except first and last node of a linked list
 * */
public class DeleteALinkedListNodeFromMiddle {

	public static void main(String[] args) {

		LinkedListNode headNode = intializeLinkedList();
		System.out.println(headNode.toString());
		
		deleteMiddleNode(headNode,5);
		System.out.println(headNode.toString());
		
		deleteMiddleNode(headNode,3);
		System.out.println(headNode.toString());
	}

	private static void deleteMiddleNode(LinkedListNode headNode, int i) {
		LinkedListNode nodeRunner = headNode;
		
		while(nodeRunner.next.data != i){
			nodeRunner = nodeRunner.next;
		}
		
		nodeRunner.next = nodeRunner.next.next;
	}

	private static LinkedListNode intializeLinkedList() {
		LinkedListNode node1 = new LinkedListNode(1,null);
		LinkedListNode node2 = new LinkedListNode(2,null);
		node1.next = node2;
		LinkedListNode node3 = new LinkedListNode(3,null);
		node2.next = node3;
		LinkedListNode node4 = new LinkedListNode(4,null);
		node3.next = node4;
		LinkedListNode node5 = new LinkedListNode(5,null);
		node4.next = node5;
		LinkedListNode node6 = new LinkedListNode(6,null);
		node5.next = node6;
		LinkedListNode node7 = new LinkedListNode(7,null);
		node6.next = node7;
		LinkedListNode node8 = new LinkedListNode(8,null);
		node7.next = node8;
		return node1;
	}
}
