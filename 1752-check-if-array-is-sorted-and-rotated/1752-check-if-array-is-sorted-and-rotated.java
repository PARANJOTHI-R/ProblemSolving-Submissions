class Solution {
    public boolean helperFn(int index,int[]arr){
        int len=arr.length,big=arr[index];
        for(int i=index;i<index+len;i++){
            if(arr[i%len]<big) return false;
            big=arr[i%len];
        }
        return true;
    }
    public boolean check(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(helperFn(i,nums)) return true;
        }
        return false;
    }
}