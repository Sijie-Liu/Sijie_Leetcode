//package Array;
//
//public class BuyAndSellStock3 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr = {3,4,5,6,1,2,3,1,2};
//		System.out.println(maxProfit(arr));
//	}
//	
//	public static int maxProfit(int[] prices) {
//		if(prices.length <=0) return 0;
//        int len = prices.length;
//        int max = Integer.MIN_VALUE;
//        
//        int[] maxLeft = new int[len];
//        int[] maxRight = new int[len];
//        maxLeft[0] = 0;
//        maxRight[len-1] = 0;
//        
//        int lowPoint = prices[0];
//        
//        for(int i=1;i<len;i++)
//        {
//        	if(prices[i]<lowPoint) lowPoint = prices[i];
//        	maxLeft[i] = Math.max(maxLeft[i-1],prices[i]-lowPoint);
//        }
//        
//        int highPoint = prices[len-1];
//        for(int i=len-2;i>=0;i--)
//        {
//        	if(highPoint<prices[i]) highPoint = prices[i];
//        	maxRight[i] = Math.max(maxRight[i+1], highPoint-prices[i]);
//        }
//        
//        for(int i=0;i<len;i++)
//        	max = Math.max(max, maxLeft[i]+maxRight[i]);
//        return max;
//        
//    }
//	
//	
//
//}
