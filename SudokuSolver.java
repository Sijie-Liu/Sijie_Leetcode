//package HashTable;
//
//import java.util.HashMap;
//
//public class SudokuSolver {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		char[][] board = new char[9][9];
//		for(int i=0;i<9;i++)
//		{
//			for(int j=0;j<9;j++)
//				board[i][j] = '.';
//		}
//		
//		board[0][0] = '5';
//		board[0][1] = '3';
//		board[0][4] = '7';
//		
//		board[1][0] = '6';
//		board[1][3] = '1';
//		board[1][4] = '9';
//		board[1][5] = '5';
//		
//		board[2][1] = '9';
//		board[2][2] = '8';
//		board[2][7] = '6';
//		
//		board[3][0] = '8';
//		board[3][4] = '6';
//		board[3][8] = '3';
//		
//		board[4][0] = '4';
//		board[4][3] = '8';
//		board[4][5] = '3';
//		board[4][8] = '1';
//		
//		board[5][0] = '7';
//		board[5][4] = '2';
//		board[5][8] = '6';
//		
//		board[6][1] = '6';
//		board[6][6] = '2';
//		board[6][7] = '8';
//		
//		board[7][3] = '4';
//		board[7][4] = '1';
//		board[7][5] = '9';
//		board[7][8] = '5';
//		
//		board[8][4] = '8';
//		board[8][7] = '7';
//		board[8][8] = '9';
//		
//		
//		solveSudoku(board);
//		for(int i=0;i<9;i++)
//		{
//			for(int j=0;j<9;j++)
//				System.out.print(board[i][j]+" ");
//			System.out.println();
//		}
//	}
//	
//	public static void solveSudoku(char[][] board) {
//        solve(board);
//    }
//	
//	public static boolean solve(char[][] board)
//	{
//		for(int row = 0;row<9;row++)
//		{
//			for(int col = 0;col<9;col++)
//			{
//				if(board[row][col] == '.')
//				{
//					for(int i=1;i<=9;i++)
//					{
//						board[row][col] = (char) ('0'+i);
//						if(check(board, row, col))
//						{
//							if(solve(board))
//								return true;
//						}
//						
//						board[row][col] = '.';
//					}
//					
//					return false;
//				}
//			}
//		}
//		
//		return true;
//	}
//	
//	public static boolean check(char[][] board, int x, int y)
//	{
//		//check row col subgrid
//		int gridx = 0;
//		int gridy=0;
//		
//		if(x>=0 && x<=2)
//			gridx = 0;
//		else if(x>=3 && x<=5)
//			gridx = 3;
//		else gridx = 6;
//		
//		if(y>=0 && y<=2)
//			gridy=0;
//		else if(y>=3 && y<=5)
//			gridy = 3;
//		else gridy = 6;
//		
//		for(int i=0;i<9;i++)
//		{
//			//check row
//			if(board[x][i]==board[x][y] && i!=y)
//				return false;
//			
//			//check col
//			if(board[i][y]==board[x][y] && i!=x)
//				return false;
//		}
//		
//		//check sub grid
//		for(int i=gridx;i<gridx+3;i++)
//		{
//			for(int j=gridy;j<gridy+3;j++)
//			{
//				if(board[i][j] == board[x][y] && x!=i && y!=j)
//					return false;
//			}
//		}
//		
//		return true;
//		
//	}
//
//}
