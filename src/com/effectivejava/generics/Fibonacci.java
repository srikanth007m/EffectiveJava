package com.effectivejava.generics;

public class Fibonacci implements Generator<Integer> {
	private int count = 1;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		for (int i = 0; i < 10; i++) {
			System.out.println(f.next());
		}
	}

	@Override
	public Integer next() {
		return fib(count++);
	}
	
	private int fib(int n) {
		if (n < 2) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}
}
