package test.linkedlist;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import practice.linkedlist.Queue;

public class QueueTest {

	Queue<Integer> queue;
	@Before
	public void setup() {
		queue = new Queue<Integer>();
	}
	
	@Test
	public void enqueue() {
		int size = queue.size();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		assertEquals(size + 3, queue.size());
	}
	
	@Test
	public void dequeue () {
		int size = queue.size();
		
		try{
			queue.dequeue();
			assertEquals(size - 1, queue.size());
		} catch(Exception e) {
			assertEquals(0, size);
		}
	}
	
	@After
	public void teardown() {
		queue = null;
	}
}
