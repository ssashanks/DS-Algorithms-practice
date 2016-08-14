package practice.queue;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
	
	List<T> list;
	
	public Queue() {
		list = new ArrayList<T>();
	}
	
	public void enqueue(T element) {
		list.add(element);
	}
	
	public T dequeue() {
		if (list.size() == 0) {
			System.out.println("Queue empty!!!");
			return null;
		}
		return list.remove(0);
	}
	
	public int size() {
		return list.size();
	}
	
	public boolean isEmpty() {
		if (list.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
}
