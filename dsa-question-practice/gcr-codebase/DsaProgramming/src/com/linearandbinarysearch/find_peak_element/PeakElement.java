package com.linearandbinarysearch.find_peak_element;

public class PeakElement {

	    public static int findPeakElement(int[] array) {
	        int left = 0;
	        int right = array.length - 1;

	        while (left < right) {
	        	 int mid = left + (right - left) / 2;

	             if (array[mid] > array[mid + 1]) {
	                 right = mid;     // peak is on left side or at mid
	             } else {
	                 left = mid + 1;  // peak is on right side
	             }
	         }
	         return left; // peak index
	     }

	    public static void main(String[] args) {

	        int[] array = {1, 36, 20, 4, 1, 0, 20, 88};

	        int index = findPeakElement(array);

	        System.out.println("Peak element present at index: " + index);
	        System.out.println("The value of peak element is: " + array[index]);
	    }
	}


