package practice.linkedlist;

public class Stack<T> {
	
	private node first;
	int size = 0;
	
	private class node 
	{
		T item;
		node next;
	}
	
	public void push(T item)
	{
		node oldFirst = first;
		node first = new node();
		first.item = item;
		first.next = oldFirst;
		size++;
	}

	public T pop() {
		T item = first.item;
		first = first.next;
		return item;
	}
}
