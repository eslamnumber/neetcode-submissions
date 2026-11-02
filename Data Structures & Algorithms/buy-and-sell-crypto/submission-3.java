class Solution {
          public int maxProfit(int[] prices) {
            int minPrice = prices[0];
            int maxP = 0;
           for(int price:prices){
                maxP = Math.max(maxP,price-minPrice);
                minPrice=Math.min(minPrice,price);
           }
           return maxP;
        }

}
