package day4_task;
import java.util.*;
public class StudentApp {
	public static void main(String[] args) {
		Student ob=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String n=sc.next();
		System.out.print("Enter your class: ");
		int c=sc.nextInt();
		System.out.print("Enter your marks in dbms : ");
		int db=sc.nextInt();
		System.out.print("Enter your marks in javascript : ");
		int js=sc.nextInt();
		System.out.print("Enter your marks in java : ");
		int j=sc.nextInt();
		System.out.print("Enter your marks in html : ");
		int ht=sc.nextInt();
		ob.setName(n);
		ob.setStandard(c);
		ob.setDbms(db);
		ob.setJavascript(js);
		ob.setJava(j);
		ob.setHtml(ht);
		System.out.println("Details : ");
		System.out.println("Name : "+ob.getName());
		System.out.println("Class : "+ob.getStandard());
		System.out.println("Marks : "+ob.calculateMarks());
		System.out.println("Fees : "+ob.calculateFees());
		
		
	}
}
