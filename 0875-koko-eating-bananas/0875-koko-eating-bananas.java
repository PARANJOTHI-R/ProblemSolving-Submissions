class Solution {
    public int canEat(int []arr,int speed){
        int h=0;
        for(int i=0;i<arr.length;i++){
            h+=(arr[i]+speed-1)/speed;
        }
        return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int val:piles){
            low=Math.min(low,val);
            high=Math.max(high,val);
        }        
        while(low<high){
            int mid=low+(high-low)/2;
            if(canEat(piles,mid)>h){
                low=mid+1;
            }else{
                high=mid;
            }

        }
        return low;
    }
}