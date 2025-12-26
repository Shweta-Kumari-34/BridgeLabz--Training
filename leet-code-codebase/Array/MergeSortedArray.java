class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
   
        int p = m + n;
        int j = 0;

        // Insert elements of nums2 into nums1 starting from index m
        for (int i = m; i < p; i++) {
            nums1[i] = nums2[j];
            j++;
        }

        // Sort the final merged array
        Arrays.sort(nums1);
    }
}
 