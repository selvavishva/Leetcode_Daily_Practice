class Solution {

    public String reverseParentheses(String s) {
        while(s.contains("(")){
            int st=s.lastIndexOf("(");
            int end=s.indexOf(")",st);

            String rev="";
            for(int i=end-1;i>st;i--){
                rev=rev+s.charAt(i);
            }
            s=s.substring(0,st)+rev+s.substring(end+1);
        }
       return s;
    }
}