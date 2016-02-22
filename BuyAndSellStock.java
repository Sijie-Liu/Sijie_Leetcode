//package Array;
//
//public class BuyAndSellStock {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//		
//	public int maxProfit(int[] prices) {
//		
//		if(prices.length == 0)
//			return 0;
//        int max = Integer.MIN_VALUE;
//        int len = prices.length;
//        int currentMin = prices[0];
//        
//        for(int i=0;i<len;i++)
//        {
//        	currentMin = Math.min(currentMin, prices[i]);
//        	max = Math.max(max, prices[i]-currentMin);
//        }
//        
//        return max;
//        
//    }
//	
//
//}
