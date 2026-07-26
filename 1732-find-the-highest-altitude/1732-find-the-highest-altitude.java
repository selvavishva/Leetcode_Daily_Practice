class Solution {
    public int largestAltitude(int[] gain) {
        int st=0;
        int high=0;
        for(int i=0;i<gain.length;i++){
           st=st+gain[i];
            if(st>high){
            high=st;
            }
        }
        return high;
    }
}