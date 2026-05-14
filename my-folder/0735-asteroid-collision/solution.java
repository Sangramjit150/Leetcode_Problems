class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        for(int asteroid:asteroids){
            boolean colided=false;
            while(!st.isEmpty() && st.peek()>0 && asteroid<0){
               if(Math.abs(asteroid)>st.peek()){
                st.pop();
                continue;
               }
                if(Math.abs(asteroid)==st.peek()){
                    st.pop();
                }
                colided=true;
                break;
            }
            if(!colided){
                st.push(asteroid);
            }

           
        }
        int ans[]=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i]=st.pop();
        }
            
         return ans;   
    }
}
