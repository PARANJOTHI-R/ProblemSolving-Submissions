class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm =  new HashMap<>();
        int l=0;
        int maxlen=Integer.MIN_VALUE;
        for(int r=0;r<s.length();r++){
            char curr=s.charAt(r);
            hm.put(curr,hm.getOrDefault(curr,0)+1);
            while(hm.get(curr)>1){
                hm.put(s.charAt(l),hm.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen==Integer.MIN_VALUE?0:maxlen;
    }
}