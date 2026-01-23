package sortingAlgorithms.medwarehouseapp;

public class MergeSort {
	 public static void mergeSort(Medicine[] array, int low, int high) {
		 if (low >= high) {
		        return; 
		    }
	            int mid = (low + high) / 2;

	            mergeSort(array, low, mid);
	            mergeSort(array, mid + 1, high);

	            merge(array, low, mid, high);
	        }
	    

	    private static void merge(Medicine[] array, int low, int mid, int high) {

	    
	    	int left = low;
			int right = mid + 1;
			Medicine[] temp = new Medicine[high - low + 1];
			int index = 0;
	    while (left <= mid && right <= high) {
			if (array[left].compareTo( array[right])<=0) {
				temp[index++] = array[left++];
			} else {
				temp[index++] = array[right++];

			}
		}
		// store the left behind element of 1st part
		while (left <= mid) {
			temp[index++] = array[left++];
		}
        //store the left behind element of 2nd part
		while (right <= high) {
			temp[index++] = array[right++];
		}

		for (int i = 0; i < temp.length; i++) {
			array[low + i] = temp[i];
		}
		
	}

public static void printRankList(Medicine[] arr, String text) {
	System.out.println( text +":");
for( int i=0;i<arr.length;i++) {
	Medicine s= arr[i];
	
System.out.printf("%-15s %-27s %s%n", (i+1), s.getDate(), s.getName());

	
}
System.out.println("=====================================================");
}
}
