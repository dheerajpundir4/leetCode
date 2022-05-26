public class SubArrayProblem {
    public static void main(String[] args) {
        Solution sol=new Solution();
    }
}


class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=-10000;
        int curSum=0;

        for(int i=0;i<nums.length;i++){
            curSum=curSum+nums[i];

            if(curSum>maxSum){
                maxSum=curSum;

            }

            if(curSum<0){
                curSum=0;
            }
        }

        return maxSum;
    }
}