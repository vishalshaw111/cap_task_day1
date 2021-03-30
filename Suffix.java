package p1;
import java.util.Scanner;
public class Suffix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date:");
		int date=sc.nextInt();
		if(date<=31)
		{
			if(date == 1 || date == 21 || date == 31)
		    {
		        System.out.println(date+"st ");
		    }
		    else if(date == 2 || date == 22)
		    {
		    	System.out.println(date+"nd ");
		    }
		    else if(date == 3 || date == 23)
		    {
		    	System.out.println(date+"rd ");
		    }
		    else
		    {
		    	System.out.println(date+"th ");
		    }    

		}
		else
		{
			System.out.println("Wrong Date");
		}
	}
}
