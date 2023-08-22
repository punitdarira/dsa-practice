package neetcode.linkedlist;

import java.util.HashMap;

public class CopyListWithRamdomPointer {

	public static void main(String[] args) {
		HashMap<LinkedListWithRandomPointer.Node, LinkedListWithRandomPointer.Node> map = new HashMap<>();
		LinkedListWithRandomPointer linkedList = new LinkedListWithRandomPointer(1);
		LinkedListWithRandomPointer.Node firstNode = linkedList.node;
		LinkedListWithRandomPointer.Node secondNode = linkedList.append(2);
		LinkedListWithRandomPointer.Node thirdNode = linkedList.append(3);
		LinkedListWithRandomPointer.Node fourthNode = linkedList.append(4);
		LinkedListWithRandomPointer.Node fifthNode = linkedList.append(5);

		firstNode.setRandom(thirdNode);
		secondNode.setRandom(firstNode);
		thirdNode.setRandom(fifthNode);
		fourthNode.setRandom(secondNode);
		fifthNode.setRandom(fourthNode);

		LinkedListWithRandomPointer.Node clonedNode = clone(firstNode, map);
		
		System.out.println(firstNode);
		System.out.println(clonedNode);
		
		LinkedListWithRandomPointer.Node firstNodeBackup = firstNode;
		LinkedListWithRandomPointer.Node clonedNodeBackup = clonedNode;
		while(firstNode!= null) {
			//System.out.println("Random = "+ map.get(firstNode.random));
			clonedNode.setRandom(map.get(firstNode.random));
			clonedNode = clonedNode.nextNode;
			firstNode = firstNode.nextNode;
		}
		System.out.println(firstNodeBackup);
		System.out.println(clonedNodeBackup);
	}

	private static LinkedListWithRandomPointer.Node clone(LinkedListWithRandomPointer.Node rootNode, HashMap<LinkedListWithRandomPointer.Node, LinkedListWithRandomPointer.Node> map) {
		LinkedListWithRandomPointer clonedList = new LinkedListWithRandomPointer(rootNode.value);
		map.put(rootNode, clonedList.node);
		
		rootNode = rootNode.nextNode;
		LinkedListWithRandomPointer.Node clonedRootNode = clonedList.node;

		while (rootNode != null) {
			map.put(rootNode, clonedList.append(rootNode.value));
			rootNode = rootNode.nextNode;
		}
		
		System.out.println("map-");
		System.out.println(map);
		return clonedRootNode;
	}

	public static class LinkedListWithRandomPointer {
		Node node;

		public class Node implements Cloneable {
			public Node(int value) {
				this.value = value;
			}

			public Node(int value, Node nextNode) {
				this.value = value;
				this.nextNode = nextNode;
			}

			int value;
			public Node nextNode;
			public Node random;

			@Override
			public String toString() {
				return "Node [value=" + value + ", nextNode=" + nextNode + ", random=" + (random!=null?random.value:null) + "]";
				//return "Node [value=" + value + ", nextNode=" + nextNode + ", random=" + (random!=null?random.value:null) + "]";
			}

			public Node getNextNode() {
				return nextNode;
			}

			public void setNextNode(Node nextNode) {
				this.nextNode = nextNode;
			}

			public int getValue() {
				return value;
			}

			public void setRandom(Node random) {
				this.random = random;
			}

			public Node clone() {
				Node clonedNode = new Node(value, nextNode != null ? nextNode.clone() : null);
				return clonedNode;
			}
		}

		public LinkedListWithRandomPointer(int value) {
			this.node = new Node(value);
		}

		public Node append(int value) {
			Node lastNode = getLastNode(node);
			lastNode.nextNode = new Node(value);
			return lastNode.nextNode;
		}

		private LinkedListWithRandomPointer.Node getLastNode(Node node) {
			if (node.nextNode != null) {
				Node nextNode = getLastNode(node.nextNode);
				return nextNode;
			}
			return node;

		}

		@Override
		public String toString() {
			return "LinkedList [node=" + node + "]";
		}

	}

}
