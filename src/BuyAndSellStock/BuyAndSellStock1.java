package BuyAndSellStock;

public class BuyAndSellStock1 {
    public static void main(String[] args) {

    }
}



class Solution {
    public int maxProfit(int[] prices) {

        // 7 1 5 3 6 4
        //
        int []maxAux=new int[prices.length];

        int len=prices.length;
        int maxValue=0;
        int maxProfit=0;

        for(int i=len-1;i>=0;i--){

            if(prices[i]>maxValue){

                maxValue=prices[i];
            }
            maxAux[i]=maxValue;
        }

        for(int i:maxAux){
            System.out.println(i);
        }

        for(int i=0;i<len-1;i++){

            if(prices[i]<maxAux[i+1]){

                int temp=maxAux[i+1]-prices[i];

                if(temp>maxProfit){

                    maxProfit=temp;
                }

            }
        }


        return maxProfit;
    }
}