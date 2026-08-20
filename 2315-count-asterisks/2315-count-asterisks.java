class Solution {
    public int countAsterisks(String s) {
       boolean in=false;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
          
          if(ch=='|')
          in=!in;
            if(ch=='*'&&!in)
            count++;
        }
        return count;
    }
}