//package Array;
//
//public class PlusOne {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr = {9,9};
//		int[] result = plusOne(arr);
//		
//		for(int i: result)
//			System.out.print(i);
//	}
//	
//	public static int[] plusOne(int[] digits) {
//		
//        if(digits[digits.length-1]==9)
//        {
//            if(digits.length==1)
//            {
//            	int[] dd = {1,0};
//            	 return dd;
//            }
//               
//            else
//            {
//            	int i = i=digits.length-1;
//                for( ;i>=0;i--)
//                {
//                    if(digits[i]!=9)
//                        break;
//                }
//                if(i==-1)
//                {
//                    int[] d = new int[digits.length+1];
//                    d[0]=1;
//                    return d;
//                }
//                else
//                {
//                    digits[i]++;
//                    for(int j=i+1;j<digits.length;j++)
//                        digits[j]=0;
//                }
//            }
//        }else
//        {
//            digits[digits.length-1]++;
//            
//        }
//        return digits;
//    }
//
//}
