class Solution {
    public String reverseVowels(String s) {
        String  rev="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
             rev=rev+ch;
        }
        String ans="";
        int j=rev.length()-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                ans=ans+rev.charAt(j);
                j--;
            }else{
                ans=ans+ch;
            }
        }
        return ans;
    }
}