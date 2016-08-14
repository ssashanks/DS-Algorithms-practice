package practice.bag;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Bag<T> implements Iterable<T> {
	List<T> list;
	public Bag() {
		list = new ArrayList<T>();
	}
	
	public void add(T element) {
		list.add(element);
	}
	
	public int size() {
		return list.size();
	}
	
	public void addAll(List<T> elements) {
		for(T element: elements) {
			list.add(element);
		}
	}
	
	public Set<T> uniqueSet() {
		Set<T> set = new HashSet<T>();
		for(T element: list) {
			set.add(element);
		}
		return set;
	}
	
	public boolean contains(T element) {
		for(T listElement: list) {
			if(listElement.equals(element)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(list.size() == 0) {
			return true;
		} 
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public T[] toArray() {
		return (T[]) list.toArray();
	}
	
	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
}
