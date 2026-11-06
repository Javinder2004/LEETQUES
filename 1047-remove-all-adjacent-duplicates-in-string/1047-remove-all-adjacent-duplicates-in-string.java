class Solution {
    public String removeDuplicates(String s) {
       String ans="";
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ans.length()>0 && ans.charAt(ans.length()-1)== ch){
            ans=ans.substring(0,ans.length()-1);
        } else {
            ans+=ch;
        }
       } 
       return ans;
    }
}