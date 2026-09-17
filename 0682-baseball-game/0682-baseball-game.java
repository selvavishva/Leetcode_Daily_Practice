class Solution {
    public int calPoints(String[] op) {
       int size=0;
      int[] score=new int[op.length];
        for(int i=0;i<op.length;i++){
            if(op[i].equals("C")){
             size--;
            }else if(op[i].equals("D")){
                score[size]=score[size-1]*2;
                size++;
            }else if(op[i].equals("+")){
                score[size]=score[size-1]+score[size-2];
                size++;
            }
            else{
                score[size]=Integer.parseInt(op[i]);
                size++;
            }
           
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+score[i];
        }
        return sum;
    }
}