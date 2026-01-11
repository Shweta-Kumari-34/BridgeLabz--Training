package com.runtimeAnalysisAlgorithms.string_concatenation_performance;

public class StringConcatenatingPerformance {

		public static void main(String[] args) {

			int N = 100000; 

			long start, end;

			
			start = System.currentTimeMillis();
			String s = "";
			for (int i = 0; i < N; i++) {
				s = s + "a";
			}
			end = System.currentTimeMillis();
			System.out.println("Time taken by String is: " + (end - start) + " ms");

			start = System.currentTimeMillis();
			StringBuilder strBuilder = new StringBuilder();
			for (int i = 0; i < N; i++) {
				strBuilder.append("a");
			}
			end = System.currentTimeMillis();
			System.out.println("Time taken by StringBuilder is: " + (end - start) + " ms");

			start = System.currentTimeMillis();
			StringBuffer strBuffer = new StringBuffer();
			for (int i = 0; i < N; i++) {
				strBuffer.append("a");
			}
			end = System.currentTimeMillis();
			System.out.println("Time taken by StringBuffer is: " + (end - start) + " ms");
		}
	}


