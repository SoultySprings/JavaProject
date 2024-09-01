package sts302p;

import java.util.*;
class Mystack {
	Stack<Integer> s;
	Stack<Integer> a;
	Mystack(){
		s = new Stack<Integer>();
		a = new Stack<Integer>();
	}
	void getMin() {
		if(a.isEmpty()) 
			System.out.println("Stack is empty");
		else
			System.out.println("Minimum elemnt : " + a.peek());
	}
	void peek() {
		if(s.isEmpty()){
			System.out.println("Stack is empty");
			return;
		}
		int t = s.peek();
		System.out.println("Top most element is : " + t);
	}
	void pop() {
		int t = s.pop();
		if(s.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		} else
			System.out.println("Removed element is :  " + t);
		if(t==a.peek()) {
			a.pop();
		}
	}
	void push(int x) {
		if(s.isEmpty()) {
			s.push(x);
			a.push(x);
			System.out.println("Number inserted : " + x);
			return;
		} else {
			s.push(x);
			System.out.println("Number inserted : " + x);
		}
		if(x<=a.peek()) {
			a.push(x);
		}
	}
}
public class minimumstack {
	public static void main(String[] args) {
		Mystack s = new Mystack(); 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			int m = sc.nextInt();
			s.push(m);
		}
		s.getMin();
	}
}
