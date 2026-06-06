class Solution {
    public long[] getDistances(int[] arr) {
        long[] ans = new long[arr.length];
        HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();

        // Step 1: store indices
        for(int i = 0 ; i < arr.length ; i++){
            map.computeIfAbsent(arr[i] , k-> new ArrayList<>()).add(i);
        }

        // Step 2: compute using prefix sum
        for(ArrayList<Integer> list : map.values()){
            int size = list.size();
            long prefix[] = new long[size];
            prefix[0] = list.get(0);

            for(int i= 1 ;i < size;i++){
                prefix[i] = prefix[i-1] + list.get(i);
            }

            for(int i = 0 ; i < size ;i++){
                int idx = list.get(i);

                long leftSum = (long)list.get(i) * i - (i>0 ? prefix[i-1] : 0);
                long rightSum = prefix[size-1] - prefix[i] - ((long)list.get(i) * (size-1-i));

                ans[idx] = leftSum + rightSum;
            }
        }

        return ans;
    }
}
