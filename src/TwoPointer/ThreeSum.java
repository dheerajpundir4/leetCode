package TwoPointer;

import java.util.*;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.



 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Arrays.sort

        Arrays.sort(nums);

        Set<List<Integer>> finalList  = new HashSet<>();

        if (nums == null || nums.length < 3)
            return new ArrayList<>(finalList);

        for(int current=0;current<nums.length-2;current++){
            int left=current+1;
            int right=nums.length-1;

            while(left<right){
                int sum=nums[current]+nums[left]+nums[right];

                if(sum==0){
                    finalList.add(Arrays.asList(nums[current], nums[left], nums[right]));
                    left++;
                    right--;
                }
                else if (sum < 0)
                    left++;
                else
                    right--;
            }

        }


        return new ArrayList<>(finalList);


    }
}