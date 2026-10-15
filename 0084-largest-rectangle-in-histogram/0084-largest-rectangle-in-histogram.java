class Solution {
    public int largestRectangleArea(int[] arr) {
        int []nse=new int[arr.length];
        int []pse=new int[arr.length];
        Stack <Integer>  st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            nse[i]=arr.length;
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()) nse[i]=st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=0;i<arr.length;i++){
            pse[i]=-1;
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()) pse[i]=st.peek();
            st.push(i);
        }
        int maxArea=0;
        for(int i=0;i<arr.length;i++){
            int width=nse[i]-pse[i]-1;
            int height=arr[i];
            int area=width*height;
            maxArea=Math.max(area,maxArea);
        }
        return maxArea;
    }
}