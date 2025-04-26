// best time to buy and sell the stocks
// leetcode 121
public class Stocks {
    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            } else if(price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] Prices = {7,1,5,3,6,4};
        System.out.println("best time to buy and sell the stocks is : "+maxProfit(Prices));
    }
    
}
