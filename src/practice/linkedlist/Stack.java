package practice.linkedlist;

public class Stack<T> {
	
	private Node first;
	int size = 0;
	
	private class Node 
	{
		T item;
		Node next;
	}
	
	public void push(T item)
	{
		if (isEmpty()) {
			first = new Node();
			first.item = item;
			first.next = null;
		} else {
			Node oldFirst = first;
			first = new Node();
			first.item = item;
			first.next = oldFirst;
		}
		size++;
	}

	public T pop() {
		if (isEmpty()) {
			System.out.println("stack empty");
			return null;
		} else {
			T item = first.item;
			first = first.next;
			size--;
			return item;		
		}
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public int size() {
		return size;
	}
	
}
