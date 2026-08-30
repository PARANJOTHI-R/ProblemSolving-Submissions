class Solution {
    public void moveZeroes(int[] nums) {
        int tr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[tr]=nums[i];
                if(nums.length!=1 && i!=tr)nums[i]=0;
                tr++;
            }
        }
    }
}