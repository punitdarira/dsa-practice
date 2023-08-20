package neetcode.stack;

class Element {
	int value;
	Element nextElement;
	public Element(int value) {
		this.value = value;
	}
	public void setNextElement(Element element) {
		nextElement = element;
	}
	public Element getNextElement() {
		return nextElement;
	}
	public int getValue() {
		return value;
	}
	
}
public class MinStack {
	Element topElement;
	
	public MinStack() {
		//topElement = new Element();
	}
	
	public void push(int val) {
		Element newTopElement = new Element(val);
		newTopElement.setNextElement(topElement);
		topElement = newTopElement;
    }
    
    public void pop() {
        topElement = topElement.getNextElement();
    }
    
    public int top() {
       return topElement.getValue();
    }
    
    public int getMin() {
        return 0;
    }
	
	
	
	
//make our own stack. We can do that using linkedlist or just making a custom class
	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(1);
		minStack.push(2);
		minStack.push(3);
		minStack.push(4);
		System.out.println(minStack.top());
		minStack.pop();
		System.out.println(minStack.top());
	}
}
