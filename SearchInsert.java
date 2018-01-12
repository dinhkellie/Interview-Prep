//https://leetcode.com/problems/search-insert-position/description/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int mid = 0;
        int high = nums.length; // high = 4
        for (int i = 0; i < nums.length; i++) {
            mid = low + ((high-low)/2); // mid = 2, 3, 3
            
            if (mid > nums.length-1 && nums.length != 1) {
                return nums.length;
            }
            if (target == nums[mid]) { // 7 != 5, 7 != 6
                return mid;
            } else if (target < nums[mid]) { 
                high = mid; 
            } else { // 7 > 5, 7 > 6
                low = mid; // low = 2, 3 
            }
        }
        if (target > nums[low]) {
            return high;
        } else {
            return low;
        }
    }
}
