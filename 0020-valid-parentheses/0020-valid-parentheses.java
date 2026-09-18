class Solution {
    public boolean isValid(String s) {

        while(s.contains("()") ||
              s.contains("[]") ||
              s.contains("{}")) {

            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }

        return s.length() == 0;
    }
}

//45 testcase pass 

// class Solution {

//     public boolean isValid(String s) {

//         boolean bool=false;

//         for(int i=0;i<s.length();i++){

//         if(s.charAt(i)=='(' || s.charAt(i)==')'){

//             return true;

//         }

//         if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)==')'||s.charAt(i)==']')

//         return false;

//         }

//         return false;

//     }

// }