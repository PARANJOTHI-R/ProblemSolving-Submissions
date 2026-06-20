class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prefixM[]=new int[n];
        prefixM[0]=1; //its 1 since no element before it to multiply
        for(int i=1;i<nums.length;i++){
            prefixM[i]=prefixM[i-1]*nums[i-1];
        }
        int suffix=1;
        int ans[] =new int[n];
        for(int i=n-1;i>=0;i--){
            ans[i]=suffix*prefixM[i];// prefixMul * suffixMul for each i 
            suffix=suffix*nums[i]; 
        }
        return ans;
    }
}  
