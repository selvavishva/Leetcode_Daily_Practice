class Solution {
    public int minBitFlips(int start, int goal) {
       int count=0;
        int x=start^goal;
        while(x>0){
         if((x&1)==1) count++;
          x=x>>1;
        }
        return count;
    }
}