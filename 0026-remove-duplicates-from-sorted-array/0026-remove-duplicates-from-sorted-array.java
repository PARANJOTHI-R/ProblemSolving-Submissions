class Solution {
    public int removeDuplicates(int[] nums) {
        int track=0;
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.getOrDefault(nums[i],-1)==-1){
                nums[track++]=nums[i];
            }
            hm.put(nums[i],1);
        }
        return track;
    }
}