//package Array;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class InsertInterval {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Interval> intervals = new ArrayList<Interval>();
//		intervals.add(new Interval(1,5));
//		//intervals.add(new Interval(6,8));
//		List<Interval> result = insert(intervals,new Interval(0,0));
//		
//		for(Interval i: result)
//		{
//			System.out.println("["+i.start+","+i.end+"]");
//		}
//	}
//	
//	public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
//		
//		
//		if(intervals.size()<=0)
//		{
//			intervals.add(newInterval);
//			return intervals;
//		}
//		
//		int start = newInterval.start;  // the left edge of the newInterval
//		int end = newInterval.end;	// the right edge of the newInterval
//        
//		int new_start=newInterval.start;	// the left edge of the new interval
//		int new_end=newInterval.end;	// the right edge of the new interval
//		
//		int index_start =intervals.size() ;	// the first node that to be deleted
//		int index_end =intervals.size();	// the last node that to be deleted
//		
//		int i=0; 
//		
//		for(;i<intervals.size();i++)
//		{
//			Interval in = intervals.get(i);
//			int left = in.start;
//			int right = in.end;
//			if(left>= start)
//			{
//				new_start = start;
//				index_start = i;
//				break;
//			}
//			else if(right>=start)
//			{
//				new_start = left;
//				index_start = i;
//				break;
//			}
//		}
//		
//		for(;i<intervals.size();i++)
//		{
//			Interval in = intervals.get(i);
//			int left = in.start;
//			int right = in.end;
//			if(left>end)
//			{
//				new_end = end;
//				index_end = i;
//				break;
//			}
//			else if(right>=end)
//			{
//				new_end = right;
//				index_end = i+1;
//				break;
//			}
//		}
//		
//		Interval interval = new Interval(new_start,new_end);
//		if(index_start<intervals.size())
//		{
//			for(int k=index_start;k<index_end;k++)
//				intervals.remove(index_start);
//				
//		}
//		
//		intervals.add(index_start, interval);
//		
//		return intervals;
//    }
//
//}
