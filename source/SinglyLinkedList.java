public class SinglyLinkedList<E> {
	private class Node<E> {
		private E element;
		private Node<E> next;
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
		public E getElement() {return element;}
		public void setNext(Node<E> n) {next = n;}
		public Node<E> getNext() {return next;}
	}
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	public int size() {return size;}
	public boolean isEmpty() {return size == 0;}
	public E first() {
		if (isEmpty()) return null;
		return head.getElement();
	}
	public E last() {
		if (isEmpty()) return null;
		return tail.getElement();
	}
	public void addFirst(E e) {
		head = new Node<E>(e, head);
		size++;
		if (size == 1) tail = head;
	}
	public void addLast(E e) {
		if (size == 0) {
			head = new Node<E>(e, null);
			tail = head;
			size++;
		}
		else {
			tail.setNext(new Node<E>(e, null));
			size++;
			tail = tail.getNext();
		}	
	}
	public void removeFirst() {
		if (!isEmpty()) {
			head = head.getNext();
			size--;
			if (size == 0) tail = null;
		}
	}
	public void print() {
		Node<E> tmp = head;
		while (tmp != null) {
			System.out.println(tmp.getElement());
			tmp = tmp.getNext();
		}
	}
}