class Solution {
    public int minSwaps(int[] arr) {
        List<Integer>li=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            li.add(arr[i]);
        }
        for(int i=0;i<n;i++){
            li.add(arr[i]);
        }
        int ones=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                ones++;
            }
        }
        int l=0,r=ones;
        int maxOnes=0,countOnes=0;
        for(int i=0;i<li.size();i++){
            if(i>=ones && li.get(i-ones)==1)
                countOnes--;
            if(li.get(i)==1)
                countOnes++;
            maxOnes=Math.max(maxOnes,countOnes);
        }
        return ones-maxOnes;
    }
}
