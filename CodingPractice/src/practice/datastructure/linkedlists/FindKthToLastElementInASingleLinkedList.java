package ctci.linkedlists;

/**
 * Find kth to last element
 * if user inputs 1 it means return last element in the linked list
 * if user inputs 2 it means return second last element in the linked list
 * if user inputs 5 it means return fifth last element in the linked list
 * Assumption: user will input valid values
 * */
public class FindKthToLastElementInASingleLinkedList {

	public static void main(String[] args) {

		LinkedListNode headNode = intializeLinkedList();
		System.out.println(headNode.toString());

		//k=2
		System.out.println(findKthToLastElementUsingRecursion(headNode,2).data);
		//k=1
		System.out.println(findKthToLastElementUsingRecursion(headNode,1).data);
		//k=5
		System.out.println(findKthToLastElementUsingRecursion(headNode,5).data);

		//Without using recursion is better in time complexity
		//k=2
		System.out.println(findKthToLastElementWithoutUsingRecursion(headNode,2).data);
		//k=1
		System.out.println(findKthToLastElementWithoutUsingRecursion(headNode,1).data);
		//k=5
		System.out.println(findKthToLastElementWithoutUsingRecursion(headNode,5).data);
	}

	private static LinkedListNode findKthToLastElementUsingRecursion(LinkedListNode headNode, int k) {
		Index index = new Index();
		index.idx = 0;
		return findKthToLastElementUsingRecursion(headNode, k, index);
	}

	private static LinkedListNode findKthToLastElementUsingRecursion(LinkedListNode headNode, int k, Index index) {
		if(headNode == null){
			return null;
		}

		LinkedListNode node = findKthToLastElementUsingRecursion(headNode.next, k, index);
		index.idx = index.idx + 1 ;

		if(index.idx == k){
			return headNode;
		}
		return node;
	}
	
	private static LinkedListNode findKthToLastElementWithoutUsingRecursion(LinkedListNode headNode, int k) {
		LinkedListNode firstPointer = headNode;
		LinkedListNode secondPointer = headNode;
		int counter = 0;
		
		//move first Pointer k elements deep into linked List
		while(counter != k){
		 firstPointer = firstPointer.next;
		 counter++;
		}
		
		//when firstPointer reaches last, second pointer will be k elements from last
		while(firstPointer != null){
			firstPointer = firstPointer.next;
			secondPointer = secondPointer.next;
		}
		
		return secondPointer;
	}
	
	

	private static LinkedListNode intializeLinkedList() {
		LinkedListNode node1 = new LinkedListNode(5,null);
		LinkedListNode node2 = new LinkedListNode(1,null);
		node1.next = node2;
		LinkedListNode node3 = new LinkedListNode(2,null);
		node2.next = node3;
		LinkedListNode node4 = new LinkedListNode(9,null);
		node3.next = node4;
		LinkedListNode node5 = new LinkedListNode(4,null);
		node4.next = node5;
		LinkedListNode node6 = new LinkedListNode(5,null);
		node5.next = node6;
		LinkedListNode node7 = new LinkedListNode(3,null);
		node6.next = node7;
		LinkedListNode node8 = new LinkedListNode(1,null);
		node7.next = node8;

		return node1;
	}
}

class Index {
	int idx;
}
