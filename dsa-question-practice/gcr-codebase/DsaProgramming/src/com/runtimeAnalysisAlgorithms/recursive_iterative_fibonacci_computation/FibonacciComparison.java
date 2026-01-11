package com.runtimeAnalysisAlgorithms.recursive_iterative_fibonacci_computation;

public class FibonacciComparison {

	    static int fibonacciRecursive(int n) {
	        if (n <= 1)
	            return n;

	        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	    }

	    static int fibonacciIterative(int n) {
	        if (n <= 1)
	            return n;

	        int a = 0, b = 1, sum = 0;

	        for (int i = 2; i <= n; i++) {
	            sum = a + b;
	            a = b;
	            b = sum;
	        }
	        return b;
	    }

	    public static void main(String[] args) {

	        int n = 25;   
	        long start, end;

	        // using Recursive
	        start = System.currentTimeMillis();
	        int rec = fibonacciRecursive(n);
	        end = System.currentTimeMillis();
	        System.out.println("Recursive Fibonacci(" + n + ") = " + rec);
	        System.out.println("Recursive time take: " + (end - start) + " ms");

	        // using Iterative
	        start = System.currentTimeMillis();
	        int itr = fibonacciIterative(n);
	        end = System.currentTimeMillis();
	        System.out.println("Iterative Fibonacci(" + n + ") = " + itr);
	        System.out.println("Iterative time take: " + (end - start) + " ms");
	    }
	}


