//package Array;
//
//import java.util.ArrayList;
//
//public class SetMatrixZeroes {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public void setZeroes(int[][] matrix) {
//		ArrayList<Integer> row = new ArrayList<Integer>();
//		ArrayList<Integer> column = new ArrayList<Integer>();
//		for(int i=0;i<matrix.length;i++)
//		{
//			for(int j=0;j<matrix[0].length;j++)
//			{
//				if(matrix[i][j] == 0)
//				{
//					if(!row.contains(i))
//						row.add(i);
//					if(!column.contains(j))
//						column.add(j);
//				}
//			}
//		}
//		
//		for(int i=0;i<matrix.length;i++)
//		{
//			for(int j=0;j<matrix[0].length;j++)
//			{
//				if(row.contains(i)||column.contains(j))
//					matrix[i][j] = 0;
//			}
//		}
//    }
//}
