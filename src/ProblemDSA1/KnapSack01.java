package ProblemDSA1;

import java.util.Arrays;

/*
Given budget of user and cost and happiness value of N
items of the desired product Compute max happiness value

We have to ask to the interviewer whether it is 0/1 problem
or fraction one
 */
public class KnapSack01 {
    public static void main(String[] args) {
        int[] price = new int[]{110, 180, 50, 120, 100};
        int[] happiness = new int[]{39, 57, 13, 44, 24};
        int budget = 300;

        //answer should be here 101

        /*
        sorting by max Happiness price will work only
if the items can be broken fractional knapsack
NOTE Always clarify the req

         */

        System.out.println(new KnapSack01().findMax(price, happiness, price.length - 1, budget));

        System.out.println("with Memoization");

        int[][] memo = new int[price.length][budget+1];

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        System.out.println(new KnapSack01().findMaxwithMemo(price, happiness, price.length - 1, budget, memo));

    }


    private int findMax(int[] price, int[] happiness, int index, int budget) {
        if (index < 0) return 0;
        if (budget < 0) return 0;
        if (budget == 0) return 0;

        if (price[index] > budget) {
            return findMax(price, happiness, index - 1, budget);
        } else {
            int include = happiness[index] + findMax(price, happiness, index - 1, budget - price[index]);
            int exclude = findMax(price, happiness, index - 1, budget);
            return Math.max(include, exclude);
        }


    }

    private int findMaxwithMemo(int[] price, int[] happiness, int index, int budget, int[][] memo) {

        if (index < 0) return 0;
        if (budget < 0) return 0;
        if (budget == 0) return 0;

        if(memo[index][budget]!=-1) return memo[index][budget];

        if (price[index] > budget) {
            return findMaxwithMemo(price, happiness, index - 1, budget, memo);
        } else {
            int include=happiness[index]+findMaxwithMemo(price, happiness, index - 1, budget-price[index], memo);
            int exclude=findMaxwithMemo(price, happiness, index - 1, budget,memo);
            memo[index][budget]=Math.max(include,exclude);
            return  memo[index][budget];
        }
    }

}
