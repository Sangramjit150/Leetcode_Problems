class Solution {
    public int mostWordsFound(String[] sentences) {
    int maxLen=0;
    for(String curSen:sentences){
        int currlen=curSen.split(" ").length;
        if(maxLen<currlen)
            maxLen=currlen;
    }
    return maxLen;
}
}
