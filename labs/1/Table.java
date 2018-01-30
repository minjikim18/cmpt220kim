
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[][] table = new int[4][3];
		for(int i = 0; i < table.length; i++)
		{
			for(int j = 0; j < table[i].length; j++)
			{
				table[i][j] = (i + 1)^(j + 1);
				System.out.print(table[i][j]);
			}
			//System.out.println();
			System.out.println(" Run: " + i);
		}
		*/
		
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= 3; j++)
			{
				System.out.print((int)Math.pow(i, j) + "     ");
			}
			System.out.println();
		}
		
	}

}
