class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String>map=new HashMap<>();
        List<String>li=new ArrayList<>();
       int n=names.length;
        for(int i=0;i<names.length;i++){
          
            map.put(heights[i],names[i]);
        }
          Arrays.sort(heights);
          for(int i=0;i<names.length/2;i++){
            int temp=heights[i];
            heights[i]=heights[n-1-i];
            heights[n-1-i]=temp;
          }
          for(int i=0;i<names.length;i++){
            names[i]=map.get(heights[i]);
          }
          return names;
        }
    }

