class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int merge[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                merge[k++]=nums1[i++];
            }
            else if(nums1[i]>nums2[j]){
                merge[k++]=nums2[j++];
            }
        }
        while(i<n){
            merge[k++]=nums1[i++];
        }
        while(j<m){
            merge[k++]=nums2[j++];
        }
        int len=merge.length;
        double median=0.0;
        
        if(len%2==0){
            int ind1=len/2;
            int ind2=ind1-1;
            median=(merge[ind1]+merge[ind2])/2.0;
        }
        else{
            int ind1=len/2;
            median=merge[ind1];

        }
        return median;
    }
}
