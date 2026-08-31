class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm  = new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            hm.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++){
            if(hm.containsKey(nums2[i])) min=Math.min(min,nums2[i]);
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}
