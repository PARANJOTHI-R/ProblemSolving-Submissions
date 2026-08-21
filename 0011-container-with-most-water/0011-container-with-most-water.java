class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=Integer.MIN_VALUE;
        while(left<right){
            int width=right-left;
            int heigh=Math.min(height[left],height[right]);
            System.out.println(width*heigh);
            max=Math.max(max,width*heigh);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}