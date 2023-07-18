class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int flag=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                flag++;
            else
            {
                product=product*nums[i];
            }
        }
        int arr[]=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(flag>1)
                arr[i]=0;
            else if(flag==1 && nums[i]!=0)
                arr[i]=0;
            else if(flag==0)
                arr[i]=product/nums[i];
            else
                arr[i]=product;
        }
        return arr;
    }
}