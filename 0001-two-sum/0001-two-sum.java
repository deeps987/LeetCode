class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Arrays.sort(nums);
        int[] arr=new int[2];
        int start = 0; int end = nums.length-1;
        for(int i=0;i<nums.length -1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1]= j;
                    break;
                }
            }
        }
        return arr;
    }
}