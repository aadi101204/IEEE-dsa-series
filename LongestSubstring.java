class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0,k,max=0;
        HashSet<Character> unique=new HashSet<Character>();
        while(end<s.length()){
            if(!unique.contains(s.charAt(end))){
            unique.add(s.charAt(end));
            end++;
            max=Math.max(unique.size(),max);}
            else{
                unique.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}
