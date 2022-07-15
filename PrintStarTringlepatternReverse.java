package anudeep;
import java.util.Scanner;
public class PrintStarTringlepatternReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt();
        //Outer loop for number of Rows
        for(int i=n;i>0;i--)
        {
        	//printing'*'in each column.
           for(int j=0;j<i;j++)
           {
               System.out.print("*");
           }
           System.out.println();
        }
     }
}


