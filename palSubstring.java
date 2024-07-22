class Solution {
    String ans="";
    void expand(String a,int left,int right){
        while(left>=0 && right<a.length() && a.charAt(left)==a.charAt(right)){
            left--;
            right++;
        }
        if(ans.length()<right-left-1)
        ans=a.substring(left+1,right);
    }
    public String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
        for(int i=0;i<s.length();i++){
            expand(s,i,i);
            expand(s,i,i+1);
        }
        return ans;
    }
}
