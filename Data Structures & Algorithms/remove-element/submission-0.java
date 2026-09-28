class Solution {
    public int removeElement(int[] nums, int val) {
        int ans[] = new int[nums.length];
        int k = 0;
        int j = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != val){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}