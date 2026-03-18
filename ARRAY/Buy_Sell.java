class Buy_Sell{

    public static int  profit(int price[]){
        int maxP = 0;
        int buyPrice = Integer.MAX_VALUE; 
        for(int i=0 ; i<price.length ; i++){
            if(buyPrice < price[i]){ // proft
                int profit = price[i] - buyPrice; // today's profit
                maxP = Math.max(maxP , profit); // max profit
            }
            else {
                buyPrice = price[i];
            }
        }
        return maxP;
    }
    public static void main(String args[]){
        int price[] = {7,1,5,3,6,4};
        int result = profit(price);
        System.out.println("Max Profit: " + result);
    }
}