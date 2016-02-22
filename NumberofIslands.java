package DFS;

public class NumberofIslands {

	public int numIslands(char[][] grid) {
		if (grid.length <= 0) {
			return 0;
		} else if (grid[0].length <= 0) {
			return 0;
		} else {

			int result = 0;
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					if (grid[i][j] == '1') {
						result++;
						set1ToX(grid, i, j);
					}
				}
			}
			return result;
		}

	}

	public void set1ToX(char[][] grid, int i, int j) {
		int iMax = grid.length;
		int jMax = grid[0].length;

		if (i < 0 || i >= grid.length || j < 0 || j >= jMax) {
			return;
		}

		if (grid[i][j] == '1') {
			grid[i][j] = 'X';

			set1ToX(grid, i + 1, j);
			set1ToX(grid, i - 1, j);
			set1ToX(grid, i, j + 1);
			set1ToX(grid, i, j - 1);
		}
	}
}
