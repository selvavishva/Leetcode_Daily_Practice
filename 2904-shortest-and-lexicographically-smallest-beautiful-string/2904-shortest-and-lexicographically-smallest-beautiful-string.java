class Solution {

    public String shortestBeautifulSubstring(String s, int k) {

        String s1="";

        for(int i=0;i<s.length();i++){

            int count=0;

            for(int j=i;j<s.length();j++){

                if(s.charAt(j)=='1'){
                    count++;
                }

                if(count==k){

                    String sub=s.substring(i,j+1);

                    if(s1.equals("") ||
                       sub.length()<s1.length() ||
                       (sub.length()==s1.length() && sub.compareTo(s1)<0)){

                        s1=sub;
                    }

                    break;
                }
            }
        }

        return s1;
    }
}