package neetcode.linkedlist;

import ztm.LinkedList;
import ztm.LinkedList.Node;

public class RemoveNthNodeFromLast {

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

		int nthNode = 2;
		Node startNode = root;
		Node endNode = root;
		int i = 0;
		while (i <= nthNode + 1) {
			endNode = endNode.nextNode;
			i++;
		}
		System.out.print("EndNode");
		System.out.println(endNode);
		while(endNode != null) {
			endNode = endNode.nextNode;
			startNode = startNode.nextNode;
		}
		System.out.print("DeleteNextFrom");
		System.out.println(startNode);
		
		Node temp = startNode.nextNode;
		temp = temp.nextNode;
		startNode.nextNode = temp;
		System.out.println(root);	
	}
}
