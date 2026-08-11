class Solution {
    public boolean isAlienSorted(String[] word, String order) {
       int state[]=new int[26];
       for(int i=0;i<order.length();i++){
        state[order.charAt(i)-'a']=i;
       }

       for(int i=0;i<word.length-1;i++){
        String s1=word[i];
        String s2=word[i+1];

        int j=0;
        while(j<s1.length() && j< s2.length()){
            if(s1.charAt(j)!=s2.charAt(j)){
                if(state[s1.charAt(j)-'a']>state[s2.charAt(j)-'a']){
                    return false;
                }
                break;
            }
            j++;
        }
           if(j == s2.length() && s1.length() > s2.length()){
                return false;
            }
       }
       return true;
    }
}