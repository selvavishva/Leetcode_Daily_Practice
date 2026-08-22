class Solution {
    public boolean checkDivisibility(int n) {
       int og=n;
        int sum1=0;
        int sum2=1;
        while(n>0){
          int d=n%10; 
         sum1=sum1+d;
         sum2=sum2*d;

        n=n/10;
      
        }
        return og%(sum1+sum2)==0;

    }
}