
Input :  1  2  3  4
         5  6  7  8
         9  10 11 12
Output : 1 5 9 10 6 2 3 7 11 12 8 4

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int numRows = scan.nextInt();
	    int numColumns = scan.nextInt();
	    System.out.println("Number of Rows : "+numRows);
        System.out.println("Number of Columns : "+numColumns);
	    int[][] input = new int[numRows][numColumns];
	    System.out.println("Enter elements of array : ");
	    for(int i =0 ; i < numRows; i++)
	    {
	        for(int j =0;j<numColumns;j++)
	        {
	            input[i][j] = scan.nextInt();
	            System.out.println("input "+ i + j +" = "+input[i][j]);
	            
	        }
	    }
	   
	   for(int i =0 ; i < numColumns;i++)
	   {
	       if(i%2==0)
	       {
	           for(int j = 0; j< numRows;j++)
	           {
	               System.out.print(input[j][i]+ " ");
	           }
	       }
	       
	       else
	       {
            for(int j = numRows-1; j>=0;j--)
	           {
	               System.out.print(input[j][i]+ " ");
	           } 
	       }
	   }

	}
}