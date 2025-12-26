class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1; // adjust for Java array indexing

        if(target > nums[high]) {      // if target is greater than last element
            return high + 1;
        }

        while(low <= high){
            int mid = (low + high) / 2;

            if(nums[mid] == target){
                return mid;
            }
            else if(target < nums[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;   // insert position
    }
}
   
    
