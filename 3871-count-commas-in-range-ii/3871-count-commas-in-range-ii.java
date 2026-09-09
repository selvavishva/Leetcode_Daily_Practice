class Solution {
    public long countCommas(long n) {
        long count=0;
        long num=1000;
        while(num<=n){
            count=count+n-num+1;
            num=num*1000;
        }
        return count;
    }
}

 // while(n>0){
        //     if(n>=1000){
        //         count++;
        //     }
        //     if(n>=1000000){
        //         count++;
        //     }
        //     if(n>=1000000000) count++;
        //     n--;
       // }