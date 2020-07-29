package linkedlists;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromUnsortedLinkedList {

	public static void main(String[] args) {

		LinkedListNode headNode = intializeLinkedList();
		printLinkedList(headNode);
		System.out.println();
		printLinkedList(removeDuplicatesFromLinkedList(headNode));
		System.out.println();
		LinkedListNode headNode2 = intializeLinkedList();
		printLinkedList(removeDuplicatesFromLinkedListWithoutHashTable(headNode2));

	}


	private static void printLinkedList(LinkedListNode headNode) {
		LinkedListNode node = headNode;
		while(node != null){
			System.out.print(node.next != null ? node.data + " -> " : node.data);
			node = node.next;
		}
	}

	private static LinkedListNode removeDuplicatesFromLinkedList(LinkedListNode headNode) {
		LinkedListNode runnerNode = headNode;
		Set<Integer>  set = new HashSet<Integer>();
		set.add(runnerNode.data);

		while(runnerNode.next != null){
			if(!existsInSet(runnerNode.next.data, set)){
				set.add(runnerNode.next.data);
				runnerNode = runnerNode.next;
			}else{
				runnerNode.next = runnerNode.next.next;
			}
		}

		return headNode;
	}

	private static boolean existsInSet(int data, Set<Integer> set) {
		return set.contains(data);
	}

	private static LinkedListNode removeDuplicatesFromLinkedListWithoutHashTable(LinkedListNode headNode) {
		LinkedListNode currentNode = headNode;

		while( currentNode != null){
			LinkedListNode runnerNode = currentNode;
			
			while(runnerNode.next != null){
				if(runnerNode.next.data == currentNode.data){
					runnerNode.next = runnerNode.next.next;
				}else{
					runnerNode = runnerNode.next;
				}
			}
			currentNode = currentNode.next;
		}

		return headNode;
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
