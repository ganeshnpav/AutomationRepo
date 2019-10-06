package arrays;

public class twodimensionalarray {

	public static void main(String[] args) 
	{
      String[][] data=new String[5][2];
      
      //row 1
      data[0][0]="Username";
      data[0][1]="Password";
      data[1][0]="Username1";
      data[1][1]="Password1";
      data[2][0]="Username2";
      data[2][1]="Password2";
      data[3][0]="Username3";
      data[3][1]="Password3";
      data[4][0]="Username4";
      data[4][1]="Password4";
      
      for(int r=0;r<data.length;r++)
		{
			for(int c=0;c<data[r].length;c++)
			{
				System.out.print(data[r][c]+" ");
			}
		     System.out.println();
		     System.out.println();
		     
		}
      
	}

}
