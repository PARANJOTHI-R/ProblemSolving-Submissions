class Solution {
    public void sortColors(int[] nums) {
        int tr0=0,tr1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) tr0++;
            else if(nums[i]==1) tr1++;
        }
        for(int i=0;i<nums.length;i++){
            if(tr0!=0){
                nums[i]=0;
                tr0--;
            }else if(tr1!=0){
                nums[i]=1;
                tr1--;
            }else nums[i]=2;
        }
       
    }
}