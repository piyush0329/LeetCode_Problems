class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength = -1;
        String test = "";
        if(s.isEmpty()){
            return 0;
        }
        int low = 0;
        for(int i =0; i<s.length(); i++){
             char c = s.charAt(i);
            if(s.indexOf(c,low)!=-1 && s.indexOf(c,low)<i ){
                low = s.indexOf(c,low)+1;
            }
            maxlength = Math.max(maxlength,i-low+1);
        }
        return maxlength;
    }
}