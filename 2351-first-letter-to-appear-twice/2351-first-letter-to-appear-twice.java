class Solution {
    public char repeatedCharacter(String s) {
        for(int i=0;i<s.length();i++){
           for(int j=i-1;j>=0;j--){
                char ch1=s.charAt(i);
                char ch2=s.charAt(j);
                if(ch1==ch2)
                 return ch1;
           }
        }
        return ' ';
    }
}