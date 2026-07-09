class Solution {
    public int help(String str1,String str2,int i,int j,int dp[][]){
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(str1.charAt(i)==str2.charAt(j)){
            return dp[i][j]= 1+help(str1,str2,i-1,j-1,dp);
        }
        return dp[i][j]=0+Math.max(help(str1,str2,i,j-1,dp),help(str1,str2,i-1,j,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
          int n=text1.length();
        int m=text2.length();
        int dp[][]=new int[n][m];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }

        return help(text1,text2,n-1,m-1,dp);
    }
}
