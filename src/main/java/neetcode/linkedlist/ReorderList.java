package neetcode.linkedlist;

import ztm.LinkedList;
import ztm.LinkedList.Node;

public class ReorderList {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList(1);
		linkedList.append(2);
		linkedList.append(3);
		linkedList.append(4);
		linkedList.append(5);
		linkedList.append(6);
		linkedList.append(7);
		linkedList.append(8);
		Node root = linkedList.append(9);
		
		System.out.println(root);
		int midLength = -1;
		Node midPointer = root;
		Node fastPointer = root;
		
		while(fastPointer != null) {
			midLength++;
			midPointer = midPointer.nextNode;
			fastPointer = fastPointer.nextNode;
			if(fastPointer != null) {
				fastPointer = fastPointer.nextNode;
			}
			
		}
		
		Node secondList = midPointer;
		System.out.println(secondList);
		
		secondList = ReverseLinkedList.reverseList(secondList);
		
		System.out.println(secondList);
		
		int i = 0;
		while(i<=midLength || secondList!= null) {
			if(i<= midLength) {
				System.out.println(root.getValue());
				i++;
				root = root.nextNode;
			}
			if(secondList != null) {
				System.out.println(secondList.getValue());
				secondList = secondList.nextNode;
			}
		}
	}

}
