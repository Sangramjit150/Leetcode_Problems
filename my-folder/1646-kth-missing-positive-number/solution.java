class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0,high=arr.length-1;
        int missing=0;
        while(low<=high){
            int mid=(low+high)/2;
            missing=arr[mid]-mid;
            if(missing<=k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return low+k; 
    }
}
