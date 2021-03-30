package p1;
import java.util.Scanner;
public class SumClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double english,java,database,springtools;
	    double totalMarks=0.0,avgMarks=0.0;
	    System.out.println("Enter english,java,database,springtools marks :");
	    english = sc.nextDouble();
	    java = sc.nextDouble();
	    database = sc.nextDouble();
	    springtools = sc.nextDouble();
	    totalMarks = english + java + database + springtools;
	    avgMarks = totalMarks/4;
	    System.out.println("Marks Scored out of 400 is "+ totalMarks);
	    System.out.println("Average Marks is "+ avgMarks);
	    
		
	}

}
