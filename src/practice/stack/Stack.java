package practice.stack;
import java.util.List;
import java.util.ArrayList;

public class Stack<T> {
	List <T> list;
	
	public Stack() {
		list = new ArrayList<T>();
	}
	
	public void push(T element) {
		list.add(element);
	}
	
	public T pop() {
		if (list.size() <= 0) {
			System.out.println("list empty");
			return null;
		}
		return list.remove(list.size() - 1);
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
	
}
