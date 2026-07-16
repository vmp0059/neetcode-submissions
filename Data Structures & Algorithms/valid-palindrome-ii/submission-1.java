class Solution {
    public boolean validPalindrome(String s) {
          s = s.toLowerCase();
        int n=s.length();
        int i=0;
        int j=n-1;
        int op=0;
        while(i<=j){
           if(s.charAt(i)==s.charAt(j)){
            i++;
            j--;
           }else{
            return palindrome(s,i+1,j)|| palindrome(s,i,j-1);
           }
        }
       return true;
    }

    public boolean palindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i) != s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}