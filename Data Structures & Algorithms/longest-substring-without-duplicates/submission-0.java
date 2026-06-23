class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm= new HashMap<>();
        int l=0,max=Integer.MIN_VALUE;
        for(int r=0;r<s.length();r++){
            char curr=s.charAt(r);
            hm.put(curr,hm.getOrDefault(curr,0)+1);
            while(hm.get(curr)>1){
                hm.put(s.charAt(l),hm.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
            max=Math.max(r-l+1,max);
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}
