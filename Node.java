package doublylinkedlist;

public class Node {
	Node next;
	Node previous;
	student data;
	public Node(student data) {
		super();
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	public student getData() {
		return data;
	}
	public void setData(student data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return data.toString();
	}


}
