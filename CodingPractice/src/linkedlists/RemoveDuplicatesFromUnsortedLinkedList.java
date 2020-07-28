package linkedlists;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromUnsortedLinkedList {

	public static void main(String[] args) {

		Node headNode = intializeLinkedList();
		printLinkedList(headNode);
		System.out.println();
		printLinkedList(removeDuplicatesFromLinkedList(headNode));
		System.out.println();
		Node headNode2 = intializeLinkedList();
		printLinkedList(removeDuplicatesFromLinkedListWithoutHashTable(headNode2));

	}


	private static void printLinkedList(Node headNode) {
		Node node = headNode;
		while(node != null){
			System.out.print(node.next != null ? node.data + " -> " : node.data);
			node = node.next;
		}
	}

	private static Node removeDuplicatesFromLinkedList(Node headNode) {
		Node runnerNode = headNode;
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

	private static Node removeDuplicatesFromLinkedListWithoutHashTable(Node headNode) {
		Node currentNode = headNode;

		while( currentNode != null){
			Node runnerNode = currentNode;
			
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

	private static Node intializeLinkedList() {
		Node node1 = new Node(5,null);
		Node node2 = new Node(1,null);
		node1.next = node2;
		Node node3 = new Node(2,null);
		node2.next = node3;
		Node node4 = new Node(9,null);
		node3.next = node4;
		Node node5 = new Node(4,null);
		node4.next = node5;
		Node node6 = new Node(5,null);
		node5.next = node6;
		Node node7 = new Node(3,null);
		node6.next = node7;
		Node node8 = new Node(1,null);
		node7.next = node8;

		return node1;
	}
}
