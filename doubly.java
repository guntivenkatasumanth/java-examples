package doublylinkedlist;

public class doubly {
	Node head;
	int size;
	Node tail;
	public int getsize() {
		return size;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public void addfront(student data) {
		Node node=new Node(data);
		if(isEmpty()) {
			tail=node;
		}
		else {
			head.setPrevious(node);
			node.setNext(head);
		}
		head=node;
		size++;
	}
	public void addlast(student data) {
		Node node=new Node(data);
		if(isEmpty()) {
			head=node;
		}
		else {
			tail.setNext(node);
			node.setPrevious(tail);	
		}
		tail=node;
		size++;
	}
	public Node removefront() {
		if(isEmpty()) {
			return null;
		}
		Node remove=head;
		if(head.getNext()==null) {
			tail=null;
		}else {
			head.getNext().setPrevious(null);
		}
		head=head.getNext();
		size--;
		remove.setNext(null);
		return remove;
	}
	public Node addlast(){
		if(isEmpty()) {
			return null;
		}
		Node remove=tail;
		if(tail.getPrevious()==null) {
			head=null;
		}
		else {
			tail.getPrevious().setNext(null);
			
		}
		tail=tail.getPrevious();
		size--;
		remove.setPrevious(null);
		return remove;
	}
	public void printall() {
		Node current=head;
		while(current!=null) {
			System.out.println(current);
			current=current.getNext();
		}
	}
	
	

}
