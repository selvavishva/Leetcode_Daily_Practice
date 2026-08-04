class Solution {
    public long removeZeros(long n) {
        long zero=1;
        long ans=0;
        while(n>0){
            long d=n%10;
            if(d!=0){
             ans=d*zero+ans;
             zero=zero*10;
            }
            n=n/10;
    }
    return ans;
}
}