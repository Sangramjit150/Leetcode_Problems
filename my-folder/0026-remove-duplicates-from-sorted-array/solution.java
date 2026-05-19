class Solution {
    public int removeDuplicates(int[] arr) {
        int k=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                arr[k++]=arr[i];
            }
        }
        return k;
    }
}
