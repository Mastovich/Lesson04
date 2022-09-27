package lt.lhu.unit04.main;

import java.util.Scanner;

public class Task040134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double ch;
		
		System.out.println("Please enter the price of the books");
				
		a = sc.nextDouble();
		System.out.println("Please enter the amount of money");
		
		b = sc.nextDouble();
				
		if(a == b) {
			System.out.println("Thank you");
		}else if(a < b) {
			ch = b - a;
			System.out.println("Take the change" + ch);
		}else {
			ch = a - b;
			System.out.println("Not enough" + ch);
		}
			
	}

}
