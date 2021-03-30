package p1;
import java.util.Scanner;
public class SalaryBreakup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your basic salary:");
		double salary=sc.nextDouble();
		double hra=0.0,da=0.0,tax=0.0;
		hra=0.4*salary;
		da=((hra+salary)*60)/100;
		if(salary<=200000)
			tax=0.0;
		else if(salary>200000 && salary<=600000)
			tax=0.1*salary;
		else
			tax=0.2*salary;
		System.out.println("HRA is "+hra);
		System.out.println("DA is "+da);
		System.out.println("TAX is "+tax);
	}
}
