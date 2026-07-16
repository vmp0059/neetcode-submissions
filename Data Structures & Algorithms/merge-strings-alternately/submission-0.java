class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();

        int i=0;
        int j=0;
        StringBuilder str=new StringBuilder();
        while(i<n && j<m){
            str.append(word1.charAt(i));
            str.append(word2.charAt(j));
            i++;
            j++;
        }

        if(i<n){
            while(i<n){
                 str.append(word1.charAt(i));
                 i++;
            }
        }

        if(j<m){
            while(j<m){
                str.append(word2.charAt(j));
                j++;
            }
        }
        return str.toString();
    }
}