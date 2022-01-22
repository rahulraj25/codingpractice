package practice.datastructure.linkedlists;

/**
 * */
public class SumOfTwoNumbersStoredAsLinkedList {

	public static void main(String[] args) {

		LinkedListNode headNode = LinkedListNode.intializeLinkedList(7,1,6);
		System.out.println(headNode.toString());
		
		LinkedListNode headNode2 = LinkedListNode.intializeLinkedList(5,9,2);
		System.out.println(headNode2.toString());
		
		System.out.println(sumOfLinkedLists(headNode, headNode2));
	}

	private static int sumOfLinkedLists(LinkedListNode list1, LinkedListNode list2) {
		int carry = 0;
		int num =0, digitSum=0, counter = 0;
		
		while(list1 != null || list2 != null){
			
			digitSum = list1.data + list2.data + carry;
			if(digitSum>9){
				carry = digitSum/10;
			}else{
				carry=0;
			}
			
			num = (((int)Math.pow(10, counter)) * (digitSum%10)) + num;
			counter++;
			list1 = list1.next;
			list2 = list2.next;
		}
		
		if(carry>0)
		num = (((int)Math.pow(10, counter)) * carry) + num;
		
		return num;
	}
	
}
