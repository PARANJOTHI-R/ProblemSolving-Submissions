class Solution {
    public boolean helperFn(int index,int[]arr){
        int start=index;
        int end=index+arr.length;
        int big=arr[index];
        for(int i=start;i<end;i++){
            if(arr[i%arr.length]<big) return false;
            big=arr[i%arr.length];
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