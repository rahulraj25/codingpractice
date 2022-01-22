package practice.datastructure.linkedlists;

public class LinkedListNode {
	
	int data;
	LinkedListNode next;
	
	public LinkedListNode(int data, LinkedListNode next) {
		super();
		this.data = data;
		this.next = next;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public LinkedListNode getNext() {
		return next;
	}
	public void setNext(LinkedListNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		LinkedListNode nodeParser = this;
		String str = "";
		while(nodeParser.next != null){
			 str += nodeParser.data + " -> " ;
			 nodeParser = nodeParser.next;
		}
		str += nodeParser.data;
		return str;
	}
	
	public static LinkedListNode intializeLinkedList(Integer... nums) {
		LinkedListNode headNode = new LinkedListNode(nums[0],null);
		LinkedListNode tempNode = headNode;
		for (int i = 1; i < nums.length; i++) {
			LinkedListNode node = new LinkedListNode(nums[i],null);
			tempNode.next = node;
			tempNode = node;
		}
		return headNode;
	}
}
