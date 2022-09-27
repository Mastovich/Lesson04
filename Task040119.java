package lt.lhu.unit04.main;

import java.util.Scanner;

public class Task040119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum;
		
		Scanner sc1 = new Scanner(System.in);
		double a;
		System.out.println("enter a number of a");
		
		a = sc1.nextDouble();
				
		Scanner sc2 = new Scanner(System.in);
		double b;
		System.out.println("enter a number of b");
		
		b = sc2.nextDouble();
				
		Scanner sc3 = new Scanner(System.in);
		double c;
		System.out.println("enter a number of c");
		
		c = sc3.nextDouble();
		
		if ((a >= 0) & (b >= 0) & (c >= 0)) {
						
			sum = a + b + c;
			
			System.out.println("sum = " +sum);
		} else if ((a >= 0) & (b >= 0)) {
			
			sum = a + b;
			
			System.out.println("sum = " +sum);
		} else if ((a >= 0) & (c >= 0)) {
			
			sum = a + c;
			
			System.out.println("sum = " +sum);
		} else if ((b >= 0) & (c >= 0)) {
			
			sum = b + c;
			
			System.out.println("sum = " +sum);
		} else {
			System.out.println("There are no negative numbers among a, b and c");
		}
	}

}
