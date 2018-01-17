//https://leetcode.com/problems/search-insert-position/description/

class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int mid = 0;
        int high = nums.length;
        for (int i = 0; i < nums.length; i++) {
            mid = low + ((high-low)/2);
            
            if (mid > nums.length-1 && nums.length != 1) {
                return nums.length;
            }
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) { 
                high = mid; 
            } else { // 7 > 5, 7 > 6
                low = mid;
            }
        }
        if (target > nums[low]) {
            return high;
        } else {
            return low;
        }
    }
}
