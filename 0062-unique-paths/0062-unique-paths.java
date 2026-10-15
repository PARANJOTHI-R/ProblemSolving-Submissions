class Solution {
    public int recFn(int m,int n,int [][]dp){
        if(m<0||n<0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(m==0 && n==0) return 1;
        int up= recFn(m-1,n,dp);
        int left=recFn(m,n-1,dp);
        return dp[m][n]=up+left;
    }
    public int uniquePaths(int m, int n) {
        int [][]dp= new int [m][n];
        for(int []arr:dp) Arrays.fill(arr,-1);
        return recFn(m-1,n-1,dp);
    }
}