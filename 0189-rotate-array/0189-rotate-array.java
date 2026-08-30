class Solution {
    public void reverse(int[]arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int p) {
        //best soltion without extra space
        //reverse entire array->reverse first k elements->then reverse n-k elements
        int len=nums.length;
        int k=p%len;
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);

    }
}