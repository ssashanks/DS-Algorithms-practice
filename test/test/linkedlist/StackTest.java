package test.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import practice.linkedlist.Stack;

public class StackTest {
	
	Stack<Integer> stack;
	@Before
	public void setup() {
		stack = new Stack<Integer>();
	}
	
	@Test
	public void push() {
		int size = stack.size();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(size + 3, stack.size());
	}
	
	@Test
	public void pop () {
		int size = stack.size();
		stack.push(5);
		
		assertEquals(5, stack.pop().intValue());
	}
	
	@After
	public void teardown() {
		stack = null;
	}
}
