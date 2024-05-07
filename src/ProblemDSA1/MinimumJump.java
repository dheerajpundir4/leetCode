package ProblemDSA1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
Minimum jumps to reach end Amazon
you are given A[N] You are initially positioned at
nums[0]
Each A[i] represents the max length of forward jump
from index i
Return min no of jumps to reach nums[n-1]
NOTE you can always reach end

A = 2 3 1 1 4 answer is 2

A= 100 1 2 3 4 answer is 1

 */
public class MinimumJump {
   class Pair{
        public int index;
        public int jump;
        Pair(int index,int jump){
            this.index=index;
            this.jump=jump;
        }
    }
    public static void main(String[] args) {
        int []arr=new int[]{2,3,1,1,4};

        System.out.println(new MinimumJump().findJump(arr));
        System.out.println(new MinimumJump().findJumpwithVisited(arr));

    }


    //isme visited nahi ye
    private int findJump(int[] arr) {
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(0,0));
        int n=arr.length;
        while(queue.size()!=0){
            Pair pair=queue.remove();
            int index=pair.index;
            int jump=pair.jump;
            if(index>=n-1) return jump;
            for(int j=1;j<=Math.min(arr[index],n);j++){
                int newIndex=index+j;
                    queue.add(new Pair(newIndex,jump+1));
            }

        }
        return -1;
    }

    //isme visited q lagaya he ye check karna he
    private int findJumpwithVisited(int[] arr) {
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(0,0));

        int n=arr.length;
        boolean[] visited=new boolean[n];
        visited[0]=true;
        Arrays.fill(visited,false);




        while(queue.size()!=0){
            Pair pair=queue.remove();
            int index=pair.index;
            int jump=pair.jump;

            if(index>=n-1) return jump;

            for(int j=1;j<=Math.min(arr[index],n);j++){
                int newIndex=index+j;
                if(!visited[newIndex]){
                    visited[newIndex]=true;
                    queue.add(new Pair(newIndex,jump+1));
                }

            }

        }
        return -1;
    }
}
