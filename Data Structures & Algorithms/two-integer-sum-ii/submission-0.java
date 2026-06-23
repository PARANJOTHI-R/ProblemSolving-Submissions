class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[]arr=new int[2];
        for(int i=0;i<numbers.length;i++){
            if(hm.containsKey(target-numbers[i])){
                arr[0]=hm.get(target-numbers[i]);
                arr[1]=i+1;
            }
            hm.put(numbers[i],i+1);
        }
        return arr; 
    }
}
