class Solution {
    public boolean search(int[] nums, int target) {
        HashSet<Integer> set=new HashSet<>();
        for (int val:nums){
            set.add(val);
        }
        if(set.contains(target)){
            return true;
        }
        return false;
    }
}