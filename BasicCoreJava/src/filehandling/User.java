package filehandling;

import java.io.IOException;

public class User {

	public static void main(String[] args) throws IOException {
		String filepath= System.getProperty("user.dir")+"\\src\\filehandling\\Testdata.xls";
        Xls_Reader X1=new Xls_Reader(filepath);
        System.out.println(X1.getColumnCount("Sheet1"));
        System.out.println(X1.getRowCount("Sheet1"));
        System.out.println(X1.getCellData("Sheet1",1 ,1 ));
        X1.setCellData("Sheet1", 1, 1," Rahul");
        
        
        int rows=X1.getRowCount("Sheet1");
        int cols=X1.getColumnCount("Sheet1");
        
        for(int r=1;r<=rows;r++)
        	
        {
        	for(int c=1;c<=cols;c++)
        	{
        		System.out.print(X1.getCellData("Sheet1", r, c)+" ");
        	}
        	System.out.println();
        }


	}

}
