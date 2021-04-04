package day4_task;
import java.util.*;
public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i, j, row;
		System.out.print("Enter the no. of rows: ");
		row=sc.nextInt(); 
		for(i=0; i<row; i++)   
		{     
			for(j=0; j<=i; j++)   
			{   
				System.out.print("* ");   
			}    
			System.out.println();   
		}   
	}
}
