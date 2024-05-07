package ProblemDSA1;

import java.util.HashMap;

/*
you are given a set of non negative integers and a
target sum The task is to determine whether there
exists a subset of given set whose sum is equal to
target sum


Time complexity to generate all the subset O(N*2^N)
 */
public class TargetSum {
    public static void main(String[] args) {
        int []arr=new int[]{3,34,4,12,5,2};
        int []target=new int[]{1,9,10,14};
        HashMap<String,Boolean> hashMap=new HashMap<>();
        for(int sum:target)
        System.out.println(new TargetSum().subSet(arr.length-1,sum,arr));

        System.out.println("Memomization code");
        for(int sum:target)
            System.out.println(new TargetSum().subSetwithMemo(arr.length-1,sum,arr,hashMap));
    }

    //O(2^N)
    public  boolean subSet(int index,int target,int arr[]){
        if(index<0) return false;
        if(target==0) return true;
        if(target<0) return false;

      boolean include=  subSet(index-1,target-arr[index],arr);
       boolean exclude= subSet(index-1,target,arr);
       return include||exclude;
    }

    //O(N)
    public  boolean subSetwithMemo(int index,int target,int arr[],HashMap<String,Boolean> hashMap){
        if(index<0) return false;
        if(target==0) return true;
        if(target<0) return false;
        String key=index+"-"+target;

        if(hashMap.containsKey(key)) return hashMap.get(key);

        boolean include=  subSet(index-1,target-arr[index],arr);
        boolean exclude= subSet(index-1,target,arr);

        hashMap.put(key,include||exclude);
        return include||exclude;
    }
}
