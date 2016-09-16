package mario;

public class mario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*int size = 5;
		for (int row = 1; row <= size; row++)
		{
			System.out.println();
		}
		for (int col = 1; col <= size; col++)
		{
		    System.out.println();	
		}
			
			
			if (row == 1 && col == 4)
			{
				System.out.println("#");
			}
			else if (row == 2 && col >= 3)
			{
				System.out.println("#");
			}
			else if(row == 3 && col >= 2)
			{
				System.out.println("#");
			}
			else
			{
				System.out.println("");
			}
		}
		*/

		int size=5;
		for(int row =1; row<=size; row++){
			if(row !=1){
				System.out.println();
			}
			for(int col=1; col<=size; col++){
				if(col-row>=0)
				{
					System.out.print('#');
				}
				else
				{
					System.out.print(' ');
				}

			}
		}

	}

		}


	
	
	
	
	
	
	}}


	
