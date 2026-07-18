class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int ret=1;
        for(int i=min;i>=1;i--){
            if(min%i==0 && max%i==0){
                ret=i;
                break;}
        }
        return ret;
    }
}