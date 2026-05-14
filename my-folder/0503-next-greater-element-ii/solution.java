class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>st=new Stack<>();
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=2*n-1;i>=0;i--){
            int ind=i%n;
            int curr=nums[ind];
            while(!st.isEmpty() && st.peek()<=curr){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty()){
                    ans[ind]=-1;
                }
                else{
                    ans[ind]=st.peek();
                }
            }
            st.push(curr);
        }
        return ans;
    }
}
