package practice.datastructure.linkedlists;

import static practice.datastructure.linkedlists.LinkedListNode.intializeLinkedList;

public class ReverseALinkedList {

    public static void main(String[] args) {
        LinkedListNode headNode = intializeLinkedList(1,2,3,4,5,6,7);
        System.out.println(headNode);
        System.out.println(reverseList(headNode));
    }

    static LinkedListNode reverseList(LinkedListNode head)
    {
        LinkedListNode firstNode = null,secondNode = null, parserNode = null;
        if(head == null)
            return null;
        else if(head.next == null)
            return head;
        else{
            firstNode = head;
            secondNode = head.next;
            parserNode = secondNode;
            firstNode.next = null;

            while(parserNode != null){
                parserNode = parserNode.next;
                secondNode.next = firstNode;
                firstNode = secondNode;
                secondNode = parserNode;
            }

            return firstNode;
        }
    }
}
