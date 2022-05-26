package UniqueNoOfOccurence;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNoOFOccurence {

    public static void main(String[] args) {

    }

}
class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();

        for(int num:arr){

            if(map.containsKey(num)){

                int value=map.get(num);
                value++;

                map.put(num,value);
            }
            else{

                map.put(num,1);
            }
        }

        System.out.println(map);

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){

            if(set.contains(entry.getValue())){

                return false;
            }
            set.add(entry.getValue());
        }

        return true;

    }
}