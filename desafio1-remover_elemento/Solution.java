class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        int f = nums.length -1;

        for(int i=0;i<nums.length;i++){
            if (nums[i]==val){
                k--;
            }
        }
        for (int i=0;i<nums.length;i++){
            for (int j=f-1;j>=0;j--){

                if (nums[j] == val){

                    int a = nums[j];
                    nums[j] = nums[f];
                    nums[f] = a;
                    f--;
                }
            }

        }

        return k;
    }
}