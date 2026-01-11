package com.runtimeAnalysisAlgorithms.comparing_data_structure_searching;
import java.util.HashSet;
import java.util.TreeSet;
public class SearchingComparison {



	    public static void main(String[] args) {

	        int N = 100000;   
	        int searchElement = N - 1;

	        int[] arr = new int[N];
	        for (int i = 0; i < N; i++) {
	            arr[i] = i;
	        }

	        HashSet<Integer> hashSet = new HashSet<>();
	        for (int i = 0; i < N; i++) {
	            hashSet.add(i);
	        }

	        TreeSet<Integer> treeSet = new TreeSet<>();
	        for (int i = 0; i < N; i++) {
	            treeSet.add(i);
	        }

	        long start, end;

	        // using Array Search 
	        start = System.currentTimeMillis();
	        boolean found = false;
	        for (int i = 0; i < N; i++) {
	            if (arr[i] == searchElement) {
	                found = true;
	                break;
	            }
	        }
	        end = System.currentTimeMillis();
	        System.out.println("Array Search time take is: " + (end - start) + " ms");

	        //using  HashSet Search 
	        start = System.currentTimeMillis();
	        hashSet.contains(searchElement);
	        end = System.currentTimeMillis();
	        System.out.println("HashSet Search time take is : " + (end - start) + " ms");

	        //using TreeSet Search 
	        start = System.currentTimeMillis();
	        treeSet.contains(searchElement);
	        end = System.currentTimeMillis();
	        System.out.println("TreeSet Search time take is: " + (end - start) + " ms");
	    }
	}


