package ztm;

public class LinkedList {
	Node node;

	public class Node implements Cloneable{
		public Node(int value) {
			this.value = value;
		}
		public Node(int value, Node nextNode) {
			this.value = value;
			this.nextNode = nextNode;
		}

		int value;
		public Node nextNode;

		@Override
		public String toString() {
			return "Node [value=" + value + ", nextNode=" + nextNode + "]";
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
		
		public Node clone() {
			Node clonedNode = new Node(value, nextNode != null ?nextNode.clone():null);
			return clonedNode;
		}
	}

	public LinkedList(int value) {
		this.node = new Node(value);
	}

	public Node append(int value) {
		Node lastNode = getLastNode(node);
		lastNode.nextNode = new Node(value);
		return node;
	}

	private LinkedList.Node getLastNode(Node node) {
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
