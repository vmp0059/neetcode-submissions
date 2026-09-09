class Solution {
    public void func(int nums[],List<List<Integer>>ans,List<Integer>list,int idx,int sum){
        if(sum==0){
            ans.add(new ArrayList<>(list));
            return;
        }

        if(sum<0 || idx==nums.length)return;
        list.add(nums[idx]);

        func(nums,ans,list,idx,sum-nums[idx]);
        list.remove(list.size()-1);
        func(nums,ans,list,idx+1,sum);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        func(nums,ans,new ArrayList<>(),0,target);
        return ans;
    }
}
