package eddy;

public class NumberofIslands {

	static char[][] grid_use = null;


	public int numIslands(char[][] grid) {
		int i,j;
		int count = 0;
		grid_use=grid;
		for(i=0;i<grid.length;i++)
		{
			for(j=0;j<grid[i].length;j++)
			{
				if(grid_use[i][j]=='1')
				{
					count++;
					count(i,j);
				}
			}
		}
		return count;
	}

	public void count(int i,int j)
	{

		grid_use[i][j]='0';
		if(i!=0&&grid_use[i-1][j]=='1')
		{
			count(i-1,j);
		}
		if(i!=grid_use.length-1&&grid_use[i+1][j]=='1')
		{
			count(i+1,j);
		}
		if(j!=0&&grid_use[i][j-1]=='1')
		{
			count(i,j-1);
		}
		if(j!=grid_use[i].length-1&&grid_use[i][j+1]=='1')
		{
			count(i,j+1);
		}

	}
}
