//package String;
//
//public class ReadNCharsGiveRead4 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//	
//	public int read(char[] buf, int n) {
//        int result = 0;
//        char[] _buf = new char[4];
//        
//        while(true)
//        {
//        	int l = read4(_buf);
//        	
//        	if(l == 0)
//        		break;
//        	
//        	l = Math.min(l, n-result);
//        	for(int i=0;i<l;i++)
//        	{
//        		buf[result++] = _buf[i];
//        	}
//        }
//        
//        return result;
//    }
//
//}
