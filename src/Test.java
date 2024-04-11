import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Test {
    public static void main(String []args){
        HashMap<Integer, Integer> sumMap = new HashMap<>();
           ArrayList<Integer> A=new ArrayList<>(Arrays.asList(-14,-9,12,7,-12,-4,7,25,-5,48,33,-49,36,-31,-48,36,36,17,13,-47,-39,37,-20,35,38,26,-40,-43,36,-48,-33,-30,6,-28,11,27,22,18,-21,-11,-50,34,-21,44,-25,17,34,-12,14,26,30));
        int B=16;

           int count=0;
        int currentSum = 0;

        for (int end = 0; end < A.size(); end++) {
            currentSum += A.get(end);



            //this will only run when we have whole array is sum equal to B
            if (currentSum == B) {
                count++;


            }

            if (sumMap.containsKey(currentSum - B)) {

                count++;

            }

            sumMap.put(currentSum, end);

            System.out.println(" i --> "+A.get(end) +" currentSum --> "+currentSum +" currentSum -B  --> "+(currentSum - B) +" Count -->"+count);
            //System.out.println(sumMap);
            System.out.println();

        }

        System.out.println(count);
    }

}
