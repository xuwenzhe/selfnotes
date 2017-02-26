public class CircularlyLinkedList<E> {
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
	private Node<E> tail = null;
	private int size = 0;
	public int size() {return size;}
	public boolean isEmpty() {return size == 0;}
	public E first() {
		if (isEmpty()) return null;
		return tail.getNext().getElement();
	}
	public E last() {
		if (isEmpty()) return null;
		return tail.getElement();
	}
	public void rotate() {
		if (!isEmpty()) tail = tail.getNext();
	}
	public void addFirst(E e) {
		if (isEmpty()) {
			tail = new Node<E>(e, null);
			tail.setNext(tail);
		}
		else tail.setNext(new Node<E>(e, tail.getNext()));
		size++;
	}
	public void addLast(E e) {
		addFirst(e);
		tail = tail.getNext();
	}
	public void removeFirst() {
		if (!isEmpty()) {
			if (size == 1) tail = null;
			else tail.setNext(tail.getNext().getNext());
			size--;
		}
	}
	public void print() {
		if (!isEmpty()) {
			if (size == 1)
				System.out.println(tail.getElement());
			else {
				Node<E> head = tail.getNext();
				while (head != tail) {
					System.out.println(head.getElement());
					head = head.getNext();
				}
				System.out.println(tail.getElement());
			}
		}
	}
}