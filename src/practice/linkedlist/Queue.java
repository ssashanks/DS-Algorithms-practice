package practice.linkedlist;

public class Queue<T> {
	
	private Node first = null; 
	private Node last = null; 
	private int size = 0;
	private class Node {
		public T value;
		Node next;	
	}
	
	public void enqueue(T item) {
		
		Node node = new Node();
		node.value = item;
		
		if(last == null || first == null) {
			last = node;
			first = node;
		} else {
			last.next = node;
			last = node;
		}
		size ++;
		
	}

	public T dequeue() throws Exception {	
		if(first == null) {
			throw new Exception("Queue empty");
		}
		T item = first.value;
		first = first.next;
		size --;
		return item;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(first == null) {
			return true;
		}
		return false;
	}
	
}
