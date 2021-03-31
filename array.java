package day2;
import java.util.Scanner;
public class array {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int len=sc.nextInt();
		int array1[] = new int[len];
		int array2[] = new int[len];
		System.out.println("Enter values in the array");
		for(int i=0;i<len;i++) {
			array1[i] = sc.nextInt();
		}
		
		array2 = distinctElements(array1,array2,len);
		printArray(array2);
	}
	private static int[] distinctElements(int array1[],int array2[],int len)
	{
		int in = 0;
		for(int i=0;i<len;i++)
		{
			boolean flag = false;
			for(int j=0;j<i;j++)
			{
				if(array1[i] == array1[j])
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				array2[in] = array1[i];
				in++;
			}
		}
		return array2;
	}
	private static void printArray(int array2[])
	{
		System.out.println("New Array :");
		for(int i=0;i<array2.length;i++) {
			if(array2[i] == 0)
				break;
			System.out.print(array2[i] + " ");
		}
	}

}