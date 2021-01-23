package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(23);
		s.push(20);
		s.push(63);
		s.push(67);
		s.push(100);
		s.push(201);
		
		System.out.println("List :" + s);
		System.out.println(s.pop());
		
		System.out.println("List :" + s);
		System.out.println(s.peek());
		System.out.println("List :" + s);
		s.push(190);
		System.out.println("List :" + s);



	}

}
