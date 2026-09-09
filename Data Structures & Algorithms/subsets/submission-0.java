class Solution {
    public void func(int nums[],List<List<Integer>>ans,List<Integer>curr,int idx){
        ans.add(new ArrayList<>(curr));

        for(int i=idx;i<nums.length;i++){
            curr.add(nums[i]);

            func(nums,ans,curr,i+1);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
         func(nums,ans,new ArrayList<>(),0);
        return ans;
    }
}
