//package Array;
//
//public class BuyAndSellStock2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int[] prices = {1,2,1,2,0,1};
//		int profit = maxProfit(prices);
//		System.out.println(profit);
//	}
//
//	public static int maxProfit(int[] prices) {
//
//		if(prices.length == 1)
//			return 0;
//		int lowPoint = 0;
//		int highPoint = 0;
//		int len = prices.length;
//
//		int lowRecord = -1;
//		int highRecord = -1;
//		
//		int profit = 0;
//		
//		for (int i = 0; i < len; i++) {
//
//			if(i==0)
//			{
//				if(prices[0]<prices[1])
//					lowPoint = 0;
//				if(prices[0]>prices[1])
//					highPoint = 0;
//			}
//			else if(i == len-1)
//			{
//				if(prices[i]<prices[i-1])
//					lowPoint = i;
//				if(prices[i]>prices[i-1])
//					highPoint = i;
//			}
//			else
//			{
//				if (prices[i + 1] >= prices[i] && prices[i-1]>=prices[i])
//					lowPoint = i;
//				if (prices[i + 1] <= prices[i] && prices[i-1]<=prices[i])
//					highPoint = i;
//			}
//			
//			if(lowPoint<highPoint && lowPoint!=lowRecord && highPoint!=highRecord)
//			{
//				profit+=prices[highPoint] - prices[lowPoint];
//				lowRecord = lowPoint;
//				highRecord = highPoint;
//			}
//
//		}
//		
//		return profit;
//	}
//
//}
