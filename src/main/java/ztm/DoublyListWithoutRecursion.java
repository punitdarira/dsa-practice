package ztm;

public class DoublyListWithoutRecursion {
	Node head;
	Node tail;
	int size;
	
	public class Node{
		int value;
		Node nextNode;
		Node previousNode;
		
		public Node(int value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return "Node [value=" + value + ", nextNode=" + nextNode + "]";
		}

	}
	
	public DoublyListWithoutRecursion(int value) {
		this.head = new Node(value);
		tail = head;
		size = 1;
	}
	public void append(int value) {
		Node node = new Node(value);
		node.previousNode = tail;
		this.tail.nextNode = node;
		this.tail = node;
		size++;
	}
	
	public void prepend(int value) {
		Node newHead = new Node(value);
		newHead.nextNode = head;
		head = newHead;
		size++;
		
	}
	
	public void insert(int index, int value) {
		//1 => head.next = newNode
		//2 =>head.next.next = newNode
		if(index == 1) {
			Node tempNode = head.nextNode;
			Node newNode = new Node(value);
			newNode.nextNode = tempNode;
			head.nextNode = newNode;
		}
		else if(index > 1) {
			Node nodeToEdit = head;
			for(int i = 0; i < index -1 ; i++) {
				nodeToEdit = nodeToEdit.nextNode;
			}
			Node tempNode = nodeToEdit.nextNode;
			Node newNode = new Node(value);
			newNode.nextNode = tempNode;
			nodeToEdit.nextNode = newNode;
		}
		size++;
	}
	@Override
	public String toString() {
		return "LinkedListWithoutRecursion [head=" + head + ", tail=" + tail + ", size=" + size + "]";
	}

	
	
}


