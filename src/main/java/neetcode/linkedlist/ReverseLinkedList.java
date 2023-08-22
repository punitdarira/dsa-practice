package neetcode.linkedlist;

import ztm.LinkedList;
import ztm.LinkedList.Node;
public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList(1);
		linkedList.append(2);
		linkedList.append(3);
		linkedList.append(4);
		Node root = linkedList.append(5);
		System.out.println(root);
		
		System.out.println(reverseList(root));
		
		
		

	}
	
	public static Node reverseList(Node root) {
		Node prev = null;
		while(root != null) {
			Node temp = root.nextNode;
			root.nextNode = prev;
			prev = root;
			root = temp;
		}
		return prev;
	}

}
