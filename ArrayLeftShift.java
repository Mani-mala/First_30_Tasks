import java.util.Scanner;
public class ArrayLeftShift 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        int[][] arrmatrix = new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
            arrmatrix[i][j]=input.nextInt();
            }
        }
        // print array
        System.out.println("Matrix array : ");
        for (int[] row : arrmatrix) 
        {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        // left shift  
        System.out.println("Left shifted array : ");
              
        for(int i=0;i<rows;i++)
        {
            int firstelement=arrmatrix[i][0];
            for(int j=0;j<cols-1;j++)
            {                
                System.out.print(arrmatrix[i][j+1] + " ");                 
            }  
            System.out.print(firstelement); 
            System.out.println();       
        }
        input.close();    
    }

}


