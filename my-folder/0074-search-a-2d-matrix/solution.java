class Solution {
    private boolean binarySearch(int[] nums, int target) {
        // Get the length of the array
        int n = nums.length;

        // Initialize low and high pointers
        int low = 0, high = n - 1;

        // Perform binary search
        while (low <= high) {
            // Calculate the middle index
            int mid = (low + high) / 2;

            // If the middle element is the target, return true
            if (nums[mid] == target)
                return true;

            // If target is greater, search in the right half
            else if (target > nums[mid])
                low = mid + 1;

            // Otherwise, search in the left half
            else
                high = mid - 1;
        }

        // Return false if target is not found
        return false;
    }
    public boolean searchMatrix(int[][] mat, int target) {
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            if(mat[i][0]<=target && mat[i][m-1]>=target){
                return binarySearch(mat[i], target);
            }
        }
       
        return false;
    }
}
